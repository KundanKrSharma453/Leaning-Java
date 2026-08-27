package CollectionsFramework_08.List_01.ArrayList_01;

import java.util.ArrayList;

public class Demo_01 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(100);
        al.add(200);
        al.add("Rani");
        al.add('K');
        al.add("Raju");
        al.add(1000.05);

        System.out.println(al);
        System.out.println("Size before removal: "+al.size());
        al.remove(0);
        System.out.println("Size after removal: "+al.size());
        System.out.println(al);
    }
}
