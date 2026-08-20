package Introduction_01;
// package = used to organize related Java classes.
// Introduction_01 is the name of the package.
// It helps Java organize and manage classes.

// ---------------------------------------------------------

public class MyFirstProgram_01 {
// public = Access Modifier.
// It means this class can be accessed from other classes/packages.
//
// class = keyword used to create a class.
// MyFirstProgram_01 = name of the class.
//
// The class name should normally start with a capital letter.
// Example: MyFirstProgram_01

// ---------------------------------------------------------

    public static void main(String[] args) {
// public = Access Modifier.
// The JVM needs to access the main() method from outside the class.
//
// static = The main() method belongs to the class,
// so the JVM can call it without creating an object of the class.
//
// void = The method does not return any value.
//
// main = Special method name.
// The JVM looks for this method as the starting point of the program.
//
// String[] args = An array of String values.
// It is used to receive command-line arguments.
//
// In simple words:
// This is the starting point from where Java begins executing the program.

// ---------------------------------------------------------

        System.out.println("Hello world!");
// System = A predefined Java class.
//
// out = A predefined output stream inside System.
//
// println() = A method used to print something on the console
// and then move the cursor to the next line.
//
// "Hello world!" = String value that we want to print.
//
// ; = Terminates the Java statement.
//
// Output:
// Hello world!

// ---------------------------------------------------------

    }
// Closing } = closes the main() method.

}
// Closing } = closes the MyFirstProgram_01 class.