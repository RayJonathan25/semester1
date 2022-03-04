package Quis;

import javax.swing.JOptionPane;

public class no3 {

  public static void main(String[] args) {
    double pajak = Double.parseDouble(
      JOptionPane.showInputDialog("Persentase Pajak : ")
    );
    int gaji = Integer.parseInt(JOptionPane.showInputDialog("Gaji : "));
    int bonus = Integer.parseInt(JOptionPane.showInputDialog("Bonus : "));
    int denda = Integer.parseInt(JOptionPane.showInputDialog("Denda : "));

    double pajakk = pajak / 100;
    int penghasilan = gaji + bonus - denda;
    double Total = penghasilan - (penghasilan * pajakk);

    JOptionPane.showMessageDialog(null, "Total: " + Total);
  }
}
