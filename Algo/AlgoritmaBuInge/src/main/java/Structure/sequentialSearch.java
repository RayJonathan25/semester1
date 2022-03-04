package Structure;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class sequentialSearch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Masukan berapa banyak angka yang akan diinput di database : ");
        int total = scan.nextInt();

        System.out.println("Angka apa yang ingin dicari :  ");
        int angka = scan.nextInt();

        int[] database = new int[total];
        
        int[] database2 = new int[total];

        for (int i = 0; i < database.length; i++) {
            database[i] = rand.nextInt(5);
        }

        for (int i = 0; i < database.length; i++) {
            database2[i] = rand.nextInt(5);
        }
        
        System.out.println(Arrays.toString(database));
        System.out.println(Arrays.toString(database2));
        System.out.println("Posisi : " + pencarian(angka, database));
        System.out.println("Posisi Database 2 : " + pencarian(angka, database2));

    }

    public static int pencarian(int sqt, int[] pencarian) {
        int i = 0;
        int posisi = 0;
        while (i < pencarian.length) {
            if (pencarian[i] == sqt) {
                posisi=i;
            }
            i++;
        }

        return posisi;

    }

}