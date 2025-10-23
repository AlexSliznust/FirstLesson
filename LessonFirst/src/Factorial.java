public class Factorial {
    public static int getFactorial(int number) throws FactorialException {
        int result = 1;
        if(number < 1) throw new FactorialException("Number must be greater than 0", number);
        for (int i = 1; i <= number ; i++) {
            result *= i;
            }
        return result;
    }
}
