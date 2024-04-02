package Deque;
//Indah Puspitasari_20220040095
import java.util.ArrayDeque;
public class DaftarPlanet {
    public static void main(String[] args) {
    ArrayDeque<String> daftarNamaPlanet= new ArrayDeque<>();
     daftarNamaPlanet.add("Mars 1");
     daftarNamaPlanet.add("Bumi 2");
     daftarNamaPlanet.add("Merkurius 3");
     daftarNamaPlanet.add("Saturnus 4");
     daftarNamaPlanet.add("Jupiter 5");
    
    System.out.println("Daftar Nama Planet:");
    for (String Persib : daftarNamaPlanet) {
      System.out.println(Persib);
    }

   //Pelanet Pertama Sedang Rotasi pada Matahari
    String RotasiMatahari = daftarNamaPlanet.poll();
    System.out.println("\nSedang Mengelilingi Matahari: " + RotasiMatahari);

    
    //Beberapa Planet Yang seang berprose akan Rotasi pada Matahari
    System.out.println("\nDaftar Planet Yang akan berotasi :");
    for (String NomerRotasi :    daftarNamaPlanet) {
      System.out.println(NomerRotasi);
    }
   }
}
