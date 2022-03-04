package Structure;


import java.util.Scanner;

public class prosedurNo1a {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int jumlahMhs;
        String[] nim, nama;

        System.out.println("Masukan Jumlah Mahasiswa : ");
        jumlahMhs = scan.nextInt();

        nim = new String[jumlahMhs];
        nama = new String[jumlahMhs];
        int[] nil1 = new int[jumlahMhs];
        int[] nil2 = new int[jumlahMhs];
        int[] nil3 = new int[jumlahMhs];
        int[] nil4 = new int[jumlahMhs];
        int[] nil5 = new int[jumlahMhs];
        int[] nilUTS = new int[jumlahMhs];
        int[] nilUAS = new int[jumlahMhs];
        double[] rQuis = new double[jumlahMhs];
        double[] nilAkhir = new double[jumlahMhs];
        String[] nilMutu = new String[jumlahMhs];

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Masukan NIM : ");
            nim[i] = scan.next();
            System.out.println("Masukan Nama : ");
            nama[i] = scan.next();
            System.out.println("Masukan nilai Quis 1 : ");
            nil1[i] = scan.nextInt();
            System.out.println("Masukan nilai Quis 2 : ");
            nil2[i] = scan.nextInt();
            System.out.println("Masukan nilai Quis 3 : ");
            nil3[i] = scan.nextInt();
            System.out.println("Masukan nilai Quis 4 : ");
            nil4[i] = scan.nextInt();
            System.out.println("Masukan nilai Quis 5 : ");
            nil5[i] = scan.nextInt();
            System.out.println("Masukan nilai UTS : ");
            nilUTS[i] = scan.nextInt();
            System.out.println("Masukan nilai UAS : ");
            nilUAS[i] = scan.nextInt();
            rQuis[i] = rumusTotalQuis(nil1[i], nil2[i], nil3[i], nil4[i], nil5[i]);
            nilAkhir[i] = nilaiAkhir(rQuis[i], nilUTS[i], nilUAS[i]);
            nilMutu[i] = hurufMutu(nilAkhir[i]);
        }

        System.out.println("================================================================================================");
        System.out.println("|NIM\t|\tNAMA\t|\tRata-Rata Quis\t|\tNilai Akhir\t|\tHuruf Mutu\t|");
        System.out.println("================================================================================================");

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("|" + nim[i] + "\t|\t" + nama[i] + "\t|\t" + rQuis[i] + "\t|\t" + nilAkhir[i] + "\t|\t" + nilMutu[i] + "\t|");
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

    public static int rumusTotalQuis(int nil1, int nil2, int nil3, int nil4, int nil5) {
        int hasil = 0;
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
