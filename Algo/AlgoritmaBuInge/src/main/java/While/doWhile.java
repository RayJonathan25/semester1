package While;


import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {
//        int pin;
//        int i = 1;
//        boolean exit = false;
//        int hasilAkhir = 0;
//        Scanner scan = new Scanner(System.in);
//        while (!exit) {
//            {
//                System.out.println("Masukan Pin anda");
//                pin = scan.nextInt();
//
//                switch (pin) {
//                    case 1121:
//                        hasilAkhir = 1;
//                        exit = true;
//                        break;
//                    default:
//                        hasilAkhir = 0;
//                        i++;
//                }
//
//            }
//            switch (hasilAkhir) {
//                case 1:
//                    System.out.println("Pin yang anda masukan benar");
//                    break;
//
//                default:
//                    System.out.println("Pin yang anda masukan Salah");
//                    if (i > 3) {
//                        exit = true;
//                        System.out.println("Keblokir");
//                    }
//
//            }
//        }

        Scanner scan = new Scanner(System.in);
        int bilangan;
        System.out.println("Masukan angka yang ingin dikonversikan");
        bilangan = scan.nextInt();
        String hasil = " ";

        while (bilangan > 1) {
            int temp;
            temp = bilangan / 2;

            hasil = (bilangan % 2) + hasil;
            bilangan = temp;
            hasil = 1 + hasil;
        }
        System.out.println(hasil);
    }
}
