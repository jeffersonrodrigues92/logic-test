public class Fibonacci {

    public static void main(String[] args) {

        getFibonnacci();
    }

    public static void getFibonnacci(){

        int firstLastNumber = 0;
        int secondLastNumber = 0;
        int fibonacciNumber = 0;

        for(int i =0; i < 100; i++){


            fibonacciNumber = firstLastNumber + secondLastNumber;

            if(i <= 1){
                firstLastNumber = 0;
                secondLastNumber = 1;
            } else{
                fibonacciNumber = firstLastNumber + secondLastNumber;
                firstLastNumber = secondLastNumber;
                secondLastNumber = fibonacciNumber;
            }

            System.out.println(fibonacciNumber);
        };
    }

}
