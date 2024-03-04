package chapter2;

public class DemoArrayDuaDimensiInisialisasi {
    public static void main(String[] args) {
        System.out.println("Demo Inisialisasi Array Dua Dimensi");
        int[][] arrayDuaDimensi = {{10, 20, 30}, {40, 50, 60}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrayDuaDimensi[i][j]);
                if (j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }
}
