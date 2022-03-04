package Structure;

import java.util.Scanner;

class Mahasiswa {

    String nim;
    String nama;
    int nil1;
    int nil2;
    int nil3;
    int nil4;
    int nil5;
    int nilUTS;
    int nilUAS;
    double rQuis;
    double nilAkhir;
    String nilMutu;
}

public class penilaianStructure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa banyak siswa : ");
        int jumlahMahasiswa = scan.nextInt();

        Mahasiswa[] mhs = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i <jumlahMahasiswa; i++) {
            mhs[i] = new Mahasiswa();

            System.out.println("Masukan nama anda : ");
            mhs[i].nama = scan.next();

            System.out.println("Masukan NIM anda : ");
            mhs[i].nim = scan.next();

            System.out.println("Masukan Nilai ke-1 : ");
            mhs[i].nil1 = scan.nextInt();

            System.out.println("Masukan Nilai ke-2 : ");
            mhs[i].nil2 = scan.nextInt();

            System.out.println("Masukan Nilai ke-3 : ");
            mhs[i].nil3 = scan.nextInt();

            System.out.println("Masukan Nilai ke-4 : ");
            mhs[i].nil4 = scan.nextInt();

            System.out.println("Masukan Nilai ke-5 : ");
            mhs[i].nil5 = scan.nextInt();

            System.out.println("Masukan Nilai UTS : ");
            mhs[i].nilUTS = scan.nextInt();

            System.out.println("Masukan Nilai UAS : ");
            mhs[i].nilUAS = scan.nextInt();

           mhs[i].rQuis=rumusTotalQuis(mhs[i].nil1,mhs[i].nil2,mhs[i].nil3,mhs[i].nil4, mhs[i].nil5);
           mhs[i].nilAkhir=nilaiAkhir(mhs[i].rQuis, mhs[i].nilUTS, mhs[i].nilUAS);
           mhs[i].nilMutu=hurufMutu(mhs[i].nilAkhir);
        }

        System.out.println("================================================================================================");
        System.out.println("|NIM\t|\tNAMA\t|\tRata-Rata Quis\t|\tNilai Akhir\t|\tHuruf Mutu\t|");
        System.out.println("================================================================================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("|" + mhs[i].nim + "\t|\t" + mhs[i].nama + "\t|\t" + mhs[i].rQuis + "\t|\t" + mhs[i].nilAkhir + "\t|\t" + mhs[i].nilMutu + "\t|");
        }
        System.out.println("================================================================================================");
        scan.close();

    }

    public static String hurufMutu(double nilai) {
        String hurufMutu;

        if (nilai >= 80) {
            hurufMutu = "A";
        } else if (nilai >= 76) {
            hurufMutu = "A-";
        } else if (nilai >= 72) {
            hurufMutu = "B+";
        } else if (nilai >= 68) {
            hurufMutu = "B";
        } else if (nilai >= 64) {
            hurufMutu = "B-";
        } else if (nilai >= 60) {
            hurufMutu = "C+";
        } else if (nilai >= 56) {
            hurufMutu = "C";
        } else if (nilai >= 41) {
            hurufMutu = "D";
        } else {
            hurufMutu = "E";
        }

        return hurufMutu;
    }

    public static double nilaiAkhir(double nilaiQuis, int nilaiUts, int nilaiUas) {
        return (nilaiQuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.5);
    }

    public static double rumusTotalQuis(int nil1, int nil2, int nil3, int nil4, int nil5) {
        double hasil = 0;
        if (nil1 <= nil2 && nil1 <= nil3 && nil1 <= nil4 && nil1 <= nil5) {
            hasil = (nil2 + nil3 + nil4 + nil5) / 4;
        } else if (nil2 <= nil1 && nil2 <= nil3 && nil2 <= nil4 && nil2 <= nil5) {
            hasil = (nil1 + nil3 + nil4 + nil5) / 4;
        } else if (nil3 <= nil1 && nil3 <= nil2 && nil3 <= nil4 && nil3 <= nil5) {
            hasil = (nil1 + nil2 + nil4 + nil5) / 4;
        } else if (nil4 <= nil1 && nil4 <= nil2 && nil4 <= nil3 && nil4 <= nil5) {
            hasil = (nil1 + nil2 + nil3 + nil5) / 4;
        } else if (nil5 <= nil1 && nil5 <= nil2 && nil5 <= nil3 && nil5 <= nil4) {
            hasil = (nil1 + nil2 + nil3 + nil4) / 4;
        }
        return hasil;
    }
}
