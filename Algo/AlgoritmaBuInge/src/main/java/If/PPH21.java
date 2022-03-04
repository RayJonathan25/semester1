package If;

import java.util.Scanner;
public class PPH21 {
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         
         System.out.println("Gaji Bruto/ bulan : ");
         int bruto = scn.nextInt();
         int a = bruto * 12;
         System.out.println("Gaji Bruto/tahun : Rp " +a);
         System.out.println("Berapa gaji jabatan per tahun ? ");
         int b = scn.nextInt();
         System.out.println("Berapa iuran pensiun per tahun ? ");
         int c = scn.nextInt();
         System.out.println("Gaji neto : ");
         int neto = (bruto*12)-b-c;
         System.out.println("Besar penghasilan neto : Rp " +neto);
         System.out.println("Apakah sudah menikah? [y/n]");
         String menikah = scn.next();
         int ptkp=0;
         if(menikah.equalsIgnoreCase("y")){
             System.out.println("Punya anak berapa ? ");
             int anak = scn.nextInt();
             ptkp = 54000000 + (4500000*anak);
             if(anak>=3){
                 ptkp = 54000000 + (4500000*3);
             }
             System.out.println("Penghasilan PTKP : " +ptkp);
         }else{
             ptkp= 54000000;
             System.out.println("Penghasilan PTKP : Rp " +ptkp);
         }
          int pkp, pph1,pph2, jpph;
          pkp = neto-ptkp;
          System.out.println("Penghasilan kena pajak : Rp " +pkp);
          System.out.println("Apakah punya NPWP? [y/n]");
          String npwp = scn.next();
          if(npwp.equalsIgnoreCase("y")){
              pph1 = (int) (0.05 * 50000000);
              pph2 = (int) (0.15 * (pkp-50000000));
              jpph = pph1 + pph2;
              System.out.println("Jumlah PPH : Rp " +jpph);
          }else{
              pph1 = (int) (0.05 * 1.2 * 50000000);
              pph2 = (int) (0.15 * 1.2 * (pkp-50000000));
              jpph = pph1 + pph2;
              System.out.println("Jumlah PPH : Rp " +jpph);
          }
         
         
    }
    
}   