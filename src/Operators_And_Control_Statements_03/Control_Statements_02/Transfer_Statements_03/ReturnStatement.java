package Operators_And_Control_Statements_03.Control_Statements_02.Transfer_Statements_03;

public class ReturnStatement {

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(4, 7));
    }

    static int sum(int a, int b) {
        return a + b; // exits the method immediately, returning a value
    }
}
