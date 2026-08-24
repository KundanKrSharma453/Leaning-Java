package Operators_And_Control_Statements_03.Control_Statements_02.Conditional_Statements_01;

public class If_ElseIf_Statement_01 {

    public static void main(String[] args) {
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }
    }
}
