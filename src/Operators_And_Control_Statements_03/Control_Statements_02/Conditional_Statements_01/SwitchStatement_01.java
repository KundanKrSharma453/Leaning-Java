package Operators_And_Control_Statements_03.Control_Statements_02.Conditional_Statements_01;

public class SwitchStatement_01 {

    public static void main(String[] args) {
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Another day");
        }
    }
}
