package Operators_And_Control_Statements_03.Operators_01.Unary_Operators_01;

public class UnaryOperators_01 {

    public static void main(String[] args) {
        int a = 5;
        System.out.println("+a = " + (+a));
        System.out.println("-a = " + (-a));

        int b = 5;
        System.out.println("Pre-increment ++b = " + (++b));
        System.out.println("Post-increment b++ = " + (b++));
        System.out.println("After post-increment, b = " + b);

        int c = 5;
        System.out.println("Pre-decrement --c = " + (--c));
        System.out.println("Post-decrement c-- = " + (c--));
        System.out.println("After post-decrement, c = " + c);

        boolean flag = true;
        System.out.println("Logical NOT !flag = " + (!flag));

        int d = 5;
        System.out.println("Bitwise complement ~d = " + (~d));
    }
}
