package Introduction_And_Setup_01.Translators_09;

public class Translators_01 {

    public static void main(String[] args) {
        long start = System.nanoTime();
        long total = 0;
        for (int i = 0; i < 1_000_000; i++) {
            total += i; // repeated execution -> JIT may optimize this hot loop
        }
        long end = System.nanoTime();
        System.out.println("Total: " + total);
        System.out.println("Time (ns): " + (end - start));
    }
}
