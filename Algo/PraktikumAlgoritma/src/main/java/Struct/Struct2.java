package Struct;

import java.util.Scanner;

public class Struct2 {

  static class Karyawan {
    String nama;
    String jabatan;
    Alamat alamat;
    Penghasilan penghasilan;
  }

  static class Alamat {
    String Jalan;
    String Kota;
  }

  static class Penghasilan {
    double gaji;
    double tunjanganTransport;
    double tunjanganMakan;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan jumlah Karyawan : ");
    int jumlahKaryawan = scan.nextInt();
    Karyawan[] karyawans = new Karyawan[jumlahKaryawan];
    dataKaryawan(karyawans, scan);
    for (int i = 0; i < karyawans.length; i++) {
      System.out.println(karyawans[i].nama);
      System.out.println(karyawans[i].jabatan);

      System.out.println(karyawans[i].alamat.Jalan);
      System.out.println(karyawans[i].alamat.Kota);
      System.out.println(karyawans[i].penghasilan.gaji);
      System.out.println(karyawans[i].penghasilan.tunjanganTransport);
      System.out.println(karyawans[i].penghasilan.tunjanganMakan);
      System.out.println(
        "-----------" + "Data Karyawan ke - " + i + " ---------"
      );
    }
  }

  public static void dataKaryawan(Karyawan karyawans[], Scanner scan) {
    for (int i = 0; i < karyawans.length; i++) {
      karyawans[i] = new Karyawan();
      Alamat alamat = new Alamat();
      Penghasilan penghasilan = new Penghasilan();
      System.out.println("Masukan Nama Karyawan : ");
      karyawans[i].nama = scan.next();
      System.out.println("Masukan Jabatan Karyawan : ");
      karyawans[i].jabatan = scan.next();
      System.out.println("Masukan alamat karyawan : ");
      alamat.Jalan = scan.next();
      System.out.println("Masukan Kota Karyawan : ");
      alamat.Kota = scan.next();
      System.out.println("Masukan Gaji Karyawan : ");
      penghasilan.gaji = scan.nextDouble();
      System.out.println("Masukan Tunjangan Transportasi Karayawan : ");
      penghasilan.tunjanganTransport = scan.nextDouble();
      System.out.println("Masukan Tunjangan Transportasi Karyawan : ");
      penghasilan.tunjanganMakan = scan.nextDouble();

      karyawans[i].alamat = alamat;
      karyawans[i].penghasilan = penghasilan;
    }
  }
}
