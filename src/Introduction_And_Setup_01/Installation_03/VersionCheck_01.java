package Introduction_And_Setup_01.Installation_03;

public class VersionCheck_01 {

    public static void main(String[] args) {
        System.out.println("Java Runtime Version: " + System.getProperty("java.version"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Verify installation using: java -version and javac -version");
    }
}
