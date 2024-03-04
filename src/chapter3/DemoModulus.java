package chapter3;

public class DemoModulus {
    public static void main(String[] args) {
        System.out.println("Demo Modulus");
        int a = 11, b = 4;
        int c = a % b;

        double da = 13.75;
        double dc = da % b;
        System.out.println("Sisa bagi dari " + a + " / " + b + " = " + c);
        System.out.println("Sisa bagi dari " + da + " / " + b + " = " + dc);
    }
}
