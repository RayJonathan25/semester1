
import java.util.Scanner;

public class whileLoop2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String decide;
        int i = 0, hasil = 0;
        while (!exit) {
            {
                System.out.println("Masukan angka yang ingin discan : ");
                int angka = scan.nextInt();

                System.out.println("Apakah masih ingin memasukan angka ? (y/n)");
                decide = scan.next();

                switch (decide) {
                    case "y":
                        i++;
                        break;

                    case "n":
                        exit = true;
                        break;

                    default:
                        System.out.println("Anda memasukan jawaban yang salah");
                        exit = true;
                }
                hasil = angka / i;
            }

        }
        System.out.println(hasil);
    }
}
