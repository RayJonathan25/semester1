package Structure;

import java.util.Scanner;

class Perusahaan {
    String golongan, nama;
    int upahBiasa, upahLembur, upahTotal, hari1, hari2, hari3, hari4, hari5, hari6, hari7;
}

public class upahStructure {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa banyak jumlah pegawai : ");
        int Jumlah = scan.nextInt();

        Perusahaan[] prsh = new Perusahaan[Jumlah];

        for (int i = 0; i < Jumlah; i++) {
            prsh[i] = new Perusahaan();

            System.out.println("Masukan golongan anda : ");
            prsh[i].golongan = scan.next();

            System.out.println("Masukan nama anda : ");
            prsh[i].nama = scan.next();

            System.out.println("Berapa Jam anda kerja di hari ke-1 : ");
            prsh[i].hari1 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-2 : ");
            prsh[i].hari2 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-3 : ");
            prsh[i].hari3 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-4 : ");
            prsh[i].hari4 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-5 : ");
            prsh[i].hari5 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-6 : ");
            prsh[i].hari6 = scan.nextInt();

            System.out.println("Berapa Jam anda kerja di hari ke-7 : ");
            prsh[i].hari7 = scan.nextInt();

            int upah = upahPerJam(prsh[i].golongan);

            int jumlahJamNormal = prsh[i].hari1 + prsh[i].hari2 + prsh[i].hari3 + prsh[i].hari4 + prsh[i].hari5;

            if (jumlahJamNormal > 40) {
                prsh[i].upahBiasa = upahBiasa(40, upah);
                prsh[i].upahLembur = (int) upahLembur((jumlahJamNormal - 40) + prsh[i].hari6, 1.5, upah);
            } else {
                prsh[i].upahBiasa = upahBiasa(jumlahJamNormal, upah);
                prsh[i].upahLembur = (int) upahLembur(prsh[i].hari6, 1.5, upah);
            }

            prsh[i].upahLembur += (int)upahLembur( prsh[i].hari7 , 2, upah);
            prsh[i].upahTotal = (int) upahTotal(prsh[i].upahTotal, prsh[i].upahBiasa);
        }

        System.out.println("==================================================================================================");
        System.out.println("|Nama\t|Golongan\t|Upah Biasa\t|Upah Lembur\t|Upah Total\t|");
        System.out.println("==================================================================================================");
        
        
        for(int i = 0; i < Jumlah;i++){
            System.out.println("|"+ prsh[i].nama + "\t|" + prsh[i].golongan + "\t|" + prsh[i].upahBiasa + "\t|" + prsh[i].upahLembur + "\t|" + prsh[i].upahTotal+ "\t|");
       
        }    
    }

    static int upahPerJam(String golongan) {
        int upah = 0;
        switch (golongan) {
        case "A":
            upah = 10000;
            break;
        case "B":
            upah = 12000;
            break;
        default:
            upah = 15000;
            break;
        }
        return upah;
    }

    static int upahBiasa(int jJam, int up) {
        return jJam * up;
    }

    static double upahLembur(int jJam, double besar, int up) {
        return jJam * (up * besar);
    }

    static double upahTotal(double ul, int ub) {
        return ul + ub;
    }

}
