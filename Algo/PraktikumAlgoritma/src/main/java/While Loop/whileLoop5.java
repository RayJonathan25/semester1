
import java.util.Scanner;

public class whileLoop5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input: ");
        int input = scan.nextInt();
        int itungan1 = 0;
        int itungan2 = 1;
        int fibonacci;
        String total = "";
        do {
            fibonacci = itungan1 + itungan2;
            itungan1 = itungan2;
            itungan2 = fibonacci;
            if (fibonacci <= input) {
                total = total + " " + fibonacci + " ";
            }
        } while (fibonacci < input);
        System.out.println("0  " + "1 " + total);
    }
}
