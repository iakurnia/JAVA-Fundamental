package chapter2;

public class DemoArray {
    public static void main(String[] args) {
        System.out.println("Demo Array");
        // mendeklarasikan variabel bertipe array dengan tipe int
        int[] jumlahHari;

        // menentukan jumlah elemen array
        jumlahHari = new int[12];

        // mengisikan nilai dari setiap elemen array yang ada
        jumlahHari[0] = 31;
        jumlahHari[1] = 29;
        jumlahHari[2] = 30;
        jumlahHari[3] = 31;
        jumlahHari[4] = 31;
        jumlahHari[5] = 30;
        jumlahHari[6] = 30;
        jumlahHari[7] = 30;
        jumlahHari[8] = 30;
        jumlahHari[9] = 30;
        jumlahHari[10] = 31;
        jumlahHari[11] = 31;

        // menampilkan salah satu elemen array
        System.out.println("Bulan Juni memiliki "+jumlahHari[6]+" hari");
    }
}
