package Structure;

import java.util.Random;
import java.util.Scanner;

public class sequential {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int h=1;
        System.out.println("Berapa banyak database yang anda ingin buat ? ");
        int banyakDatabase = scan.nextInt();
        System.out.println("Masukan berapa banyak isi database" + h++ +":");
        int banyak = scan.nextInt();
        System.out.println("");

        int []database = Database(banyakDatabase,scan);
        int []input = inputAngka(banyak,scan);
        
    }

    public static int[] inputAngka(int sqt, Scanner sc) {
        int Input[] = new int[sqt];
        for (int i = 0; i < Input.length; i++) {
            System.out.print("Masukan Angka Ke-" + (i + 1) + " : ");
            Input[i] = sc.nextInt();
        }
        return  Input;
    }

    public static int[]  Database(int bnykDtbse,Scanner lm) {
        int database1[] = new int[bnykDtbse];
        for (int i = 0; i < database1.length; i++) {

        }

        return  database1;
    }
}
