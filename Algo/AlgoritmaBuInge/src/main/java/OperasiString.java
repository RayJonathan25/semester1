import java.util.Scanner;

public class OperasiString {
    /** menghitung vokal */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan teks: ");
        String s = scan.nextLine();

        int jumlahVokal = 0;
        s = s.toLowerCase();
        jumlahVokal = paramaterString(s);
        System.out.println("Teks setelah lowercase : " + s);
        System.out.println("Jumlah char : " + s.length());
        System.out.println("Jumlah huruf vokal: " + jumlahVokal);

    }

    public static int paramaterString(String test) {
        int hasilAkhir = 0;

        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == 'a' || test.charAt(i) == 'i' || test.charAt(i) == 'u' || test.charAt(i) == 'e'
                    || test.charAt(i) == 'o') {
                hasilAkhir++;
            }

        }

        return hasilAkhir;
    }
}
