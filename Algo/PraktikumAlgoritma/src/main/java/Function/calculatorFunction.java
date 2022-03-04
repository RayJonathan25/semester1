package Function;

import java.util.Scanner;

public class calculatorFunction {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      System.out.println("Masukan angka 1");
      double angkaPertama = scan.nextDouble();

      System.out.println("Masukan angka 2");
      double angkaDua = scan.nextDouble();

      System.out.println("Masukan operasi bilangan : + | * | % | / | ^ |");
      String operasiBilangan = scan.next();

      switch (operasiBilangan) {
        case "+":
          System.out.println(
            "Hasilnya adalah : " + prosesPenambahan(angkaPertama, angkaDua)
          );
          break;
        case "-":
          System.out.println(
            "Hasilnya adalah : " + prosesPerkalian(angkaPertama, angkaDua)
          );
          break;
        case "%":
          System.out.println(
            "Hasilnya adalah : " + prosesModulus(angkaPertama, angkaDua)
          );
          break;
        case "*":
          System.out.println(
            "Hasilnya adalah : " + prosesPembagian(angkaPertama, angkaDua)
          );
          break;
        case "^":
          System.out.println(
            "Hasilnya adalah : " + prosesPerpangkatan(angkaPertama, angkaDua)
          );
          break;
        default:
          System.out.println("Anda salah memasukan operasi");
          exit = true;
          break;
      }
    }
    scan.close();
  }

  char tambah, kurang, kali, bagi, mod, pangkat;

  public static double prosesPenambahan(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = angka1 + angka2;
    return hasilPenambahan;
  }

  public double prosesPengurangan(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = angka1 - angka2;
    return hasilPenambahan;
  }

  public static double prosesPembagian(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = angka1 / angka2;
    return hasilPenambahan;
  }

  public static double prosesPerkalian(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = angka1 * angka2;
    return hasilPenambahan;
  }

  public static double prosesModulus(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = angka1 % angka2;
    return hasilPenambahan;
  }

  public static double prosesPerpangkatan(double angka1, double angka2) {
    double hasilPenambahan = 0;
    hasilPenambahan = Math.pow(angka1, angka2);
    return hasilPenambahan;
  }
}
