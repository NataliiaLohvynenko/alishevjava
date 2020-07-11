package testing;

public class myMath {
    public static double devide(int number1, int number2){
        if(number2==0){
            throw new ArithmeticException("Cant devide by 0");
        }

        return number1/number2;

    }
}
