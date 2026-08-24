package Introduction_And_Setup_01.Introduction_01;

public class MainMethodDemonstration_03 {

    public static void main(String[] args) {
        // Execution always starts here: public static void main(String[] args)
        System.out.println("Program execution started from main()");
        greet();
    }

    static void greet() {
        System.out.println("Hello from a helper method!");
    }
}
