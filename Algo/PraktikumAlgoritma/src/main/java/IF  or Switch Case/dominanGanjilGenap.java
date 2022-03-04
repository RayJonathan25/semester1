import java.util.Scanner;
public class dominanGanjilGenap {
    public static void main(String[] args) {
        
        int angka1, angka2, angka3;
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Masukan angka ke-1 : ");
            angka1 = scan.nextInt();
        System.out.println("Masukan angka ke-2 : ");
            angka2 = scan.nextInt();
        System.out.println("Masukan angka ke-3 : ");
            angka3 = scan.nextInt();
            
        if(angka1%2==0&&angka2%2==0&&angka3==0){
             System.out.println("Dominan Genap");
        }
            else if(angka1%2==0&&angka2!=0&&angka3==0){
             System.out.println("Dominan Genap");
            }
            else if(angka1%2!=0&&angka2!=0&&angka3==0){
                System.out.println("Dominan Ganjil");
            }
            else{System.out.println("Dominan Ganjil");
            }
               
       scan.close();         
    }
}
           
           
            