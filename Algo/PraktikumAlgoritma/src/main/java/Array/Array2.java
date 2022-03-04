package Array;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Array2 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Masukan jumlah nama yang akan dimasukan : ");
    int jumlahNama = scan.nextInt();
    String[] Database = new String[jumlahNama];

    for (int i = 0; i < Database.length; i++) {
      System.out.println("Masukan nama-nama yang ingin dimasukan : ");
      Database[i] = scan.next();
    }

    String namaAwal = JOptionPane.showInputDialog(
      null,
      Arrays.toString(Database) + "\nMasukan nama yang ingin diganti"
    );
    String namaBaru = JOptionPane.showInputDialog(
      null,
      "Nama yang baru adalah  :  "
    );

    for (int i = 0; i < Database.length; i++) {
      if (Database[i].toLowerCase().equals(namaAwal.toLowerCase())) {
        Database[i] = namaBaru;
      } else {
        System.out.println("Error");
      }
    }
    JOptionPane.showMessageDialog(null, Arrays.toString(Database));
  }
}
