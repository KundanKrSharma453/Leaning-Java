package DataTypes_And_Variables_02.Variables_01;

public class Instance_Variables_04 {

    public static void main(String[] args) {
        Counter_Instance c1 = new Counter_Instance();
        Counter_Instance c2 = new Counter_Instance();
        c1.count = 5;
        c2.count = 10; // independent copy per object
        System.out.println("c1.count = " + c1.count + ", c2.count = " + c2.count);
    }
}

class Counter_Instance {
    int count; // instance variable, default value 0
}
