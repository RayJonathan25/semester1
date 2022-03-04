package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class selectionSortDescending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa jumlah Angka yang akan dimasukan ke database");
        int jumlah = scan.nextInt();
        int[] database = new int[jumlah];
        int temp = 0;
        int tempMax = 0;

        for (int i = 0; i < database.length; i++) {
            System.out.println("Masukan angka ke - " + i);
            database[i] = scan.nextInt();
        }

        for (int i = 0; i < database.length; i++) {
            tempMax = i;
            for (int j = i + 1; j < database.length; j++) {
                if (database[tempMax] < database[j]) {
                    tempMax = j;
                }
                temp = database[i];
                database[i] = database[tempMax];
                database[tempMax] = temp;
            }

            System.out.println(Arrays.toString(database));
        }
    }
}