package Function;

import javax.swing.JOptionPane;

public class restoranFunction {
  static int totalAkhirPendapatan = 0;
  static double totalPPN = 0;
  static double totalServiceCharge = 0;

  public static void main(String[] args) {
    boolean exit = false;

    while (!exit) {
      int mainMenu = Integer.parseInt(
        JOptionPane.showInputDialog(
          null,
          "Main Menu\n" +
          "1.Total Bayar \n" +
          "2. Total Pendapatan Restoran\n" +
          "3.total PPN \n" +
          "4.Service Charge\n" +
          "5.Total Keuntungan Restaurant \n \n"
        )
      );

      switch (mainMenu) {
        case 1:
          totalBayarSeorangPelanggan();
          break;
        case 2:
          totalKeseluruhanRestauran();
          break;
        case 3:
          totalPpnKeseluruhan();
          break;
        case 4:
          totalServiceChargeKeseluruhan();
          break;
        case 5:
          totalKeuntunganRestauran();
          break;
        default:
          exit = true;
      }
    }
  }

  public static void totalBayarSeorangPelanggan() {
    while (true) {
      String namaPelanggan = JOptionPane.showInputDialog(
        null,
        "Masukan nama anda : "
      );
      if (namaPelanggan.equals("")) {
        break;
      }
      String pesananPelanggan = JOptionPane.showInputDialog(
        null,
        "Masukan pesanan anda : "
      );
      int hargaPesananPelanggan = Integer.parseInt(
        JOptionPane.showInputDialog(null, "Harga makanan/minuman adalah : ")
      );
      int jumlahPesananPelanggan = Integer.parseInt(
        JOptionPane.showInputDialog(null, "Jumlah yang dipesan adalah : ")
      );

      int pendapatan = hargaPesananPelanggan * jumlahPesananPelanggan;
      Double ppn = pendapatan * 0.1;
      Double serviceCharge = pendapatan * 0.05;
      totalPPN += ppn;
      totalServiceCharge += serviceCharge;
      Double totalBayar = pendapatan - (ppn + serviceCharge);
      totalAkhirPendapatan += totalBayar;

      JOptionPane.showMessageDialog(
        null,
        "Jadi harga yang harus dibayar adalah : " + totalBayar
      );
    }
  }

  public static void totalKeseluruhanRestauran() {
    JOptionPane.showMessageDialog(
      null,
      "Jadi total keseluruhan restauran adalah : " + totalAkhirPendapatan
    );
  }

  public static void totalPpnKeseluruhan() {
    JOptionPane.showMessageDialog(null, "Jadi total PPN adalah : " + totalPPN);
  }

  public static void totalServiceChargeKeseluruhan() {
    JOptionPane.showMessageDialog(
      null,
      "Jadi total Service Charge keseluruhan adalah : " + totalServiceCharge
    );
  }

  public static void totalKeuntunganRestauran() {
    double keuntunganRestauran =
      totalAkhirPendapatan -
      (totalAkhirPendapatan * 0.1) +
      (totalAkhirPendapatan * 0.15) +
      (totalAkhirPendapatan * 0.2);
    JOptionPane.showMessageDialog(
      null,
      "total Keuntungan Restauran adalah : " + keuntunganRestauran
    );
  }
}
