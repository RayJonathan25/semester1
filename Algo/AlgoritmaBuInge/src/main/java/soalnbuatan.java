
import java.util.Scanner;

public class soalnbuatan {

    public static void main(String[] args) {
        int e, f, g, h;
        e = 1;
        f = 7;
        g = 2;
        h = 3;

        for (int i = 1; i <= e; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("E");
            }
            System.out.println(" ");
        }

        for (int i = 1; i <= g; i++) {
            for (int j = 1; j <= i * 2; j++) {
                System.out.print("E");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= g; j++) {
                System.out.print("E");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= e; i++) {
            for (int j = 0; j < f; j++) {
                System.out.print("E");
            }
            System.out.println(" ");

        }
    }
}
