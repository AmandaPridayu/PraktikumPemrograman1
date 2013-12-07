//Perintah Inheritance
//Kelas Turunannya
package Latihan01.sesi5.bin;

public class TesKucingBesar
{
   public static void main(String[] Xx)
   {
      Singa mySinga = new Singa("SIMBABA SURAI");
	  System.out.println("Singa Merupakan " +Singa.nama);
	  mySinga.Makan();
	  
	  Harimau myHarimau = new Harimau("HARIMAU SUMATERA");
	  System.out.println("Harimau Merupakan " +Harimau.nama);
	  myHarimau.Makan();
   }
}