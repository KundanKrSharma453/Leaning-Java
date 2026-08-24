package Operators_And_Control_Statements_03.Control_Statements_02.Looping_Statements_02;

public class DoWhileLoop {

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);

        // do-while always runs at least once, even if the condition starts false
        int j = 10;
        do {
            System.out.println("This still runs once, j = " + j);
        } while (j < 5);
    }
}
