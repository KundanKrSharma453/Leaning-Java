package Operators_And_Control_Statements_03.Control_Statements_02.Transfer_Statements_03;

public class BreakStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exits the loop entirely
            }
            System.out.println("i = " + i);
        }
    }
}
