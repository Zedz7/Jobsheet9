public class Surat06 {
    private String idSurat;
    private String namaMahasiswa;
    private String kelas;
    private char jenisIzin;  
    private int durasi;      
    
    public Surat06() {
        this.idSurat = "";
        this.namaMahasiswa = "";
        this.kelas = "";
        this.jenisIzin = ' ';
        this.durasi = 0;
    }
    public Surat06(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
    public String IdSurat() {
        return idSurat;
    }
    public void stIdSurat(String idSurat) {
        this.idSurat = idSurat;
    }
    public String NamaMahasiswa() {
        return namaMahasiswa;
    }
    public void stNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }
    public String Kelas() {
        return kelas;
    }
    public void stKelas(String kelas) {
        this.kelas = kelas;
    }
    public char JenisIzin() {
        return jenisIzin;
    }
    public void stJenisIzin(char jenisIzin) {
        this.jenisIzin = jenisIzin;
    }
    public int Durasi() {
        return durasi;
    }
    public void stDurasi(int durasi) {
        this.durasi = durasi;
    }
    public void lihatInfo() {
        String jenisIzinStr = (jenisIzin == 'S') ? "Sakit" : "Izin keperluan lain";
        System.out.println("ID Surat     : " + idSurat);
        System.out.println("Nama         : " + namaMahasiswa);
        System.out.println("Kelas        : " + kelas);
        System.out.println("Jenis Izin   : " + jenisIzinStr);
        System.out.println("Durasi       : " + durasi + " hari");
    }
}