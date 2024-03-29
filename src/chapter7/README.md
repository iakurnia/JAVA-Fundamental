# Fundamental Java
Basic Fundamental Java

- ## Chapter 1. Pengenalan Java
  - Program di dalam java (bytecode)
  - Perbedaan pemograman procedural dan berorientasi objek
  - Software yang dibutuhkan
  - Instalasi software
  - Setting Classpath
  - Membuat program Helloworld
  - Cara Kompilasi dan Eksekusi program secara manual
  - JAVA IDE menggunakan Intelij IDEA
  - Elemen-elemen dasar
    - Komentar program code 
    - Blok program 
    - Separator
    - Kata kunci
  - Konsep Pemograman Berorientasi Objek
    - Abstraksi
    - Pembungkusan
      - Tingkat akses *private*
      - Tingkat akses *protected*
      - Tingkat akses *public*
    - Pewarisan
    - Polimorfisme
    
- ## Chapter 2. Type Data, Variable dan *Array*
  - Pengelompokan type data
    - *Integer* (Bilangan Bulat)
      - type *byte*
      - type *short*
      - type *int*
      - type *long*
    - *Floating-Point* (Bilangan Rill)
      - type *float*
      - type *double*
    - Karakter
    - Boolean
  - Variabel
    - Deklarasi variabel
    - Inisialisasi variabel
    - Lingkup variabel
  - *Typecasting*
    - Konversi otomatis
    - Konversi type data yang tidak kompatibel
  - Promosi type data dalam ekspresi
    - Batasan promosi type data 
  - *Array*
    - Array satu dimensi
    - Array multi dimensi
  - Pengenalan type *String*
  - Java dan *Pointer* 
    
- ## Chapter 3. Operator
  - Operator Aritmetika
    - Operator-operator aritmatika dasar
    - Operator *modulus* (sisa bagi)
    - Operator *increment* dan *decrement*
  - Operator Relasional
  - Operator Logika
  - Operator *Bitwise*
    - Operator *bitwise* AND
    - Operator *bitwise* OR
    - Operator *bitwise* XOR
    - Operator *bitwise* NOT
    - Operator *shift right*
    - Operator *shift right zero fill*
    - Operator *shift left*
  - Operater Tenary ***? :***
  - Prioritas pada Operator
  - Penggunaan tanda kurung () dalam ekspresi
  
- ## Chapter 4. Statement Kontrol
  - Pemilihan
    - Statement *if*
      - Satu kondisi
      - Dua kondisi
      - Tiga kondisi atau lebih
    - Statement *switch*
  - Pengulangan
    - Struktur *for*
      - Penggunaan tanda baca *koma* dalam *for*
      - Variasi dalam *for*
    - Struktur *while*
    - Struktur *do while*
    - Pengulanan bersarang
  - Peloncatan
    - Menggunakan *break*
      - *break* untuk menghentikan proses pengulanan
      - *break* untuk keluar dari blok program
    - Menggunakan *continue*
    - Menggunakan *return*
    
- ## Chapter 5. Kelas dan Objek
  - Apa itu kelas
    - Mendefinisikan kelas
    - Contoh dari sebuah kelas
  - Mendeklarasikan objek
  - Mengisi nilai pada referensi objek
  - Apa itu *method*
    - Mendefinisikan method
    - Pengembalian nilai dalam sebuah method
    - Method berparameter
  - Apa itu *constructor*
  - Kata kunci *this*
  - Mengenal *garbage collection*
  - Apa itu *method finalize()*
  - Melakukan Overload terhadap method
    - Overload terhadap constructor
  - Objek sebagai parameter
  - Melewatkan argumen di dalam java
  - Objek sebagai nilai kembalian
  - Rekursif
    - Menentukan nilai faktorial
    - Menentukan nilai perpangkatan
    - Konversi decimal ke biner
    - Konversi decimal ke heksadecimal
  - Menentukan tingkat akses data dan method
  - Mengenal kata kunci *static* dan *final*
  - Mendefinisikan kelas di dalam kelas *inner class*
  
- ## Chapter 6. Pewarisan Sifat Objek
  - Dasar Pewarisan *superclass dan subclass*
  - Membuat kelas turunan *subclass*
  - Tingkat akses *protected*
  - Mengenal kata kunci *super*
    - *super* untuk memanggil *constructor*
    - *super* untuk mengakses kelas induk
  - Dalam java tidak mengenal *multiple inhetitance*
  - *Contructor* pada proses penurunan kelas
  - *Override* terhadap method
  - Perbedaan *override* dengan *overload*
  - Apa itu *polimorfisme*
  - Apa itu *kelas abstract*
  - Kata kunci *final* pada proses pewarisan
    - Mencegah method dari proses override
    - Menjadikan kelas tidak dapat diturunkan lagi
    
- ## Chapter 7. Package dan Interface
  - Apa itu *package*
  - Membuat *package*
  - Mengimport *package* yang telah di buat ke dalam program
  - *Package* dalam *package*
  - Tingkat akses dalam *package*
  - Apa itu *interafce*
  - Membuat *interface*
  - Penggunaan *interface*
  - Membuat referensi ke type *interface*
  - Variable di dalam *interface*
  - *Interface* dapat di turunkan menjadi *interface* lain

- ## Chapter 8. Eksepsi
  - Apa itu eksepsi
  - Type eksepsi dalam java
  - Penggunaan kata kunci *try* dan *catch*
  - Penjebakan beberapa type eksepsi
  - Blok *try* bersarang
  - Menggunakan kata kunci *throw* *throws* dan *finally*
  - Membuat kelas eksepsi sendiri

- ## Chapter 9. Input dan Output
  - Dasar dasar input output
    - Apa itu *stream*
    - Type *stream*
      - *Stream byte*
      - *Stream karakter*
      - *Stream* yang telah terdefinisi
  - Melakukan input
    - Membaca input data karakter
    - Membaca input data string
    - membaca input data numerik
  - Menampilkan output
  - Mengelal kelas *PrintWriter*
  - Dasar dasar baca/tulis *file*
  - Kelas dan *interface* yang berkaitan dengan input output
  - Kelas *file*
    - Memperoleh informasi *file*
    - Membuat *file*
    - Mengubah nama *file*
    - Menghapus *file*
    - Menampilkan data *file* dan direktori
    - Membuat direktori baru

- ## Chapter 10. String dalam Java
  - Dalam java *string* adalah *object*
  - Membentuk *object* dari kelas *string*
  - Operasi *string*
    - Menyambung *string*
    - Memahami method *toString()*
    - Menentukan huruf besar dan kecil dari *string*
  - Pengembalian karakter dari sebuah *string*
    - Method *chartAt()*
    - Method *getChars()*
    - Method *getBytes()*
    - Method *toCharArray()*
  - Method-method untuk modifikasi *string*
    - Method *trim()*
    - Method *substring()*
    - Method *replace()*
    - Method *concat()*
  - Membandingkan dua buah *string*
    - Method *equals()*
    - Method *equalsIgnoreCase()*
    - Method *startsWith()*
    - Method *endsWith()*
    - Method *regionMatches()*
    - Method *compareTo()* dan *compareToIgnoreCase()*
    - Perbedaan method equals() dengan Operator *==*
  - Pencarian *string*
  - *Array* dari type *string*
  - Argumen pada *command line*
  - Menggunakan kelas *String Buffer*
    - Perbedaan method *capacity()* dengan *length()*
    - Menentukan kapasitas *buffer*
    - Menentukan lebar karakter
    - Method *chartAt()* dan *setChartAt()*
    - Method *getChars()*
    - Menambahkan karakter atau *substring*
    - Menyisipkan karakter atau *substring*
    - Menghapus karakter atau *substring*
    - Mengganti karakter atau *substring*
    - Membalikan posisi *string*
    - Menggunakan method *substring*
    
- ## Chapter 11. Thread
  - *Multitasking* dan *Multithread*
  - Apa itu *thread*
  - *Thread* utama (setiap program dalam java memiliki *thread*)
  - Membuat dan menjalankan *thread*
    - Mengimplementasikan *interface runnable*
    - Menurunkan kelas *thread*
    - Cara yang lebih di rekomendasikan
  - Menghentikan *thread*
  - Multiple *thread*
  - Mengenal method *isAlive()* dan *join()*
  - Menentukan prioritas *thread*
  - *Sinkronisasi*
    - Monitoru *lock*
    - Method untuk *sinkronisasi*
    - Blok untuk *sinkronisasi*


[**back**](../../README.md) **<==>** [**chapter8**](../chapter8/README.md)
---
I love new technology and follow the advancements in the field.
We Can Do It If We Want To Learn and Try.
Feel free to connect with me on my LinkedIn account
* [***linkedin***](https://www.linkedin.com/in/ia-kurnia-a72778114/)
* [***medium***](https://iakurniadev.medium.com/)
