import java.util.Scanner;
public class jarakPlanet {
    public static void main(String[] args) {
        String planet1,planet2;
        int jarakVM = 108000000,jarakVE = 162000000,jarakEM = 225000000,jarak;
        Scanner scan  = new Scanner(System.in);
        
        System.out.println("Masukan Planet anda pergi (Mercury,Venus,Earth,Mars");
        planet1 = scan.next();
        System.out.println("Masukan Planet tujuan anda (Mercury, Venus, Earth, Mars");
        planet2 = scan.next();
        
        if(planet1.equalsIgnoreCase("Mercury")&&planet2.equalsIgnoreCase("Venus")){
           jarakVM = 108000000;
            System.out.println("Jarak dari Mercury - Venus adalah : " +  jarakVM);
        }
        else if(planet1.equalsIgnoreCase("Venus")&&planet2.equalsIgnoreCase("Earth")){
           jarakVE = 162000000;
            System.out.println("Jarak dari Venus menuju Earth adalah : " + jarakVE);
        }
        else if (planet1.equalsIgnoreCase("Earth")&&planet2.equalsIgnoreCase("Mars")){
            jarakEM = 225000000;
            System.out.println("Jarak dari Earth menuju Mars adalah : " + jarakEM);
        }
        else if(planet1.equalsIgnoreCase("Mercury")&&planet2.equalsIgnoreCase("Mars")){
            jarak = jarakVM+jarakVE+jarakEM;
            System.out.println("Jarak dari Mercury menuju Mars adalah : " + jarak);
        }
        else if(planet1.equalsIgnoreCase("Mercury")&&planet2.equalsIgnoreCase("Earth")){
            jarak = jarakVM+jarakVE;
            System.out.println("Jarak dari Mercury menuju Earth adalah : " + jarak);
        }
        else if(planet1.equalsIgnoreCase("Venus")&&planet2.equalsIgnoreCase("Mercury")){
            jarak = jarakVE+jarakVM;
            System.out.println("Jarak dari Venus ke Mercury adalah : " + jarak);
        }
        else if(planet1.equalsIgnoreCase("Venus")&&planet2.equalsIgnoreCase("Mars")){
            jarak = jarakVE+jarakEM;
            System.out.println("Jarak dari Venus ke mars adalah : " + jarak);
        }
        else if(planet1.equalsIgnoreCase("Earth")&&planet2.equalsIgnoreCase("Mars")){      
        }
        else{
            System.out.println("Nama planet yang dimasukan tidak ada di database");
        }
}
}