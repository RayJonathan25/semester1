package For;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan kata yang ingin dicheck : ");
        String s = scan.nextLine();
        System.out.println(s);
        
        s = s.toLowerCase();
        boolean hasilAkhir;
        hasilAkhir = testPalindrom(s);

        if (hasilAkhir) {
            System.out.println("tipe Palindrom");
        } else {
            System.out.println("Bukan palindrom");
        }

    }

    public static boolean testPalindrom(String pln) {
        boolean hasil = false;
        int pembanding = 0;
        int batas = pln.length() / 2;
        for (int i = 0; i < batas; i++) {
            if (pln.charAt(i) == pln.charAt(pln.length() - (i + 1))) {
                pembanding++;
            }

        }

        if (pembanding == batas) {
            hasil = true;
        }
        return hasil;

    }
}
