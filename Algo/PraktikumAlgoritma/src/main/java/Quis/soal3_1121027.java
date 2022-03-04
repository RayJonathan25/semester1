package Quis;

import java.util.Random;

public class soal3_1121027 {

  public static void main(String[] args) {
    // Random
    Random random = new Random();

    int n = random.nextInt(8) + 2;
    System.out.println(n);

    // simbol simbol untuk pembuatan program
    char simbol1 = '=';
    char simbol2 = 'o';
    char simbol3 = '*';

    int untukMembuatBagianTengah = 1;

    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print(simbol1 + " ");
      }
      System.out.print(" ");
      for (int j = 1; j <= untukMembuatBagianTengah; j++) {
        if (j % 2 == 0) {
          System.out.print(simbol3 + " ");
        } else {
          System.out.print(simbol2 + " ");
        }
      }

      System.out.print(" ");

      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      untukMembuatBagianTengah += 2;
      System.out.println();
    }

    System.out.print(" ");

    for (int i = 1; i <= untukMembuatBagianTengah; i++) {
      if (i % 2 == 0) {
        System.out.print(simbol3 + " ");
      } else {
        System.out.print(simbol2 + " ");
      }
    }
    System.out.print(" ");
    System.out.println();
    untukMembuatBagianTengah -= 2;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }

      System.out.print(" ");
      for (int j = untukMembuatBagianTengah; j >= 1; j--) {
        if (j % 2 == 0) {
          System.out.print(simbol3 + " ");
        } else {
          System.out.print(simbol2 + " ");
        }
      }

      System.out.print(" ");

      for (int j = 1; j <= i; j++) {
        System.out.print(simbol1 + " ");
      }

      untukMembuatBagianTengah -= 2;
      System.out.println();
    }
  }
}
