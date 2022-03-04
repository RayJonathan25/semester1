package Array;

import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double rataRata = 0;
        int temp = 0;
        double median = 0;
        System.out.println("Berapa jumlah data yang ingin dibuat ?");
        int data = scan.nextInt();
        int[] Database = new int[data];

        // mencari Rata-rata
        for (int i = 0; i < Database.length; i++) {
            System.out.println("Berapa Jumlah yang ingin dimasukan");
            Database[i] = scan.nextInt();
            rataRata += Database[i];
        }
        rataRata = rataRata / Database.length;
        System.out.println("Rata-Rata : " + rataRata);
        for (int i = 0; i < Database.length; i++) {
            for (int j = 0; j < Database.length - (i + 1); j++) {
                if (Database[j] > Database[j + 1]) {
                    temp = Database[j + 1];
                    Database[j + 1] = Database[j];
                    Database[j] = temp;
                }
            }
        }

        // Mencari Median
        int indexTengah = Database.length / 2;
        if (Database.length % 2 == 0) {
            System.out.println(Database[indexTengah - 1] + Database[indexTengah] / 2);
        } else {
            System.out.println(Database[indexTengah]);
        }
        System.out.println("Mediannya adalah : " + (Arrays.toString(Database)));

        // Mencari nilai tertinggi
        int nilaiMaksimum = Database[0];

        for (int i = 1; i < Database.length; i++) {
            if (Database[i] > nilaiMaksimum) {
                nilaiMaksimum = Database[i];
            }
        }
        System.out.println("Nilai maksimumnya adalah : " + Arrays.toString(Database));
        
        //Mencari nilai minimum
        int nilaiMinimum = Database[0];

        for (int i = 1; i < Database.length; i++) {
            if (Database[i] < nilaiMinimum) {
                nilaiMinimum = Database[i];
            }
        }
        System.out.println("Nilai minimumnya adalah : "  + Arrays.toString(Database));
    }

}
