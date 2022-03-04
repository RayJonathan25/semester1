import java.util.Scanner;
public class perhitunganNA {

    public static void main(String[] args) {
    Scanner scn = new Scanner (System.in);
        // TODO code application logic here
        float quiz = 0;
        float AA;
        float a,b,c,d,e;
        
        System.out.println("Masukkan nilai 1 : ");
        a = scn.nextInt();
        System.out.println("Masukkan nilai 2 : ");
        b = scn.nextInt();
        System.out.println("Masukkan nilai 3 : ");
        c = scn.nextInt();
        System.out.println("Masukkan nilai 4 : ");
        d = scn.nextInt();
        System.out.println("Masukkan nilai 5 : ");
        e = scn.nextInt();
         System.out.println("Masukan nilai UTS :");
        float uts =scn.nextInt();
        System.out.println("Masukan nilai UAS :");
        float uas =scn.nextInt();
        
        if(a<b&&a<c&&a<d&&a<d&&a<e){
           quiz = (b+c+d+e)/4;
        }
        if(b<a&&b<c&&b<d&&b<e){
           quiz = (a+c+d+e)/4;
        }
        if(c<a&&c<b&&c<d&&c<e){
           quiz = (a+b+d+e)/4;
        }
        if(d<a&&d<b&&d<c&&d<e){
           quiz = (a+b+c+e)/4;
        }
        if(e<a&&e<b&&e<c&&e<d){
           quiz = (a+b+c+d)/4;
        }
        
        System.out.println("rata-rata Quiz : " +quiz);
                        
        AA = (float) ((0.25*quiz)+(0.25*uts)+ (0.50*uas));
        System.out.println("nilai AA : "+AA);
                        
        if (AA>=80){  
            System.out.println("NA : A");
            System.out.println("INA = 4");
        }else if (AA>=76){
                System.out.println("NA : A-");
                System.out.println("INA = 3.7");
        }else if(AA>=72){
                System.out.println("NA :B+");
                System.out.println("INA = 3.4");
        }else if(AA>=68){
                System.out.println("NA : B ");
                System.out.println("INA = 3");
        }else if(AA>=64){
                System.out.println("NA : B-");
                System.out.println("INA = 2.7");
        }else if(AA>=60){
                System.out.println("NA : C+");
                System.out.println("INA = 2.4");
        }else if(AA>=56){
                System.out.println("NA : C ");
                System.out.println("INA = 2");
        }else if (AA>=41){
                System.out.println("NA : D");
                System.out.println("INA = 1");
        }else if (AA<41){
                System.out.println("NA : E");
                System.out.println("INA = 0");
        }
    }
}