package While;

import java.util.Scanner;

public class whileNo4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input angka: ");
        int input = scanner.nextInt();
        int temp = 1, hasil = 0, i = 0;
        while (hasil < input) {
            hasil += temp;
            temp = temp + 2;
            i++;
        }
        System.out.println("Jumlah Pengulangan: " + i);

    }
}
