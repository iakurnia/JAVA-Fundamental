package chapter3;

public class DemoDecrement {
    public static void main(String[] args) {
        System.out.println("Demo Decrement");
        int a = 5;
        System.out.println("Pre-Decrement");
        System.out.println("a \t\t: " + a);
        System.out.println("++a \t: " + --a);
        System.out.println("a \t\t: " + a);

        int b = 5;
        System.out.println("\nPost-Decrement");
        System.out.println("b \t\t: " + b);
        System.out.println("b++ \t: " + b--);
        System.out.println("b \t\t: " + b);

    }
}
