package For;


import java.util.Scanner;

public class empatE {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baris;
        System.out.println("Masukan Baris");
        baris = scan.nextInt();
        int bantuan = baris-1;

        for (int i = 1; i <= baris; i++) {
            for (int j = baris - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
            System.out.print(i);
            }
        System.out.println(" ");
        }
        
        for (int i = 1; i<=baris;i++){
            for(int j = i;j<=i;j++){
                System.out.print(" ");
            }
            for (int k = baris-1; k>=i;k--){
                System.out.print(k);
            }
        }
        System.out.println(" ");
    }
    
}
