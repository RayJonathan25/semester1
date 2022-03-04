package ForLoop;

import java.util.Scanner;

public class Loop1 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan Jumlah siswa");
    int nilaiSiswa = 0, totalNilaiSiswa = 0;
    int jumlahSiswa = scan.nextInt();

    for (int i = 1; i <= jumlahSiswa; i++) {
      System.out.println("Masukan Nilai : ");
      nilaiSiswa = scan.nextInt();
      totalNilaiSiswa = totalNilaiSiswa + nilaiSiswa;
    }
    System.out.println(" ");

    int ratarataNilai;
    ratarataNilai = totalNilaiSiswa / jumlahSiswa;
    System.out.println("Rata-rata nilai anda adalah : " + ratarataNilai);
  }
}
