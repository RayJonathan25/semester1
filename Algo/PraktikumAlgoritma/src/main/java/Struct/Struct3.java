package Struct;

import java.util.Arrays;
import java.util.Scanner;
import javax.lang.model.type.NullType;
import javax.swing.JOptionPane;

public class Struct3 {

  static class Pasien {
    String nama;
    String alamat;
    String telpon;
    int usia;
    int gender;
    String keluhanPenyakit;
    boolean validasiBpjs;
  }

  public static Pasien Database() {
    Pasien psn = new Pasien();
    psn.nama = JOptionPane.showInputDialog(null, "Masukan nama Pasien : ");
    psn.alamat = JOptionPane.showInputDialog(null, "Masukan Alamat Pasien : ");
    psn.telpon = JOptionPane.showInputDialog(null, "Masukan Telpon Pasien : ");
    psn.usia = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Usia Pasien : "));
    psn.gender = Integer
        .parseInt(JOptionPane.showInputDialog(null, "Masukan Gender Pasien (0 untuk Pria/1 untuk Wanita): "));
    psn.keluhanPenyakit = JOptionPane.showInputDialog(null, "Masukan Keluhan Penyakit Pasien : ");
    psn.validasiBpjs = Boolean
        .parseBoolean(JOptionPane.showInputDialog(null, "Apakah Pasien memiliki BPJS ? (true/false) "));
    return psn;
  }

  public static Pasien[] processContinue() {
    boolean exit = false;
    Pasien[] psn = new Pasien[10];
    int i = 0;
    while (!exit) {
      psn[i] = Database();
      char cofirm = JOptionPane.showInputDialog(null, "Apakah masih ingin melanjutkan ?? (y/n)").charAt(0);

      exit = !(cofirm == 'y');
      if (i >= psn.length) {
        exit = true;
      } else {
        i++;
      }
    }
    return psn;
  }

  public static int jumlahPasien(Pasien dataPasien[]) {
    int counter = 0;
    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i] != null) {
        counter++;
      }
    }
    return counter;
  }

  public static void batasUmurPasien(Pasien dataPasien[]) {
    int batasUmur = Integer
        .parseInt(JOptionPane.showInputDialog(null, "Masukan batas umur berapa yang ingin dicari datanya"));

    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasien[i].usia < batasUmur && dataPasien[i].validasiBpjs) {
        JOptionPane.showMessageDialog(null, dataPasien[i].usia);
      }
    }
    ;
  }

  public static void dataPasien(Pasien dataPasien[]) {
    String dataPasienString = JOptionPane.showInputDialog(null, "Masukan nama Pasien yang ingin dicheck datanya : ");
    for (int i = 0; i < dataPasien.length; i++) {
      if (dataPasienString.toLowerCase().equals(dataPasien[i].nama)) {
        JOptionPane.showMessageDialog(null, dataPasien[i].nama);
        JOptionPane.showMessageDialog(null, dataPasien[i].alamat);
        JOptionPane.showMessageDialog(null, dataPasien[i].telpon);
        JOptionPane.showMessageDialog(null, dataPasien[i].usia);
        JOptionPane.showMessageDialog(null, dataPasien[i].gender);
        JOptionPane.showMessageDialog(null, dataPasien[i].keluhanPenyakit);
        JOptionPane.showMessageDialog(null, dataPasien[i].validasiBpjs);

      } else {
        JOptionPane.showMessageDialog(null, "Tidak ada pasien dengan nama : " + dataPasienString);
      }
    }

  }

  public static void main(String[] args) {
    Pasien[] pass = processContinue();
    JOptionPane.showMessageDialog(null, "Jadi jumlah pasiennya adalah : " + jumlahPasien(pass));
    dataPasien(pass);
  }
}