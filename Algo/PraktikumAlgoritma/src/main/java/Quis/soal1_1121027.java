package Quis;

import javax.swing.JOptionPane;

public class soal1_1121027 {

  public static void main(String[] args) {
    int gajiAwalPerBulan = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Masukan berapa gaji awal anda : ")
    );
    int lamaKerja = Integer.parseInt(
      JOptionPane.showInputDialog(
        null,
        "Berapa lama anda sudah bekerja ? (dalam tahun ) : "
      )
    );
    int persentaseKenaikanGaji = Integer.parseInt(
      JOptionPane.showInputDialog(null, "Berapa besar kenaikan gaji anda ? : ")
    );
    int totalGajiSetahunDikurangiPTKP = 0, proses1 = 0, proses2 = 0, proses3 =
      0, proses4 = 0, akumulasiGajiTahunan = 0, akumulasiGajiTahunan2 = 0;

    int konversiPersentaseTahunanGaji = persentaseKenaikanGaji / 100;

    for (int i = 1; i <= lamaKerja; i++) {
      int totalGajiSetahun = gajiAwalPerBulan * 12;

      //Untuk penghitungan Gaji dalam setahun dan dikali persentase kenaikan
      if (i == 1) {
        akumulasiGajiTahunan = totalGajiSetahun * 1;
      } else if (i > 1) {
        akumulasiGajiTahunan = totalGajiSetahun * konversiPersentaseTahunanGaji;
        akumulasiGajiTahunan2 = akumulasiGajiTahunan + totalGajiSetahun;
      }

      //untuk perhitungan gaji tahunan dikurangi PTKP karena gaji diatas 54000000
      if (akumulasiGajiTahunan2 >= 54000000) {
        totalGajiSetahunDikurangiPTKP = akumulasiGajiTahunan2 - 54000000;
      }

      //Untuk operasi perhitungan gaji * ketentuan pajak yang berlaku
      if (totalGajiSetahunDikurangiPTKP <= 50000000) {
        proses1 = (int) (totalGajiSetahunDikurangiPTKP * 0.05);
        JOptionPane.showMessageDialog(
          null,
          "Pajak anda tahun ke - " + i + "adalah : " + proses1
        );
      } else if (totalGajiSetahunDikurangiPTKP <= 250000000) {
        proses1 = (int) (totalGajiSetahunDikurangiPTKP * 0.05);
        proses2 = (int) (proses1 * 0.15);
        JOptionPane.showMessageDialog(
          null,
          "Pajak anda tahun ke - " + i + "adalah : " + proses2
        );
      } else if (totalGajiSetahunDikurangiPTKP <= 500000000) {
        proses1 = (int) (totalGajiSetahunDikurangiPTKP * 0.05);
        proses2 = (int) (proses1 * 0.15);
        proses3 = (int) (proses2 * 0.25);
        JOptionPane.showMessageDialog(
          null,
          "Pajak anda tahun ke - " + i + "adalah : " + proses3
        );
      } else if (totalGajiSetahunDikurangiPTKP >= 500000000) {
        proses1 = (int) (totalGajiSetahunDikurangiPTKP * 0.05);
        proses2 = (int) (proses1 * 0.15);
        proses3 = (int) (proses2 * 0.25);
        proses4 = (int) (proses3 * 0.30);
        JOptionPane.showMessageDialog(
          null,
          "Pajak anda tahun ke - " + i + "adalah : " + proses4
        );
      } else {
        JOptionPane.showMessageDialog(null, "Anda salah memasukan Input");
      }
    }
  }
}
