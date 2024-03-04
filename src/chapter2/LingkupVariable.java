package chapter2;

public class LingkupVariable {
    public static void main(String[] args) {
        System.out.println("Lingkup Variable");
        int a = 10;
        if (a > 5) {    // awal blok
            int b = 15;
            System.out.println("Nilai a di dalam blok if = " + a);
            System.out.println("Nilai b di dalam blok if = " + b);
        } // akhir blok
        System.out.println("Nilai a di luar blok if = " + a);
        // SALAH
        // System.out.println("Nilai a di luar blok if = "+b);
    }
}
