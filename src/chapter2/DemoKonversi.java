package chapter2;

public class DemoKonversi {
    public static void main(String[] args) {
        System.out.println("Demo Konversi");
        int a = 257;
        double d = 274.5678;

        // typecasting dari tipe int ke tipe byte
        byte b;
        b = (byte) a;
        System.out.println("Typecasting dari int ke byte");
        System.out.println("int a = " + a);
        System.out.println("byte b = " + b);

        // typecasting dari tipe doble ke tipe int
        int x;
        x = (int) d;
        System.out.println("Typecasting dari double ke int");
        System.out.println("double d = " + d);
        System.out.println("int x = " + x);

        // typecasting dari tipe double ke tipe byte
        b = (byte) d;
        System.out.println("Typecasting dari double ke byte");
        System.out.println("double d = " + d);
        System.out.println("byte b = " + b);
    }
}
