package Sorting;

import java.util.Random;
import java.util.Arrays;

public class optimasiAscendingDariDepan {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] random = new int[10];

        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(random));
        sorting(random);
    }

    public static void sorting(int random[]) {
        int temp;
        boolean exit = false;
        int index = 0;
        while (!exit) {
            Boolean check = false;
            for (int j = index; j < random.length - 1; j++) {

                if (random[j] > random[j + 1]) {
                    temp = random[j + 1];
                    random[j + 1] = random[j];
                    random[j] = temp;
                    check = true;
                }
            }
            exit = !check;
        }
        System.out.print(Arrays.toString(random));
    }

}
