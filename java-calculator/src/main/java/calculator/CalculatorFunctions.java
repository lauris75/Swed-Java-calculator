package calculator;

public class CalculatorFunctions {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double power(double num1, double num2) {
        double result = num1;
        for (int i = 1; i < num2; i++) {
            result = result * num1;
        }
        return 0;
    }

    public static double square(double num) {
        return num*num;
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double oneDividedBy(double num) {
        return 1/num;
    }

    public static double log(double num) {
        return Math.log(num);
    }

    public static double rate(double num) {
        return num/100;
    }

    public static double abs(double num) {
        if(num < 0) return num * -1;
        return num;
    }
}
