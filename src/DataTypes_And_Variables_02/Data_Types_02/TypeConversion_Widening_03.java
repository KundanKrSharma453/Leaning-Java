package DataTypes_And_Variables_02.Data_Types_02;

public class TypeConversion_Widening_03 {

    public static void main(String[] args) {
        int i = 100;
        long l = i;   // widening: int -> long (automatic, safe)
        double d = l; // widening: long -> double (automatic, safe)
        System.out.println("int=" + i + " -> long=" + l + " -> double=" + d);
    }
}
