package Struct;

public class Struct1 {

  static class city {
    String nama;
    String provinsi;
    double latitude;
    double longtitude;
  }

  public static void main(String[] args) {
    city[] cities = new city[3];
    cities[0] = generateCity("Bandung", "Jawa Barat", -6.914, 107.609);
    cities[1] = generateCity("Medan", "Sumatera Utara", 3.597, 98.67);
    cities[2] = generateCity("Jambi", "Sumatra", -1.609, 103.6);
    for (int i = 0; i < cities.length; i++) {
      System.out.println(cities[i].nama);
      System.out.println(cities[i].provinsi);
      System.out.println(cities[i].latitude);
      System.out.println(cities[i].longtitude);
      System.out.println("");
    }
  }

  public static city generateCity(
      String nama,
      String provinsi,
      Double latitude,
      Double longtitude) {
    city cty = new city();
    cty.nama = nama;
    cty.provinsi = provinsi;
    cty.latitude = latitude;
    cty.longtitude = longtitude;
    return cty;
  }
}
