package LuarAngkasa;
public class Galaksi extends luarangkasa {
     @Override
     public void luarAngkasa(){
        super.luarAngkasa();
        System.out.println("BimaSakti");
        System.out.println("Andromeda");
        System.out.println("The Rose (UGC 1810 dan UGC 1813)");
        System.out.println("Sculptor");
        System.out.println("Triangulum (M33)");
        
    }

    public static void main(String[] args) {
        Galaksi L = new Galaksi();

        L.luarAngkasa();
    }
}
