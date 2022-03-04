package While;

import java.util.Scanner;

public class Whileno3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan angka yang ingin di Scan: ");
        int inputan = scan.nextInt();
        int temp = 0;
        int hasil = 0;

        while (inputan > 0 || inputan < 0) {
            temp = inputan / 10;

            hasil = (inputan % 10) + hasil * 10;

            inputan = temp;

        }
        System.out.println(hasil);
    }
}
