package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private final String namaManager;
    private final String divisi;
    private final List<Karyawan> daftarKaryawan;

    public Manager(String namaManager, String divisi) {
        this.namaManager = namaManager;
        this.divisi = divisi;
        this.daftarKaryawan = new ArrayList<>();
    }

    public String getNamaManager() {
        return namaManager;
    }

    public String getDivisi() {
        return divisi;
    }

    public void tambahKaryawan(Karyawan karyawan) {
        daftarKaryawan.add(karyawan);
    }

    public List<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
}