package ForLoop;

import java.util.Scanner;

public class Loop2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int totalCalon1 = 0, totalCalon2 = 0, totalCalon3 = 0;
    System.out.println("Masukan jumlah pemilih ");
    int jumlahPemilih = scan.nextInt();

    for (int i = 1; i <= jumlahPemilih; i++) {
      System.out.println("Apakah anda Dosen atau Mahasiswa : ");
      String jenisPeserta = scan.next();
      System.out.println("Pasangan calon yang akan dipilih : ");
      int pasanganCalon = scan.nextInt();

      switch (jenisPeserta) {
        case "Dosen":
          if (pasanganCalon == 1) {
            totalCalon1 = totalCalon1 + 5;
          }
          if (pasanganCalon == 2) {
            totalCalon2 = totalCalon2 + 5;
          }
          if (pasanganCalon == 3) {
            totalCalon3 = totalCalon3 + 5;
          }
          break;
        case "Mahasiswa":
          if (pasanganCalon == 1) {
            totalCalon1 = totalCalon1 + 1;
          }
          if (pasanganCalon == 2) {
            totalCalon2 = totalCalon2 + 1;
          }
          if (pasanganCalon == 3) {
            totalCalon3 = totalCalon3 + 1;
          }
          break;
      }
    }
    if (totalCalon1 > totalCalon3 && totalCalon1 > totalCalon2) {
      System.out.println(
        "Pemenang dari pemilihan ini adalah pasangan Calon 1 dengan total point : " +
        totalCalon1
      );
    } else if (totalCalon2 > totalCalon3 && totalCalon2 > totalCalon1) {
      System.out.println(
        "Pemenang dari pemilihan ini adalah pasangan Calon 2 dengan total point : " +
        totalCalon2
      );
    } else if (totalCalon3 > totalCalon1 && totalCalon3 > totalCalon2) {
      System.out.println(
        "Pemenang dari pemilihan ini adalah pasangan Calon 3 dengan total point: " +
        totalCalon3
      );
    } else if (
      totalCalon3 == totalCalon2 ||
      totalCalon3 == totalCalon1 ||
      totalCalon1 == totalCalon2
    ) {
      System.out.println("Draw");
    }
  }
}
