package GenericColection;
    //Indah Puspitasri_20220040095
public class Mahasiswa<mahasiswanim, mahasiswanama, mahasiswakelas> {
    private mahasiswanim nim;
    private mahasiswanama nama;
    private mahasiswakelas kelas;
    
    public void setNim(mahasiswanim nim) {
        this.nim = nim;
    }
    
    public mahasiswanim getNim() {
        return nim;
    }
    
    public void setNama(mahasiswanama nama) {
        this.nama = nama;
    }
    
    public mahasiswanama getNama() {
        return nama;
    }
    
    public void setClass(mahasiswakelas kelas) {
        this.kelas = kelas;
    }
    
    public mahasiswakelas getKelas() {
        return kelas;
    }
  }
