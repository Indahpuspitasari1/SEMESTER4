package GenericColection;
public class Mahasiswaku {
     public static void main(String[] args) {
        Mahasiswa <String, String, Integer> m = new Mahasiswa<>();
        m.setNim("2022004009676");
        m.setNama("Fernando Ari");
        m.setClass(22);

        System.out.println(m.getNim());
        System.out.println(m.getNama());
        System.out.println(m.getClass());
    }
}
