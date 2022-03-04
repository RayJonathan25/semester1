package Sorting;

import java.util.Random;
import java.util.Arrays;

public class descendingbubble {
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
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random.length - 1; j++) {
                if (random[j] < random[j + 1]) {
                    temp = random[j + 1];
                    random[j + 1] = random[j];
                    random[j] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(random));
    }
}