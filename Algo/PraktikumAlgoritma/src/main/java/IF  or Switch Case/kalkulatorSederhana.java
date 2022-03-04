
import java.util.Scanner;

public class kalkulatorSederhana {

    public static void main(String[] args) {
        float angka1, angka2, total;
        String operasi;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan angka 1 : ");
        angka1 = scan.nextFloat();
        System.out.println("Masukan Operasi bilangan [+][-][*][/]");
        operasi = scan.next();
        System.out.println("Masukan angka 2 : ");
        angka2 = scan.nextFloat();

        if (operasi.equals("+")) {
            total = angka1 + angka2;
            System.out.println(total);
        } else if (operasi.equals("-")) {
            total = angka1 - angka2;
            System.out.println(total);
        } else if (operasi.equals("*")){
        total = angka1 * angka2;
        System.out.println(total);
        } else if (operasi.equals("/")){
            total = angka1/angka2;
            System.out.println(total);
          }else{System.out.println("SALAH ANGKA BROW");
        }    
    }
}
 
