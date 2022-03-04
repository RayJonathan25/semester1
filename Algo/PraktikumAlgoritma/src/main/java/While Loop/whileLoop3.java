
import javax.swing.JOptionPane;

public class whileLoop3 {

    public static void main(String[] args) {
        int menu;
        String nama = "";
        String alamat = "";
        String umur = "";
        String diagnosis = "";
        String obat = "";
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Daftar Pasien" + "\n2. Diagnosis" + "\n3. Obat" + "\n4. Print Data Pasien" + "\n5. Exit"));
            switch (menu) {
                case 1:
                    nama = JOptionPane.showInputDialog(null, "Input nama pasien");
                    alamat = JOptionPane.showInputDialog(null, "Input alamat pasien");
                    umur = JOptionPane.showInputDialog(null, "Input umur pasien pasien");
                    break;
                case 2:
                    diagnosis = JOptionPane.showInputDialog(null, "Input diagnosis dokter");
                    break;
                case 3:
                    obat = JOptionPane.showInputDialog(null, "Input obat-obatan");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Nama: " + nama + "\nAlamat: " + alamat + "\nUmur: " + umur + "\nDiagnosis: " + diagnosis + "\nObat: " + obat);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Terima kasih sudah memakai layanan kami");
            }
        } while (menu != 5);
    }
}
