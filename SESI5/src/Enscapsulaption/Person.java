package Enscapsulaption;
//Indah Puspitasari
public class Person {
   private String name, address;
   
   public Person(String name, String address) {
      this.name = name;
      this.address = address;
   }
   
   public String getName() {
      return name;
   }
  
   
   public String getAddress() {
      return address;
   }
   
   public void setAddress(String address) {
      this.address = address;
   }
   
   @Override
   public String toString() {
      return name + "(" + address + ")";
   }
}

