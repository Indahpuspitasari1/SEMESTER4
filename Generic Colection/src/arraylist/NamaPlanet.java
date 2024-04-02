package arraylist;
//Indah Puspitasri _20220040095
import java.util.ArrayList;

public class NamaPlanet {
     public static void main(String[] args) {
    ArrayList<String> namaPlanet = new ArrayList<>();
    
    namaPlanet.add("Bumi");
    namaPlanet.add("Mars");
    namaPlanet.add("Jupiter");
    namaPlanet.add("Saturnus");
    namaPlanet.add("Merkurius");
    namaPlanet.add("Pluto");
    
    System.out.println("Nama-nama Planet di Luar Angkas  :");
    for (int i = 0; i < namaPlanet.size(); i++) {
      System.out.println((i+1) + ". " + namaPlanet.get(i));
    }
    
   namaPlanet.remove(3); 
   namaPlanet.remove(2); 
    System.out.println("\nNama-Nama Planet setelah dihapus :");
    for (int i = 0; i <namaPlanet.size(); i++) {
      System.out.println((i+1) + ". " + namaPlanet.get(i));
    }
  }
}