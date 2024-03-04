package chapter3;

public class DemoOperatorLogika {
    public static void main(String[] args) {
        System.out.println("Demo Operator Logika");
        System.out.println("Operasi AND");
        System.out.println("true && true = " + (true && true));
        System.out.println("true && false = " + (true && false));
        System.out.println("false && true = " + (false && true));
        System.out.println("false && false = " + (false && false));

        System.out.println("\nOperasi OR");
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false));
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = " + (false || false));

        System.out.println("\nOperasi XOR");
        System.out.println("true ^ true = " + (true ^ true));
        System.out.println("true ^ false = " + (true ^ false));
        System.out.println("false ^ true = " + (false ^ true));
        System.out.println("false * false = " + (false ^ false));

        System.out.println("\nOperasi NOT");
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));
    }
}
