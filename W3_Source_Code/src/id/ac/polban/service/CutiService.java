package id.ac.polban.service;

import id.ac.polban.model.Karyawan;
import id.ac.polban.model.Manager;

public class CutiService {
    
    // Method untuk memproses pengajuan cuti (Menerapkan Dependency ke Karyawan dan Manager)
    public void prosesPengajuanCuti(Karyawan karyawan, Manager manager, int jumlahHari) {
        System.out.println(karyawan.getNama() + " mengajukan cuti " + jumlahHari + " hari kepada Manager " + manager.getNamaManager());
        
        if (jumlahHari <= karyawan.getSisaCuti()) {
            karyawan.setSisaCuti(karyawan.getSisaCuti() - jumlahHari);
            System.out.println("Hasil: DISETUJUI. Sisa cuti " + karyawan.getNama() + " sekarang: " + karyawan.getSisaCuti() + " hari.");
        } else {
            System.out.println("Hasil: DITOLAK. Sisa cuti " + karyawan.getNama() + " tidak mencukupi (sisa: " + karyawan.getSisaCuti() + " hari).");
        }
    }
}