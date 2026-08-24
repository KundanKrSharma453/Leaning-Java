package DataTypes_And_Variables_02.ReadingData_From_Keyboard_04;

import java.util.Scanner;

public class ScannerReadLine_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine(); // reads the entire line
        System.out.println("You entered: " + line);
        sc.close();
    }
}
