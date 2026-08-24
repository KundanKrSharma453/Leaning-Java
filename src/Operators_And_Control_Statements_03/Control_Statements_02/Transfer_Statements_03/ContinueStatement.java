package Operators_And_Control_Statements_03.Control_Statements_02.Transfer_Statements_03;

public class ContinueStatement {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips only this iteration
            }
            System.out.println("i = " + i);
        }
    }
}
