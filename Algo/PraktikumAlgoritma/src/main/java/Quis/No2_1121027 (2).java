import java.util.Random;

public class No2_1121027 {
    public static void main(String[] args) {
        Random random = new Random();
        int x,y;
        double perhitunganCartesius,titikPolar;
        x = random.nextInt(100)+1;
        y = random.nextInt(100)+1;

        perhitunganCartesius = Math.round(Math.sqrt(Math.pow(x,2) + Math.pow(y,2)));
        titikPolar = Math.round(Math.atan((x / y)));
        System.out.println(perhitunganCartesius);
        System.out.println(titikPolar);
    }
}