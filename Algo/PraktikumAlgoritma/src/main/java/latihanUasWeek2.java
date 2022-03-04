package main.java;

import java.util.Scanner;

public class latihanUasWeek2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        no5(scan);
    }

    public static void no1(Scanner scan) {
        System.out.println("Masukan angka ke-1");
        int angka1 = scan.nextInt();
        System.out.println("Masukan angka ke-2");
        int angka2 = scan.nextInt();
        System.out.println("Masukan angka ke-3");
        int angka3 = scan.nextInt();

        if (angka1 % 2 == 0 && angka2 % 2 == 0 && angka3 % 2 == 0) {
            System.out.println("Dominan angka genap");
        } else if (angka1 % 2 == 0 && angka2 % 2 == 0 && angka3 % 2 != 0) {
            System.out.println("Dominan angka genap");
        } else if (angka1 % 2 == 0 && angka2 % 2 != 0 && angka3 % 2 != 0) {
            System.out.println("Dominan angka ganjil");
        } else {
            System.out.println("dominan angka ganjil");
        }
    }

    public static void no2(Scanner scan) {
        System.out.println("Masukan input angka");
        Double angkaDouble = scan.nextDouble();
        System.out.println("Masukan operator aritmatika ");
        char aritmatika = scan.next().charAt(0);
        System.out.println("Masukan angka ke 2");
        Double angkaDouble2 = scan.nextDouble();

        switch (aritmatika) {
            case '+':
                System.out.println(angkaDouble + angkaDouble2);
                break;

            case '-':
                System.out.println(angkaDouble + angkaDouble2);
                break;

            case '*':
                System.out.println(angkaDouble * angkaDouble2);
                break;

            case '/':
                System.out.println(angkaDouble / angkaDouble2);
        }
    }

    public static void no3(Scanner scan) {
        System.out.println("Masukan input nilai Akhir");
        int nilaiAkhir = scan.nextInt();

        if (nilaiAkhir >= 80) {
            System.out.println("Anda lulus dengan nilai istimewa");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Anda lulus dengan nilai cukup");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Sedikit lagi anda lolos, jangan menyerah");
        } else {
            System.out.println("Anda belum beruntung, coba lagi tahun depan");
        }
    }

    public static void no4(Scanner scan) {

        System.out.println("Masukan jenis kamarnya");
        String jenisKamar = scan.next();
        System.out.println("masukan berapa lama anda menginap ");
        int lamaInap = scan.nextInt();
        System.out.println("Harga kamar adalah");
        int hargaKamar = scan.nextInt();
        int total = (lamaInap * hargaKamar);

        switch (jenisKamar.toLowerCase()) {
            case "deluxe":
                Double pajak = total * 0.05;
                Double totalBayar = total + pajak;
                System.out.println("total yang dibayar : " + totalBayar);
                break;

            case "executive":
                pajak = total * 0.1;
                totalBayar = total + pajak;
                System.out.println("total yang dibayar : " + totalBayar);
                break;
            case "suite":
                pajak = total * 0.15;
                totalBayar = total + pajak;
                System.out.println("total yang dibayar : " + totalBayar);
                break;

        }
    }

    public static void no5(Scanner scan) {
        System.out.println("masukan rupiah");
        double rupiah = scan.nextInt();
        System.out.println("Dikonversikan ke  SGD|USD|RMB|EURO");
        String konversi = scan.next();

        switch (konversi.toLowerCase()) {
            case "sgd":
                double konversUang = rupiah / 9800;
                System.out.println(konversUang + " SGD");
                break;
            case "usd":
                konversUang = rupiah / 13000;
                System.out.println(konversUang + " USD");
                break;
            case "rmb":
                konversUang = rupiah / 2000;
                System.out.println(konversUang + " RMB");
                break;
            case "euro":
                konversUang = rupiah / 15800;
                System.out.println(konversUang + " EURO");
                break;
        }
    }

    public static void no6(Scanner scan) {
        System.out.println("planet1");
        String planet1 = scan.next().toLowerCase();
        System.out.println("planet2");
        String planet2 = scan.next().toLowerCase();
        int jarakMV = 108000000;
        int jarakVE = 162000000;
        int jarakEM = 225000000;
        if (planet1.equals("mercury")) {
            if (planet2.equals("venus")) {
                System.out.println("Jaraknya adalah " + jarakMV);
            } else if (planet2.equals("earth")) {
                System.out.println("Jaraknya adalah " + jarakMV + jarakVE);
            } else if (planet2.equals("mars")) {
                System.out.println("Jaraknya adalah " + jarakMV + jarakVE + jarakEM);
            }
        } else if (planet1.equal("earth")) {
            if (planet2.equals("mars")) {
                System.out.println("Jaraknya adalah " + jarakEM);
            } else if (planet2.equals("mercury")) {
                System.out.println("Jaraknya adalah " + jarakVE + jarakMV);
            } else if (planet2.equals("venus")) {
                System.out.println("Jaraknya adalah " + jarakVE);
            }
        }
    }
}
