package Introduction_And_Setup_01.JVM_Architecture_10;

public class JVMInfo_01 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available processors: " + runtime.availableProcessors());
        System.out.println("Max heap memory (bytes): " + runtime.maxMemory());
        System.out.println("Free heap memory (bytes): " + runtime.freeMemory());
    }
}
