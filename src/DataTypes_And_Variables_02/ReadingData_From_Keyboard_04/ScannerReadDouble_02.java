package DataTypes_And_Variables_02.ReadingData_From_Keyboard_04;

import java.util.Scanner;

public class ScannerReadDouble_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        double value = sc.nextDouble();
        System.out.println("You entered: " + value);
        sc.close();
    }
}
