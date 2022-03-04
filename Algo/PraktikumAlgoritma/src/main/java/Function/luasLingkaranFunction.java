package Function;

public class luasLingkaranFunction {

  public static void main(String[] args) {
    double r = 7, phi = 3.14;
    double rumus = luasLingkaran(r, phi);
    System.out.println(rumus);
    double rumusKelilingLingkaran = kelilingLingkaran(r, phi);
  }

  public static double luasLingkaran(double r, Double p) {
    int luas = 0;
    luas = (int) (p * Math.pow(r, 2));
    return luas;
  }

  public static double kelilingLingkaran(double jariJari, double Phi) {
    double keliling = 0;
    keliling = 2 * Phi * jariJari;

    return keliling;
  }
}
