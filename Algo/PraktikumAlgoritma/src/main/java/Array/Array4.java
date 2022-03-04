package Array;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah peserta");
        int Peserta = scan.nextInt();
        boolean exit = false;
        String[] namaPeserta = new String[Peserta];
        for (int i = 0; i < namaPeserta.length; i++) {
            System.out.println("Masukan nama orang ke - " + i);
            namaPeserta[i] = scan.next();
        }

        System.out.println("Berapa Kali Lompatan  : ");
        int n = scan.nextInt();
        int i = -1;

        while (!exit) {

            for (int j = 0; j < n; j++) { 
                if((i >= namaPeserta.length)){
                    i = 0;
                }else{
                    i++;
                } 
            }

            namaPeserta[i] = "";
              

            int counter = 0;
            for (int j = 0; j < namaPeserta.length; j++) {
                if (!namaPeserta[j].equals("")) {
                    counter++;
                }
            } 
            if (counter == 1) {
                exit = true;
            } 
        }

        for (int j = 0; j < namaPeserta.length; j++) {
            if (!namaPeserta[j].equals("")) {
                System.out.println(namaPeserta[j]);
            }
        }

    }
}
