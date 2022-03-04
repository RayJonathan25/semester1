package main.java;

import java.util.Scanner;

public class latihanUasWeek3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        no3e();

    }

    public static void no1(Scanner scan) {
        System.out.println("Masukan jumlah siswa ");
        int jumlahSiswa = scan.nextInt();
        int total = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukan nilai mahasiswa ke " + i);
            int mahasiswa = scan.nextInt();
            total += mahasiswa;
        }
        int rataRata = total / jumlahSiswa;
        System.out.println("Rata ratanya adalah : " + rataRata);
    }

    public static void no2(Scanner scan) {
        System.out.println("Masukan jumlah pemilih");
        int jumlahPemilih = scan.nextInt();
        int paslon1 = 0, paslon2 = 0, paslon3 = 0, dosen, mahasiswa;
        for (int i = 1; i <= jumlahPemilih; i++) {
            System.out.println("Masukan jenis pemilih");
            String tipePemilih = scan.next().toLowerCase();
            System.out.println("orang ke - " + i + " Silahkan memilih : ");
            int pemilihan = scan.nextInt();
            if (tipePemilih.equals("dosen")) {
                if (pemilihan == 1) {
                    paslon1 += 5;
                } else if (pemilihan == 2) {
                    paslon2 += 5;
                } else if (pemilihan == 3) {
                    paslon3 += 5;
                }
            } else if (tipePemilih.equals("mahasiswa")) {
                if (pemilihan == 1) {
                    paslon1 += 1;
                } else if (pemilihan == 2) {
                    paslon2 += 1;
                } else if (pemilihan == 3) {
                    paslon3 += 1;
                }
            }
        }
        if (paslon1 > paslon2 && paslon1 > paslon3) {
            System.out.println("Pemenangnya adalah paslon 1 dengan suara  : " + paslon1);
        } else if (paslon2 > paslon1 && paslon2 > paslon3) {
            System.out.println("Pemenangnya adalah paslon 2 dengan suara : " + paslon2);
        } else if (paslon3 > paslon1 && paslon3 > paslon2) {
            System.out.println("Pemenangya adalah paslon 3 dengan suara : " + paslon3);
        }
    }

    public static void no3a() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");

        }
    }

    public static void no3b() {
        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void no3c() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
        }
    }

    public static void no3d() {

        int temp = 1;
        int counter = 1;
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= counter; j++) {
                System.out.print(temp);
                temp++;
            }
            if (i != 5) {
                for (int j = 1; j < counter; j++) {
                    System.out.print(j);
                }

            }
            counter++;
            if (i != 5) {
                temp--;
            }
            System.out.println(" ");
        }
    }

    public static void no3e() {
        int counter = 1;
        for (int i = 4; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= counter; j++) {
                if (j == 1) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= counter; j++) {
                if (j == counter) {
                    System.out.print("a");
                } else {
                    System.out.print("b");
                }
            }
            counter++;
            System.out.println(" ");
        }
    }
}