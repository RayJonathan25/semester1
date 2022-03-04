package Structure;


import java.util.Arrays;
import java.util.Scanner;

public class sequentialSearch2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah angka di database A : ");
        int jumlahAngka = scan.nextInt();
        int[] angka = Database(jumlahAngka,scan);
        System.out.print("Masukan Angka Yang Ingin Di Cari di database : ");
        int angkadicari = scan.nextInt();

        System.out.println("Banyaknya angka " + angkadicari + " = " + searchSequential(angka,angkadicari));
    }

    public static int[] Database(int jumlah,Scanner sc){
        int[] databaseA = new int[jumlah];

        for (int i = 0; i < databaseA.length;i++){
            System.out.print("Masukan Angka Ke-" + (i + 1) + " : ");
            databaseA[i] = sc.nextInt();
        }

        return databaseA;
    }

    public static int searchSequential(int[] angkas,int serach){
        int jumlah = 0;

        for (int i = 0; i < angkas.length; i++) {
            if(angkas[i] == serach){
                jumlah++;
            }
        }
        return jumlah;

    }
}