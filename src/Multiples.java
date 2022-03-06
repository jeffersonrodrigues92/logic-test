public class Multiples {


    public static void main(String[] args) {

        getMultiplesThreeAndFive();

    }


    private static void getMultiplesThreeAndFive(){

        final int MULTIPLE_THREE = 3;
        final int MULTIPLE_FIVE = 5;


        for(int i = 0; i < 100; i++){

            String message = "";

            if (i % MULTIPLE_THREE == 0 && i % MULTIPLE_FIVE == 0){
                System.out.println(message.concat(String.valueOf(i)).concat("\tFizzBuzz"));

            } else if (i % MULTIPLE_THREE == 0){
                System.out.println(message.concat(String.valueOf(i)).concat("\tFizz"));

            } else if (i % MULTIPLE_FIVE == 0){
                System.out.println(message.concat(String.valueOf(i)).concat("\tBuzz"));
            }


        }
    }
}
