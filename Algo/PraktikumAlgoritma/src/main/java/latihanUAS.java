import java.util.Scanner;

import javax.swing.JOptionPane;

public class latihanUAS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        no1();
        no2(scan);
        no3();
    }

    public static void no1() {
        double a = 5, b = 2, c = 4, phi = 3.14, r = 4, t = 6;
        double pyht = Math.sqrt((a * a) + (b * b));
        System.out.println("Pythagorasnya adalah : " + pyht);
        double vK = ((double) (1 / 3) * phi * Math.pow(r, 2) * t);

        System.out.println("Volume Kelilingnya adalah : " + vK);

    }

    public static void no2(Scanner scan) {
        System.out.println("Masukan nama");
        String nama = scan.next();

        System.out.println("Masukan Alamat");
        String alamat = scan.next();

        System.out.println("Masukan Telepon");
        int telpon = scan.nextInt();

        System.out.println("Masukan gender anda : ");
        String gender = scan.next();

        System.out.println("Masukan Usia anda ");
        int usia = scan.nextInt();

        System.out.println("Status menikah ?");
        boolean status = scan.nextBoolean();

        System.out.println("masukan penghasilan");
        int penghasilan = scan.nextInt();

        System.out.println("Nama saya " + nama + " seorang " + gender + " tinggal di " + alamat + ", dan telpon "
                + telpon + " Tahun ini usia saya " + usia + "status nikah : " + status +
                ", dan penghasilan saya adalah " + penghasilan);
    }

    public static void no3() {
        double pajak = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan persentase pajak"));
        double gaji = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan gaji anda"));
        double bonus = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan bonus yang anda dapatkan : "));
        double denda = Double.parseDouble(JOptionPane.showInputDialog(null, "Masukan denda yang didapat"));
        double penghasilan = gaji + bonus - denda;
        double totalPenghasilan = penghasilan - (penghasilan * pajak);
        JOptionPane.showMessageDialog(null, "Gaji anda adalah " + penghasilan);
        JOptionPane.showMessageDialog(null, "total gaji anda adalah " + totalPenghasilan);
    }
}