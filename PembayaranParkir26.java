import java.util.Scanner;
public class PembayaranParkir26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        System.out.println("PROGRAM HITUNG BIAYA PARKIR");
        System.out.println("1 = Mobil");
        System.out.println("2 = Motor");
        System.out.println("0 = Keluar");

        System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar)");
        jenis = sc.nextInt();

        while (jenis != 0) {
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi *2000;
                }
            } else {
                System.out.println("Jenis Kendaraan tidak valid!");
            }

            System.out.print("Masukkan jenis kendaraan (I Mobil, 2 Motor, 0 Keluar): ");
            jenis = sc.nextInt();
        }
        System.out.println("Total Pendapatan Parkir Hari ini: Rp " + total);
    }
    
}
