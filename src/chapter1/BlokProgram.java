package chapter1;

public class BlokProgram { // bagian awal blok program class
    public static void main(String[] args) { // bagian awal blok prgram method main
        /* blok program pada struktur pengulangan */
        for(int a=0; a<10; a++){ // bagian awal blok prgram for
            System.out.println(a);
        }   // bagian akhir blok prgram for

        int a = 3;
        int b = 5;
        /* blok program pada struktur pemilihan/percabangan */
        if(a < b){   // bagian awal blok program pemilihan/percabangan
            System.out.println("nilai a = "+a+ " lebih kecil dari nilai b yaitu = "+b);
        }   // bagian akhir blok program pemilihan/percabangan
    }   // bagian akhir blok prgram method main

    /* blok program pada definisi method */
    public int getNumber(int number){ // bagian awal blok program method
        return number;
    } // bagian akhir blok program method
}   // bagian akhir blok program class
