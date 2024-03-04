package chapter2;

public class DemoArrayDuaDimensi {
    public static void main(String[] args) {
        System.out.println("Demo Array Dua Dimensi");
        int[][] arrayDuaDimensi = new int[2][3];
        int a = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arrayDuaDimensi[i][j] = a * 10;
                System.out.print(arrayDuaDimensi[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
                a++;
            }
            System.out.println();
        }
    }
}
