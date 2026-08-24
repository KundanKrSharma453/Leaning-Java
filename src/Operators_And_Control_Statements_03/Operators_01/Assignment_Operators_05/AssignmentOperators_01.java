package Operators_And_Control_Statements_03.Operators_01.Assignment_Operators_05;

public class AssignmentOperators_01 {

    public static void main(String[] args) {
        int a = 10;
        a += 5; System.out.println("a += 5 -> " + a);
        a -= 3; System.out.println("a -= 3 -> " + a);
        a *= 2; System.out.println("a *= 2 -> " + a);
        a /= 4; System.out.println("a /= 4 -> " + a);
        a %= 3; System.out.println("a %= 3 -> " + a);

        int b = 6;
        b &= 3; System.out.println("b &= 3 -> " + b);
        b |= 8; System.out.println("b |= 8 -> " + b);
        b ^= 1; System.out.println("b ^= 1 -> " + b);
    }
}
