import id.ac.polban.model.Karyawan;
import id.ac.polban.model.Manager;
import id.ac.polban.service.CutiService;

public class PerkantoranTest {
    public static void main(String[] args) {

        System.out.println(
            "=== SISTEM MANAJEMEN CUTI "
            + Karyawan.NAMA_PERUSAHAAN
            + " ==="
        );

        System.out.println("----------------------------------------");

        Manager manager1 =
            new Manager("Pak Raden", "Divisi IT");

        Karyawan karyawan1 =
            new Karyawan(
                "Neysa Rahma",
                "NIP-101",
                "Divisi IT",
                12
            );

        Karyawan karyawan2 =
            new Karyawan(
                "Maria Magdalena",
                "NIP-102",
                "Divisi IT",
                3
            );

        // Implementasi Aggregation
        manager1.tambahKaryawan(karyawan1);
        manager1.tambahKaryawan(karyawan2);

        System.out.println(
            "Total Karyawan Terdaftar: "
            + Karyawan.getTotalKaryawan()
        );

        System.out.println("----------------------------------------");

        // Membuat objek service untuk memproses cuti
        CutiService layananCuti = new CutiService();

        System.out.println("\n--- KASUS 1: Pengajuan Cuti (Disetujui) ---");
        // Implementasi Dependency (Kasus 1)
        layananCuti.prosesPengajuanCuti(
            karyawan1,
            manager1,
            5
        );

        System.out.println("\n--- KASUS 2: Pengajuan Cuti (Ditolak) ---");
        // Implementasi Dependency (Kasus 2)
        layananCuti.prosesPengajuanCuti(
            karyawan2,
            manager1,
            5
        );
    }
}