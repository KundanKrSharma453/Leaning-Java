package DataTypes_And_Variables_02.ReadingData_From_Keyboard_04;

import java.util.Scanner;

public class ScannerNewlineIssue_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consumes the leftover newline left by nextInt()
        System.out.print("Enter your full name: ");
        String name = sc.nextLine(); // now correctly reads the full name
        System.out.println("Name: " + name + ", Age: " + age);
        sc.close();
    }
}
