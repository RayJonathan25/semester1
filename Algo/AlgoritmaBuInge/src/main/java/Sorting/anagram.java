package Sorting;

import java.util.Scanner;

public class anagram {

    public static char[] sorting(char inputKata[]) {
        char temp = 0;
        for (int i = 0; i < inputKata.length; i++) {
            for (int j = 0; j < inputKata.length - (i + 1); j++) {
                if (inputKata[j] > inputKata[j + 1]) {
                    temp = inputKata[j + 1];
                    inputKata[j + 1] = inputKata[j];
                    inputKata[j] = temp;
                }
            }
        }
        return inputKata;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Huruf apa yang ingin di Anagram : ");
        char kata[] = scan.next().toLowerCase().toCharArray();
        System.out.println("Masukan Huruf apa yang ingin di dibandingkan : ");
        char pembanding[] = scan.next().toLowerCase().toCharArray();
        System.out.println(sorting(kata));
        System.out.println(sorting(pembanding));

        if (kata.length == pembanding.length) {
            int counter = 0;
            for (int i = 0; i < kata.length; i++) {
                if (kata[i] == pembanding[i]) {
                    counter++;
                } else {
                    System.out.println("Bukan Anagram");
                }

            }
            ;
            if (counter == kata.length) {
                System.out.println("Anagram");
            }
        } else {
            System.out.println("Bukan Anagram");
        }
    }
}
