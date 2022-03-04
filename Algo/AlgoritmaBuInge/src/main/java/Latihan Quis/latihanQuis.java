import java.util.Scanner;

public class latihanQuis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa banyak pemain ");
        int jumlahPemain = scan.nextInt();
        int jumlah[] = new int[jumlahPemain];

        if (jumlah.length == 2 || jumlah.length == 3 || jumlah.length == 5) {
            for (int i = 0; i < jumlah.length; i++) {
                System.out.println("Masukan MMR pemain ke : " + (i + 1));
                jumlah[i] = scan.nextInt();
            }

        }

        System.out.println("MMR tertinggi adalah : " + mmrTertinggi(jumlah));
        System.out.println("MMR terendah adalah : " + mmrTerendah(jumlah));
        System.out.println("Status Game : " + Range(jumlah));
    }

    static int mmrTertinggi(int jumlahMmr[]) {
        int tertinggi = 0;
        for (int i = 0; i < jumlahMmr.length; i++) {
            if (jumlahMmr[i] > tertinggi) {
                tertinggi = jumlahMmr[i];
            }

        }

        return tertinggi;

    }

    static int mmrTerendah(int jumlahMmr[]) {
        int terendah = Integer.MAX_VALUE;
        for (int i = 0; i < jumlahMmr.length; i++) {
            if (jumlahMmr[i] < terendah) {
                terendah = jumlahMmr[i];
            }

        }

        return terendah;

    }

    static boolean Range(int jumlahMmr[]) {
        boolean range = true;
        int totalrange = 0;
        totalrange = mmrTertinggi(jumlahMmr) - mmrTerendah(jumlahMmr);
        if (totalrange == 1800 || totalrange == 2400 || totalrange == 2700) {
            range = false;
        }

        return range;
    }
}
