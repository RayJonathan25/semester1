
import java.util.Scanner;

public class AscendingReverseInsert {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("total array : ");
        int jumlah = scanner.nextInt();

        int a[] = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Input Array: ");
            a[i] = scanner.nextInt();
        }
        for (int i = a.length - 1; i >= 0; i--) {
            int temp = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] > temp) {
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("============================");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
