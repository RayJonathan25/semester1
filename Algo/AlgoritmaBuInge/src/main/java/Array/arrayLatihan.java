package Array;

import java.util.Scanner;

public class arrayLatihan {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan berapa banyak pemilih suara.");
        int pemilih = scan.nextInt();

        System.out.println("Calon 1 : Wawan ");
        System.out.println("Calon 2 : Suryani");
        System.out.println("Calon 3 : Suryajadi");

        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        String b[] = { "a" };
        for (int i = 1; i <= pemilih; i++) {
            System.out.println("");
            System.out.println("Pemilih : " + i + " Silahkan memilih suara");
            System.out.println("Pilih setiap calon dengan angkanya saja.");
            int paslon = scan.nextInt();
            a[paslon - 1] = a[paslon - 1] + 1;
        }
        System.out.println("==================================================");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Point paslon ke - " + (i + 1) + " = " + a[i]);
        }
    }

}
