//Latihan Variabel
//Created By : Amanda Pridayu

package Latihan01.sesi1.bin;
public class DemoVariabel1 {
     public static void main(String[] qq) {
	      int x=10;
		  System.out.println("Nilai X adalah " +x);
		  
		  char z='a';
		  System.out.println("Nilai Z adalah " +z);
		  
		  //Isi data ke tipe yang tidak tepat
		  int y=z;
		  System.out.println("Nilai Y adalah " +y);
		  
		  //tidak bisa compile (error)
		  //char w=x;
		  //System.out.println("Nilai W adalah "+x);
		  
		  //Type casting
		  int v=10;
		  System.out.println("Nilai V adalah " +v);
		  System.out.println(" ");
		  System.out.println("Baris Selanjutnya");
		  
		  amanda();
		  
		  System.out.println("Setelah menjalankan Amanda");
	}
	static char v;
		  
	public static void amanda() {
	    int v=20;
	    System.out.println("Nilai V adalah " +v);
		//Variabel v tidak boleh dihapus karena masih di pakai dan masih berada di dalam scope 
		short d=15; //Variabel d boleh di hapus di baris 27, karena life time nya sudah habis
		System.out.println("D adalah " +d); //Variabel d boleh di hapus di baris 27
	}
}