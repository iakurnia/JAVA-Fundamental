package chapter3;

public class DemoIncrement {
    public static void main(String[] args) {
        System.out.println("Demo Increment");
        int a = 5;
        System.out.println("Pre-Increment");
        System.out.println("a \t\t: " + a);
        System.out.println("++a \t: " + ++a);
        System.out.println("a \t\t: " + a);

        int b = 5;
        System.out.println("\nPost-Increment");
        System.out.println("b \t\t: " + b);
        System.out.println("b++ \t: " + b++);
        System.out.println("b \t\t: " + b);
    }
}
