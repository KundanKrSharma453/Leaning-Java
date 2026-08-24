package Operators_And_Control_Statements_03.Operators_01.Logical_Operators_04;

public class LogicalOperators_01 {

    public static void main(String[] args) {
        boolean p = true, q = false;
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        // Short-circuit evaluation: right side is never evaluated when not needed
        int[] arr = null;
        if (arr != null && arr.length > 0) {
            System.out.println("Array has elements");
        } else {
            System.out.println("Short-circuit avoided a NullPointerException");
        }
    }
}
