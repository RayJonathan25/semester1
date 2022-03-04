package Quis;

import java.util.Scanner;

public class No2B_1121027 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int operasiKali = 0;
    System.out.println("Masukan  berapa kali anda ingin mengulang : ");
    int n = scan.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i == 0) {
        operasiKali = 1;
      } else {
        operasiKali = (int) Math.pow(10, i) + operasiKali;
      }
      int total = (int) Math.pow(operasiKali, 2);
      System.out.println(
        "Jadi :  N = " +
        i +
        " : " +
        operasiKali +
        "x" +
        operasiKali +
        " = " +
        total
      );
    }
  }
}
