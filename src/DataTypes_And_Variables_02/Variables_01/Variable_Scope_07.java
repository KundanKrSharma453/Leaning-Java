package DataTypes_And_Variables_02.Variables_01;

public class Variable_Scope_07 {

    public static void main(String[] args) {
        int outer = 100;
        {
            int inner = 200; // scoped only to this block
            System.out.println("Inner: " + inner + ", Outer: " + outer);
        }
        System.out.println("Outer still visible: " + outer);
        // inner is not accessible here
    }
}
