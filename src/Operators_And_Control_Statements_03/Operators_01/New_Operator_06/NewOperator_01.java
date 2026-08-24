package Operators_And_Control_Statements_03.Operators_01.New_Operator_06;

public class NewOperator_01 {

    public static void main(String[] args) {
        Student s = new Student("Asha"); // 'new' allocates the object on the heap
        s.display();
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student: " + name);
    }
}
