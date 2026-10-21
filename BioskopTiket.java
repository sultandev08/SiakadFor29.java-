import java.util.Scanner;

public class BioskopTiket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaPerTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;

        System.out.print("Masukkan jumlah pelanggan/transaksi hari ini: ");
        int jumlahPelanggan = sc.nextInt();

        int i = 1;
        while (i <= jumlahPelanggan) {
            System.out.print("Masukkan jumlah tiket untuk pelanggan ke-" + i + ": ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid. Masukkan lagi nilai yang valid!");
                continue;
            }

            double hargaTotal = jmlTiket * hargaPerTiket;
            double diskon = 0;

            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.10;
            }

            hargaTotal = hargaTotal - (hargaTotal * diskon);

            totalTiketTerjual += jmlTiket;
            totalPendapatan += hargaTotal;

            i++;
        }

        System.out.println("\n=== REKAP PENJUALAN TIKET BIOSKOP HARI INI ===");
        System.out.println("Total tiket yang terjual : " + totalTiketTerjual);
        System.out.println("Total pendapatan         : Rp " + totalPendapatan);

        sc.close();
    }
}