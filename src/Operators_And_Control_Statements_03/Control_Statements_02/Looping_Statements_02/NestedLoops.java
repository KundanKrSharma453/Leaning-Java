package Operators_And_Control_Statements_03.Control_Statements_02.Looping_Statements_02;

public class NestedLoops {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "  ");
            }
            System.out.println();
        }
    }
}
