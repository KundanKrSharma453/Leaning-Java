package DataTypes_And_Variables_02.Coding_Standards_05;

public class Coding_Standards_01 {

    public static void main(String[] args) {
        int studentCount = 30;              // camelCase variable
        printStudentCount(studentCount);       // camelCase method call
    }

    static final int MAX_STUDENTS = 60; // UPPER_SNAKE_CASE constant

    static void printStudentCount(int count) { // camelCase method
        System.out.println("Students: " + count + " / " + MAX_STUDENTS);
    }
}
