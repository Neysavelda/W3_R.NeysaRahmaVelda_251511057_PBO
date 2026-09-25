package id.ac.polban.model;

public class Karyawan {
    public static final String NAMA_PERUSAHAAN = "PT. Stanford English School";
    private static int totalKaryawan = 0;

    private final String nama;
    private final String nip;
    private final String divisi;
    private int sisaCuti;

    public Karyawan(String nama, String nip, String divisi, int sisaCuti) {
        this.nama = nama;
        this.nip = nip;
        this.divisi = divisi;
        this.sisaCuti = sisaCuti;
        totalKaryawan++;
    }

    public String getNama() { return nama; }
    public String getNip() { return nip; }
    public String getDivisi() { return divisi; }
    public int getSisaCuti() { return sisaCuti; }

    public void setSisaCuti(int sisaCuti) {
        if (sisaCuti >= 0) {
            this.sisaCuti = sisaCuti;
        } else {
            System.out.println("Sisa cuti tidak boleh negatif, gagal diubah.");
        }
    }

    public static int getTotalKaryawan() {
        return totalKaryawan;
    }
}