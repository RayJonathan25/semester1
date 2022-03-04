package main.java;

public class haha {
    public static void main(String[] args) {
        int n = 5;
        int tebal = 3;
        int pembatas = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= pembatas; j++) {
                System.out.print(j);
            }
            for (int j = 1; j < pembatas; j++) {
                if (pembatas < n) {
                    System.out.print("*");
                } else {
                    System.out.print(pembatas);
                }
            }
            System.out.println(" ");
            pembatas++;
        }
        int pembatas2 = 0;
        for (int i = 3; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
