package main.java;

import java.util.Scanner;

public class latihanUasWeek4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("masukan uang");
        int uang = scan.nextInt();
        int seratus = uang / 100;
        int empatpuluh = (uang % 100) / 40;
        int duapuluh = (uang % 100 % 40) / 20;
        int sepuluh = (uang % 100 % 40 % 20) / 10;
        int lima = (uang % 100 % 40 % 20 % 10) / 5;
        int satu = (uang % 100 % 40 % 20 % 10 % 5);

        System.out.print(seratus + " " + empatpuluh + " " + duapuluh + " " + sepuluh + " " + lima + " " + satu);
    }
}
