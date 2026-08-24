package Operators_And_Control_Statements_03.Control_Statements_02.Conditional_Statements_01;

public class SwitchExpression_01 {

    public static void main(String[] args) {
        int day = 6;

        // Java 21 modern switch expression with arrow labels and yield
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> {
                String result = "Weekend";
                yield result;
            }
            default -> "Invalid day";
        };

        System.out.println(dayType);
    }
}
