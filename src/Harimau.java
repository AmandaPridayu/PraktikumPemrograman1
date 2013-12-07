//Perintah Inheritance
//Kelas Turunannya
package Latihan01.sesi5.bin;

class Harimau extends KucingBesar
{
   //Konstruktor untuk class Harimau
   public Harimau(String namaHarimau)
   {
   //Mengisi pengubah yang diwarisi oleh kelas abstract
   Harimau.nama = namaHarimau;
   }
   //Implementasi metode yang diwarisi dari kelas abstract
   public void Makan()
   {
   System.out.println("Harimau Makan Daging dan Minum Susu");
   System.out.println();
   }
 }