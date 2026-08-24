package DataTypes_And_Variables_02.ReadingData_From_Keyboard_04;

import java.util.Scanner;

public class ScannerReadString_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single word: ");
        String word = sc.next(); // reads a single token (stops at whitespace)
        System.out.println("You entered: " + word);
        sc.close();
    }
}
