package DataTypes_And_Variables_02.Reserved_Words_06;

public class Reserved_Words_01 {

    public static void main(String[] args) {
        // 'public', 'class', 'static', 'void', 'int' are all reserved words used below
        final int MAX = 10; // 'final' is a reserved word (modifier)
        for (int i = 0; i < MAX; i++) { // 'for' is a reserved word (control flow)
            if (i == 3) {
                break; // 'break' is a reserved word (transfer)
            }
        }
        System.out.println("Reserved words used above: public, class, static, void, int, final, for, if, break");
    }
}
