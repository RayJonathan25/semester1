package For;

import java.util.Scanner;

public class bentukbentuka {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Baris :");
        int baris = scan.nextInt();

        for (int j = 1; j <= baris; j++){
            for (int i = 1; i <= j; i++){
                System.out.print("kontol");
            }
            System.out.println();
        }

    }
}