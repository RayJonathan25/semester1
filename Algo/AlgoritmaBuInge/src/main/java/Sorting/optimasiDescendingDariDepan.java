package Sorting;

import java.util.Random;
import java.util.Arrays;

public class optimasiDescendingDariDepan {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] random = { 6, 8, 3, 2, 7, 3 };
        System.out.println(Arrays.toString(random));
        sorting(random);
    }

    public static void sorting(int random[]) {
        int temp;
        boolean exit = false;
        while (!exit) {
            Boolean check = false;
            for (int j = 0; j < random.length - 1; j++) {

                if (random[j] < random[j + 1]) {
                    temp = random[j + 1];
                    random[j + 1] = random[j];
                    random[j] = temp;
                    check = true;
                }

            }

            System.out.println(Arrays.toString(random));
            exit = !check;
        }
        System.out.print(Arrays.toString(random));
    }

}
