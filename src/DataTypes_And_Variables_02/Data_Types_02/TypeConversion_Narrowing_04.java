package DataTypes_And_Variables_02.Data_Types_02;

public class TypeConversion_Narrowing_04 {

    public static void main(String[] args) {
        double d = 100.99;
        int i = (int) d; // narrowing requires explicit cast; fractional part is dropped
        System.out.println("double=" + d + " -> int (cast)=" + i);
    }
}
