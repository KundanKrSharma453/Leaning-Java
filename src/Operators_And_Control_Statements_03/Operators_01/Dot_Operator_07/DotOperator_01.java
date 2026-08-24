package Operators_And_Control_Statements_03.Operators_01.Dot_Operator_07;

public class DotOperator_01 {

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Ravi";      // dot operator: accessing a field
        s.display();           // dot operator: calling a method
        System.out.println("Static access: " + Student.school); // dot operator: static member
    }
}

class Student {
    String name;
    static String school = "Java Public School";

    void display() {
        System.out.println("Name: " + name);
    }
}
