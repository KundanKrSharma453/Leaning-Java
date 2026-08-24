package DataTypes_And_Variables_02.ReadingData_From_Keyboard_04;

import java.util.Scanner;

public class ScannerReadInt_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int value = sc.nextInt();
        System.out.println("You entered: " + value);
        sc.close();
    }
}
