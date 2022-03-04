package ForLoop;

import java.util.Scanner;

public class loop {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan berapa baris yang diinginkan : ");
    int Baris = scan.nextInt();
    for (int i = 0; i <= Baris; i++) {
      for (int j = Baris; j >= i + 1; j--) {
        System.out.print("  ");
      }
      for (int k = 1; k <= i + 1; k++) {
        System.out.print(k + i + " ");
      }
      for (int l = i; l >= 1; l--) {
        System.out.print(l + i + " ");
      }
      System.out.println();
    }
  }
}
