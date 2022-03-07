import java.util.*;

public class FirstNonRepeatedCharacter {

    public static void main(String[] args) {

        initialize("firrstapps ttif  ");
    }

    public static void initialize(String word) {

        word = Utils.removeEmptySpace(word);
        Character character = getFirstNonRepeatedCharacter(word);

        System.out.println(character);
    }

    public static Character getFirstNonRepeatedCharacter(String word) {

        Map<Character, Integer> nonRepeatedCharacterList = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {
            nonRepeatedCharacterList.put(word.charAt(i), 0);
        }

        for (Character character : nonRepeatedCharacterList.keySet()) {

            for (int i = 0; i < word.length(); i++) {
                if (character == word.charAt(i)){
                    nonRepeatedCharacterList.put(character,  nonRepeatedCharacterList.get(word.charAt(i)) + 1);
                }
            }
        }

        return nonRepeatedCharacterList.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue() == 1).findFirst().get().getKey();
    }
}

class Utils {

    private static final String TARGET = " ";
    private static final String REPLACEMENT = "";

    public static String removeEmptySpace(String word){
        return word.replace(TARGET, REPLACEMENT);

    }
}
