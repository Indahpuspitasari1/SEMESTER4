package LuarAngkasa;
public class Asteroid extends luarangkasa {
     @Override
     public void luarAngkasa(){
        super.luarAngkasa();
        System.out.println("BATU");
        System.out.println("DEBU");
        System.out.println("ES");
    }

    public static void main(String[] args) {
        Asteroid L = new Asteroid();

        L.luarAngkasa();
    }
}