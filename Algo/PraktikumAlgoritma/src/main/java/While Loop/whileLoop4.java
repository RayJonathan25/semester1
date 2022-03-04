
import javax.swing.JOptionPane;

public class whileLoop4 {

    public static void main(String[] args) {

        int input, index = 2;
        String hasil = "";
        input = Integer.parseInt(JOptionPane.showInputDialog("Masukan Batas : "));
        while (input > index) {
            int temp = 2, isPrima = 0;
            while (temp <= index) {
                if (index % temp == 0) {
                    isPrima++;
                }
                temp++;
            }
            if (isPrima == 1) {
                hasil += index + " ";
            }
            index++;
        }
        JOptionPane.showMessageDialog(null, hasil);
    }
}
