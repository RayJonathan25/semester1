package Array;

import java.util.Arrays;
import java.util.Random;

public class Array3 {

  public static void main(String[] args) {
    Random rand = new Random();
    int[] nilaiRandom = new int[15];
    int counter = 1;

    for (int i = 0; i < nilaiRandom.length; i++) {
      nilaiRandom[i] = rand.nextInt(50) + 1;
    }

    System.out.println(Arrays.toString(nilaiRandom));
    System.out.println(Arrays.toString(sorting(nilaiRandom)));
    nilaiRandom = sorting(nilaiRandom);
    int temp = 1;
    int hasilAngka = 0;
    int angkaSekarang = nilaiRandom[0];
    for (int i = 1; i < nilaiRandom.length; i++) {
      if (nilaiRandom[i] == angkaSekarang) {
        temp++;
        if (counter < temp) {
          hasilAngka = nilaiRandom[i];
          counter = temp;
        }
      } else {
        temp = 1;
        angkaSekarang = nilaiRandom[i];
      }
    }
    System.out.println(
      "Hasil  perulangan paling banyak adalah : " +
      hasilAngka +
      " " +
      "dengan jumlah : " +
      counter
    );
  }

  public static int[] sorting(int nilai[]) {
    int temp = 0;
    for (int i = 0; i < nilai.length; i++) {
      for (int j = 0; j < nilai.length - (i + 1); j++) {
        if (nilai[j] > nilai[j + 1]) {
          temp = nilai[j + 1];
          nilai[j + 1] = nilai[j];
          nilai[j] = temp;
        }
      }
    }
    return nilai;
  }
}
