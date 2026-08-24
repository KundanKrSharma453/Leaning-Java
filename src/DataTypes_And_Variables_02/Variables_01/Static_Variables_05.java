package DataTypes_And_Variables_02.Variables_01;

public class Static_Variables_05 {

    public static void main(String[] args) {
        Counter_Static.total++;
        Counter_Static.total++;
        System.out.println("Total (shared across all objects): " + Counter_Static.total);
    }
}

class Counter_Static {
    static int total = 0; // one copy shared by the whole class
}
