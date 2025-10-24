import java.util.Scanner;

public class PenjualanTiketBioskop26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket;
        int totalTiketTerjual = 0;
        double totalPenjualan = 0;
        double hargaTiket = 50000;

        System.out.println("PROGRAM PENJUALAN TIKET BIOSKOP ");
        System.out.println("Ketik 0 jika ingin selesai");

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                break;
            }
            if (jmlTiket < 0) {
                System.out.println("Input tidaK valid! Jumlah tiket tidak boleh negatif. ");
                continue;
            }

            double hargaTotal = jmlTiket * hargaTiket;
            double diskon = 0;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            hargaTotal -= hargaTotal * diskon;
            totalPenjualan += hargaTotal;
            totalTiketTerjual += jmlTiket;

            System.out.println("Harga setelah diskon: Rp " + (int) hargaTotal);
        }
        System.out.println("Laporan Penjualan Hari Ini");
        System.out.println("Total Tiket terjual: " + totalTiketTerjual);
        System.out.println("Total Pendapatan: Rp " + totalPenjualan);
    }

}
