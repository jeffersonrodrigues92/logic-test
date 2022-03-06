public class PrimeNumbers {

    public static void main(String[] args) {
        getPrimeNumbers(337);
    }

    private static void getPrimeNumbers (int number){

        if(number <= 1) {
            System.out.println(String.valueOf(number).concat(" is not a prime number"));
        }

        for(int i = 1; i < number; i++){
                int divider = i + 1;
                if (number % divider == 0) {
                    if(divider == number) {
                        System.out.println(String.valueOf(number).concat(" is a prime number"));
                        break;
                    }
                    System.out.println(String.valueOf(number).concat(" is not a prime number"));
                    break;
                }
            }
        }
    }
