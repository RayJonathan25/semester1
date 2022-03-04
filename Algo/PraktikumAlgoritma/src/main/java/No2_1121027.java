import java.util.Scanner;

public class No2_1121027 {

  public static void main(String[] args) {
    String nama, alamat, telepon, gender;
    int usia;
    boolean status;
    double penghasilan;
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan nama anda");
    nama = scan.nextLine();
    System.out.println("Masukan alamat anda");
    alamat = scan.nextLine();
    System.out.println("Masukan telepon anda");
    telepon = scan.nextLine();
    System.out.println("Masukan gender anda Laki-laki atau Perempuan");
    gender = scan.nextLine();
    System.out.println("Masukan usia anda");
    usia = scan.nextInt();
    System.out.println(
      "Masukan status anda apakah sudah Menikah atau Belum Menikah. True jika sudah False jika belum"
    );
    status = scan.nextBoolean();

    System.out.println("Masukan penghasilan anda per Bulan");
    penghasilan = scan.nextDouble();

    System.out.println("Nama = " + nama);
    System.out.println("alamat = " + alamat);
    System.out.println("Telepon = " + telepon);
    System.out.println("Gender = " + gender);
    System.out.println("Usia = " + usia);
    System.out.println("Status = " + status);
    System.out.println("Penghasilan = " + penghasilan);
  }
}
