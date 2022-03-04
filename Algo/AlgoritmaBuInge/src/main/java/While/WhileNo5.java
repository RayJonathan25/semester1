package While;

import java.util.Scanner;

public class WhileNo5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int digit = 0, angka, temp, multiplier = 10, hasil = 0, devider;

        System.out.print("Masukan Angka : ");
        angka = scan.nextInt();
        temp = angka;
        devider = angka;
        while (angka > 0) {
            angka = angka / 10;
            digit++;
        }

        for (int i = digit; i >= 1; i--) {
            int sisabagi = temp % (multiplier);
            int hasilKali = 1;
            for (int j = 1; j <= digit; j++) {
                hasilKali *= sisabagi;
            }
            hasil += hasilKali;
            temp = (temp - sisabagi) / 10;
        }

        if (hasil == devider) {
            System.out.println("Bilangan Armstrong");
        } else {
            System.out.println("Bukan Bilangan Armstrong");
        }
    }
}
