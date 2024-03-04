public class IfStaticSederhana {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("Menghitung Grade Nilai!!");
        if (a >= 90) {
            System.out.println("Nilai Anda adalah = A");
        } else if (a >= 80) {
            System.out.println("Nilai Anda adalah = B");
        } else if (a >= 70) {
            System.out.println("Nilai Anda adalah = C");
        } else if (a >= 60) {
            System.out.println("Nilai Anda adalah = D");
        } else if (a >= 50) {
            System.out.println("Nilai Anda adalah = E");
        } else if (a >= 100) {
            System.out.println("Nilai Anda Salah");
        } else {
            System.out.println("Nilai Anda Jelek karena di bawah 50 !!");
        }
    }
}
