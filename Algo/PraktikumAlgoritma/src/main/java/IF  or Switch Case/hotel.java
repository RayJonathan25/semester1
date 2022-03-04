import java.util.Scanner;
public class hotel {
    public static void main(String[] args){
        String jenisKamar;
        int lamaInap,harga = 0;
        double pajak=0, total=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan Jenis Kamar yang ingin digunakan : Deluxe, Executive, Suite");
        jenisKamar = scan.next();
        System.out.println("Berapa lama anda akan menginap : ");
        lamaInap = scan.nextInt();
        
        switch(jenisKamar) {
            case "Deluxe":
                harga = 500000;
                pajak = 0.05;
            break;
            
            case "Executive":
                harga = 800000;
                pajak = 0.1;
            break;
            
            case "Suite":
                harga = 10000000;
                pajak = 0.15;
            break;
            
            default :
                System.out.println("Kamar yang tersedia : Deluxe, Executive,Suite. Tolong perhatikan huruf besar");
        }
        
         total = (lamaInap*harga)+(pajak*harga);
         System.out.println("Harga yang harus anda bayar adalah : " + total);
        
    }
    
}
