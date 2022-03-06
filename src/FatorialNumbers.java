public class FatorialNumbers {


    public static void main(String[] args) {

        getFactorialNumber(10);
    }


    private static Integer getFactorialNumber(Integer number){

        Integer factorial = 1;

        for(int i = 1; i<= number; i++){
            factorial = factorial * i;
            System.out.println("Factorial number is "+ factorial);
        }

        return factorial;
    }
}
