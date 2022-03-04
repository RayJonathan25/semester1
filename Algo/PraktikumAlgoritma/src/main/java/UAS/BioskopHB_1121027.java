package UAS;

import javax.swing.JOptionPane;

public class BioskopHB_1121027 {
    // Class untuk menyimpan data member
    static class Seat {
        String seatCode;
        boolean seatState;
    }

    static class Film {
        String title;
        double duration;
        String releaseDate;
        double rating;
    }

    static class Studio {
        Seat seat = new Seat();
        double ticketPrice;
        Film film;
    }

    static class Transaction {
        String TransactionCode;
        String filmName;
        String chairCode;
        String paymentMethod;
        long totalOrder;
    }

    static class Member {
        String Username;
        String password;
        Transaction[] transaction;
    }

    public static void main(String[] args) {

        Member[] members = new Member[5];
        members[0] = databaseMember("Budi", "241");
        members[1] = databaseMember("Wawan", "525");
        members[2] = databaseMember("Siska", "919");
        members[3] = databaseMember("Sinta", "2992");
        members[4] = databaseMember("Wati", "20299");
        Studio[] studio = new Studio[5];
        mainMenu(members);

        Film[] film = new Film[1];
        film[0] = databaseFilm("wahyu", 18.0, "12 Januari 2021", 99.9);
        film[1] = databaseFilm("Suram", 19.0, "12 April 2021", 97.5);
    }

    public static Member databaseMember(String Username, String Password) {
        Member mmbrs = new Member();
        mmbrs.Username = Username;
        mmbrs.password = Password;
        return mmbrs;
    }

    public static Film databaseFilm(String title, Double duration, String releaseDate, Double Rating) {
        Film fm = new Film();
        fm.title = title;
        fm.duration = duration;
        fm.releaseDate = releaseDate;
        fm.rating = Rating;
        return fm;
    }

    // Member and Admin Validate//
    public static void adminValidate(String pinAdmin) {
        String pinAdminTemp = JOptionPane.showInputDialog(null, "Masukan password Admin");
        if (pinAdminTemp.equals(pinAdmin)) {
            JOptionPane.showMessageDialog(null, "Selamat datang admin!");
            mainMenuAdmin();
        } else {
            JOptionPane.showMessageDialog(null, "Password yang dimasukan salah");
        }
    }

    public static void memberValidate(Member member[]) {
        String username = JOptionPane.showInputDialog("Masukan username anda: ");
        String password = JOptionPane.showInputDialog("Masukan password anda: ");
        int temp = 1;
        for (int i = 0; i < member.length; i++) {
            if (member[i].Username.equals(username)) {
                temp = i;
            }
        }

        if (temp == -1) {
            JOptionPane.showMessageDialog(null, "Anda bukan member dari bioskop HB Tidak Ditemukan");
        } else {
            if (member[temp].password.equals(password)) {
                mainMenuMember();
            } else {
                JOptionPane.showMessageDialog(null, "Password yang anda Salah!");
            }
        }

    }

    // MAIN MENU //

    public static void mainMenu(Member member[]) {
        boolean exit = false;
        while (!exit) {
            String adminPin = "123";
            int inputMember = Integer
                    .parseInt(JOptionPane.showInputDialog(null, "1. Admin\n" + "2. User\n" + "3.Keluar"));
            if (inputMember == 1) {
                adminValidate(adminPin);
            } else if (inputMember == 2) {
                memberValidate(member);
            } else if (inputMember == 3) {
                exit = true;
            } else {
                JOptionPane.showMessageDialog(null, "Harap kembali ke menu utama dan ulang kembali");
            }

        }
    }

    public static void mainMenuAdmin() {
        int pemilihan = (Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. total Pendapatan\n" + "2. Update Data\n" + "3.Kembali")));

        if (pemilihan == 1) {
            totalPendapatan(null);
        } else if (pemilihan == 2) {

        } else if (pemilihan == 3) {
        }

    }

    public static void mainMenuMember() {
        int pemilihanMember = (Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Pembelian(order) Tiket\n" + "2.Riwayat Transaksi\n"
                        + "3.Update Data Member\n" + "4. Kembali")));
        if (pemilihanMember == 1) {
            pembelianMember();
        } else if (pemilihanMember == 2) {
            RiwayatTransaksi();
        } else if (pemilihanMember == 3) {
            updateData();

        }

    }

    public static void pembelianMember() {
        JOptionPane.showMessageDialog(null, "Film apa yang akan dibeli? \n");
    }

    public static void RiwayatTransaksi() {
        JOptionPane.showMessageDialog(null, "Riwayat transaksi anda adalah : ");
    }

    public static void updateData() {
        String nama = JOptionPane.showInputDialog(null, "apa yang ingin diupdate ? \n" + "1.Nama\n" + "2. Password");
    }

    public static void totalPendapatan(Transaction transaction[]) {
        int counter = 0;
        for (int i = 0; i < transaction.length; i++) {
            if (transaction[i] == null) {
                counter++;
            } else if (transaction[i] != null) {
                counter--;
            }
        }
        if (counter == 5) {
            JOptionPane.showMessageDialog(null, "tidak ada order");
        }

    }

    public static void UpdateHarga(Film[] duration) {

    }

}