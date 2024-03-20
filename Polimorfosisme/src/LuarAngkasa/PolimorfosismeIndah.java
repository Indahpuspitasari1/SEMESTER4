package LuarAngkasa;
abstract class GalaksiClasss {  
    protected void NamaGalaksi() {
        System.out.println("_____________________");
    }
}
public class PolimorfosismeIndah {
    public static void main (String[] args) {
       GalaksiClasss BimaSakti = new BimaSakti();
        BimaSakti.NamaGalaksi();
        GalaksiClasss Andromeda = new Andromeda();
        Andromeda.NamaGalaksi();
        GalaksiClasss Sculptor = new Sculptor();
        Sculptor.NamaGalaksi();
}

}