package DataTypes_And_Variables_02.Java_Comments_03;

public class Comments_01 {

    public static void main(String[] args) {
        // This is a single-line comment
        /* This is a
           multi-line comment */
        int result = add(5, 3);
        System.out.println("Result: " + result);
    }

    /**
     * Adds two integers.
     * @param a first number
     * @param b second number
     * @return the sum of a and b
     */
    static int add(int a, int b) {
        return a + b;
    }
}
