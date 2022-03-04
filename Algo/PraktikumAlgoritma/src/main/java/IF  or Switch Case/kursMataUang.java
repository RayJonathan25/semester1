import java.util.Scanner;
public class kursMataUang {
    public static void main(String[] args){
        int uang,konversi=0,hasilKonversi;
        String mataUang;
      Scanner scan = new Scanner(System.in);
      
        System.out.println("Masukan brp uang yang ingin di konversikan : ");
        uang = scan.nextInt();
        System.out.println("Ingin di konversikan ke ? (SGD,USD,RMB,Euro)");
        mataUang = scan.next();
        
        switch(mataUang) {
         
            case "SGD" :
                konversi = 9800;
            break;
            
            case "USD" :
                konversi = 13000;
            break;
            
            case "RMB" :
                konversi = 2000;
            break;
            
            case "Euro" :
                konversi = 15800;
            break;
            
            default :
            System.out.println("Perhatikan penulisan Mata Uang");
                
        } 
        
        hasilKonversi = uang/konversi;
        System.out.println("Uang anda setelah di konversi adalah : " + hasilKonversi);
                
    }
}
