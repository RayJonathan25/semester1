package Structure;

import java.util.Scanner;

public class prosedurNo1{
    public static int rumusTotalQuis(int nilai1, int q2, int q3, int q4, int q5) {
        int hasil;
        if (nilai1 <= q2 && nilai1 <= q3 && nilai1 <= q4 && nilai1 <= q5) {
            hasil = (q2 + q3 + q4 + q5) / 4;
        } else if (q2 <= nilai1 && q2 <= q3 && q2 <= q4 && q2 <= q5) {
            hasil = (nilai1 + q3 + q4 + q5) / 4;
        } else if (q3 <= nilai1 && q3 <= q2 && q3 <= q4 && q3 <= q5) {
            hasil = (nilai1 + q2 + q4 + q5) / 4;
        } else if (q4 <= nilai1 && q4 <= q2 && q4 <= q3 && q4 <= q5) {
            hasil = (nilai1 + q2 + q3 + q5) / 4;
        } else {
            hasil = (nilai1 + q2 + q3 + q4) / 4;
        }
        return hasil;
    }
    public static double nilaiAkhir(int quis, int uas, int uts) {
        double hasil = (0.2 * quis) + (0.5 * uas) + (0.3 * uts);
        return hasil;
    }
    public static String hurufmutu(double hasil) {
        String huruf = "";
        if (hasil >= 80 && hasil <= 100) {
            huruf = "A";
        }else if (hasil >= 76) {
            huruf = "A-";
        }else if (hasil >= 72) {
            huruf = "B+";
        }else if (hasil >= 68) {
            huruf = "B";
        }else if (hasil >= 64) {
            huruf = "B-";
        }else if (hasil >= 60) {
            huruf = "C+";
        }else if (hasil >= 56) {
            huruf = "C";
        }else if (hasil >= 41) {
            huruf = "D";
        }else if (hasil < 41 && hasil >= 0) {
            huruf = "E";
        }
        return huruf;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa jumlah siswa");
        int jumlah=scan.nextInt();
        
        String [] nim = new String[jumlah];
        String [] nama = new String[jumlah];
        int[] nil1 = new int[jumlah];
        int[] nil2 = new int[jumlah];
        int[] nil3 = new int[jumlah];
        int[] nil4 = new int[jumlah];
        int[] nil5 = new int[jumlah];
        int[] nilUTS = new int[jumlah];
        int[] nilUAS = new int[jumlah];
        double [] rQuis = new double[jumlah];
        double [] nilAkhir = new double[jumlah];
        char [] nilMutu = new char[jumlah];
        
        for (int i = 0; i <jumlah; i++) {
            System.out.println("Mahasiswa ke : " + (i+1));
            System.out.println("Masukan NIM : ");
            nim[i]=scan.nextLine();
            System.out.println("Masukan Nama Anda : ");
            nama[i] = scan.nextLine();
           
        }
        
        int quis[] = new int[5];
        for (int i = 1; i <= 5; i++) {
            System.out.println("Input Rata-Rata: " + i);
            quis[i - 1] = scan.nextInt();
        }
        int rataakhir = rumusTotalQuis(quis[0], quis[1], quis[2], quis[3], quis[4]);
        System.out.println(rataakhir);

        System.out.println(nim);
        System.out.println(nama);
        System.out.println(nil1);
        System.out.println(nil3);
        System.out.println("Uas: ");
        int uas = scan.nextInt();
        System.out.println("Uts: ");
        int uts = scan.nextInt();

        double hasil = nilaiAkhir(rataakhir, uas, uts);
        String hurufmutu1 = hurufmutu(hasil);

        System.out.println("Nilai Akhir: "+hasil +" "+ hurufmutu1);
    }
}