package Quis;

import java.util.Random;
import javax.swing.JOptionPane;

public class No1_1121027 {

  public static void main(String[] args) {
    Random random = new Random();
    int logoKartu = random.nextInt(5) + 1;
    int nomorKartu = random.nextInt(13) + 1;
    char logoKartu1;
    boolean tebakanLogo = false, tebakanAngka = false, tebakan = false;
    String tebakan1, kartuSpesial;
    int tebakan2 = 0;
    switch (logoKartu) {
      case 1:
        logoKartu1 = 'S';
        break;
      case 2:
        logoKartu1 = 'H';
        break;
      case 3:
        logoKartu1 = 'D';
        break;
      default:
        logoKartu1 = 'C';
        break;
    }

    while (!tebakan) {
      while (!tebakanLogo) {
        tebakan1 =
          JOptionPane.showInputDialog(
            null,
            "Masukan tebakan anda Spade(S), Heart(H), Diamond)(D), atau Club(C) "
          );
        if (
          tebakan1.equalsIgnoreCase("S") ||
          tebakan1.equalsIgnoreCase("H") ||
          tebakan1.equalsIgnoreCase("D") ||
          tebakan1.equalsIgnoreCase("C")
        ) {
          tebakanLogo = true;
        }

        while (!tebakanAngka) {
          tebakan2 =
            Integer.parseInt(
              JOptionPane.showInputDialog(
                null,
                "Masukan tebakan angka dari 1-13"
              )
            );
          if (tebakan2 >= 1 && tebakan2 <= 13) {
            tebakanAngka = true;
          }
        }
        switch (tebakan2) {
          case 1:
            kartuSpesial = "As";
            break;
          case 11:
            kartuSpesial = "Jack";
            break;
          case 12:
            kartuSpesial = "Queen";
            break;
          case 13:
            kartuSpesial = "King";
            break;
          default:
            kartuSpesial = tebakan2 + " ";
        }

        if (
          tebakan1.equalsIgnoreCase(String.valueOf(logoKartu)) &&
          nomorKartu == tebakan2
        ) {
          JOptionPane.showMessageDialog(null, "Selamat Tebakan anda Benar !!");
          tebakan = true;
        } else if (tebakan2 < nomorKartu) {
          JOptionPane.showMessageDialog(
            null,
            "Sedikit lagi anda benar. coba angka yang lebih besar"
          );
          tebakanAngka = false;
          tebakanLogo = false;
        } else if (tebakan2 > nomorKartu) {
          JOptionPane.showMessageDialog(
            null,
            "Sedikit lagi anda benar.Coba angka yang lebih kecil"
          );
          tebakanAngka = false;
          tebakanLogo = false;
        } else {
          JOptionPane.showMessageDialog(
            null,
            "Maaf. Jawaban anda salah coba cari logo dan angka yang lebih tepat"
          );
          tebakanAngka = false;
          tebakanLogo = false;
        }
      }
    }
  }
}
