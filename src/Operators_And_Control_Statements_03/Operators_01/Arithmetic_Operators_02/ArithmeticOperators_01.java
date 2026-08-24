package Operators_And_Control_Statements_03.Operators_01.Arithmetic_Operators_02;

public class ArithmeticOperators_01 {

    public static void main(String[] args) {
        int a = 17, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b (integer division) = " + (a / b));
        System.out.println("a % b (remainder) = " + (a % b));

        double x = 17.0, y = 5.0;
        System.out.println("x / y (floating-point division) = " + (x / y));

        System.out.println("Precedence example: 10 + 5 * 2 = " + (10 + 5 * 2));
    }
}
