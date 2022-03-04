package Sorting;

import java.util.Scanner;
import java.util.Arrays;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa jumlah Angka yang akan dimasukan ke database");
        int jumlah = scan.nextInt();
        int [] database = new int[jumlah];
        int temp = 0; 
        for (int i = 0; i < database.length; i++) {
            System.out.println("Masukan angka ke - " + i);
            database[i] = scan.nextInt();
        }

        for (int i = 0; i < database.length; i++) {
            for (int j = 0; j < database.length - (i + 1); j++) {
                if (database[j] > database[j + 1]) {
                    temp = database[j + 1];
                    database[j + 1] = database[j];
                    database[j] = temp;
                }
            }
        }
       
        System.out.println(Arrays.toString(database));
    }
}
