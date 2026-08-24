package Operators_And_Control_Statements_03.Control_Statements_02.Conditional_Statements_01;

public class Nested_If_01 {

    public static void main(String[] args) {
        int age = 20;
        boolean hasId = true;

        if (age >= 18) {
            if (hasId) {
                System.out.println("Entry allowed");
            } else {
                System.out.println("ID required");
            }
        } else {
            System.out.println("Entry denied: underage");
        }
    }
}
