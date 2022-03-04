package Sorting;

import java.util.Scanner;
import java.util.Arrays;
public class selectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan berapa jumlah Angka yang akan dimasukan ke database");
        int jumlah = scan.nextInt();
        int [] database = new int[jumlah];
        int temp = 0; 
        int tempMin=0;

        for (int i = 0; i < database.length; i++) {
            System.out.println("Masukan angka ke - " + i);
            database[i] = scan.nextInt();
        }

        for (int i = 0; i < database.length; i++) {
            tempMin=i;
            for (int j = i+1; j < database.length ; j++) {
                if (database[tempMin] > database[j]) {
                    tempMin = j;
                }
            }
            temp = database[i];
            database[i]=database[tempMin];
            database[tempMin]=temp;
        }
       
        System.out.println(Arrays.toString(database));
    }
}
