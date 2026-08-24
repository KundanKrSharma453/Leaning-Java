package Introduction_And_Setup_01.Features_02;

public class Platform_Independence_Demo_01 {

    public static void main(String[] args) {
        System.out.println("OS Name: " + System.getProperty("os.name"));
        System.out.println("This same .class file can run on any OS with a compatible JVM.");
    }
}
