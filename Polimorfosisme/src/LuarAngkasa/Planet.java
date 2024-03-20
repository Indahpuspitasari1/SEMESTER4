package LuarAngkasa;
  public class Planet extends luarangkasa {
          @Override
     public void luarAngkasa(){
        super.luarAngkasa();
        System.out.println("BUMI");
        System.out.println("MERKURIUS");
        System.out.println("MARS");
        System.out.println("JUPITER");
        System.out.println("SATURNUS");
        
    }

    public static void main(String[] args) {
        Planet L = new Planet();

        L.luarAngkasa();
    }
    }
