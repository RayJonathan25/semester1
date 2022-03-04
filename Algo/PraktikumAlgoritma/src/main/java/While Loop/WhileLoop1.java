
import java.util.Scanner;

public class WhileLoop1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan mata uang yang ingin dipecah : ");
        int jumlah = scan.nextInt();
        int temp = 0, pembagian = 100, i = 0;

        do {
            temp = jumlah / pembagian;
            if (temp != 0) {
                System.out.println(temp + "lembar" + pembagian);
            }
            jumlah = jumlah - temp * pembagian;
            switch (pembagian) {
                case 100:
                    pembagian = pembagian - 60;
                    break;
                case 5:
                    pembagian = 1;
                    break;
                default:
                    pembagian = pembagian / 2;
            }
            i++;
        } while (i < 6);
    }
}
