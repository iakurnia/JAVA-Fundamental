package chapter2;

public class DemoTypeBoolean {
    public static void main(String[] args) {
        System.out.println("Demo Type boolean");
        boolean b;
        b = true;
        System.out.println("Nilai b = " + b);

        if (b) {
            System.out.println("Statement ke 1 yang di eksekusi");
        }
        b = false;
        System.out.println("Nilai b = " + b);

        if (b) {
            System.out.println("Statement ke 2 yang tidak di eksekusi");
        }
        if (!b) {
            System.out.println("Statement ke 3 yang di eksekusi ");
        }
        System.out.println("5 < 10 maka nilainya = " + (5 < 10));
        System.out.println("4 > 8 maka nilainya = " + (4 > 8));
    }
}
