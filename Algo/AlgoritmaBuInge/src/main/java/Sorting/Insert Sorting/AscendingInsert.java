
import java.util.Scanner;

public class AscendingInsert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Jumlah Array: ");
        int jumlah = scanner.nextInt();

        int a[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input Array: ");
            a[i] = scanner.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > temp) {
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
    }
}
