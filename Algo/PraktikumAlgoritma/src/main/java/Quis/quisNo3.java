package Quis;

import java.util.Scanner;

public class quisNo3 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan ketebalan frame : ");
    int ketebalan = scan.nextInt();
    for (int i = 1; i <= ketebalan; i++) {
      for (int j = 1; i <= j; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
