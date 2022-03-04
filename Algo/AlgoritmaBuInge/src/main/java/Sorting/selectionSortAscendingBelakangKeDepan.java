package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSortAscendingBelakangKeDepan {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan berapa jumlah Angka yang akan dimasukan ke database");
    int jumlah = scan.nextInt();
    int[] database = { 6, 8, 3, 2, 7, 3 };
    int temp = 0;
    int tempMax = 0;

    for (int i = database.length - 1; i > 0; i--) {
      tempMax = i;
      for (int j = i - 1; j >= 0; j--) {
        if (database[tempMax] < database[j]) {
          tempMax = j;
        }
      }
      temp = database[tempMax];
      database[tempMax] = database[i];
      database[i] = temp;

      System.out.println(Arrays.toString(database));
    }
  }
}
1