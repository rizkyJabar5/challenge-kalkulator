import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Kalkulator {

    static final String USER_SELECTED_NOT_FOUND = "Pilihan yang kamu pilih tidak ada nih.";
    static Scanner input = new Scanner(System.in);
    static int selectedMenu;

    public static void main(String[] args) {

        mainMenu();

    }

    static void mainMenu() {

        do {
            System.out.println("===================================");
            System.out.println("Kalkulator Penghitung Luas & Volume");
            System.out.println("===================================");
            System.out.println("Menu Utama\n");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume Bidang");
            System.out.println("0. Tutup Aplikasi");
            System.out.print(">>> ");
            selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1 -> subMenuLuasBidang();
                case 2 -> subMenuVolume();
                case 0 -> {
                    System.out.print("Kamu yakin ingin keluar? [Y/N]: ");
                    String confirm = input.next();
                    if (confirm.equalsIgnoreCase("Y")) {
                        System.out.print("Sampai jumpa kembali.");
                        System.exit(0);
                    }
                }
                default -> {
                    System.out.println(USER_SELECTED_NOT_FOUND);
                    bringMeBack();
                }
            }
        } while (selectedMenu != 2);
        input.close();
    }

    static void subMenuLuasBidang() {

        do {
            System.out.println("|=========================|");
            System.out.println("| Menu Hitung Luas Bidang |");
            System.out.println("|=========================|");
            System.out.println("Pilih bidang yang akan dihitung\n");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Segitiga");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.println("===============================");
            System.out.print(">>> ");
            selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1 -> persegi();
                case 2 -> persegiPanjang();
                case 3 -> lingkaran();
                case 4 -> segitiga();
                case 0 -> mainMenu();
                default ->{
                    System.out.println(USER_SELECTED_NOT_FOUND);
                    bringMeBack();
                }
            }
        } while (selectedMenu != 4);
        input.close();
    }

    static void subMenuVolume() {

        do {

            System.out.println("|=========================|");
            System.out.println("|Menu Hitung Volume Bidang|");
            System.out.println("|=========================|");
            System.out.println("Pilih bidang yang akan dihitung\n");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("0. Kembali ke menu sebelumnya");
            System.out.println("===============================");
            System.out.print(">>> ");
            selectedMenu = input.nextInt();

            switch (selectedMenu) {
                case 1 -> kubus();
                case 2 -> balok();
                case 3 -> tabung();
                case 0 -> mainMenu();
                default -> {
                    System.out.println(USER_SELECTED_NOT_FOUND);
                    bringMeBack();
                }
            }
        } while (selectedMenu != 3);
        input.close();
    }

    //  LOGIC PERHITUNGAN BANGUN RUANG
//  Perhitungan Luas Bidang
    static void persegi() {

        System.out.println("====================");
        System.out.println("Anda Memilih Persegi");
        System.out.println("====================\n");
        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        wait(1000);

        int hasil = sisi * sisi;
        System.out.println("Luas dari Persegi adalah " + hasil);
        System.out.println("============================");
        bringMeBack();
    }

    static void persegiPanjang() {

        System.out.println("============================");
        System.out.println("Anda Memilih Persegi panjang");
        System.out.println("============================\n");
        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();

        wait(900);

        int hasil = panjang * lebar;
        System.out.println("Luas dari Persegi Panjang adalah " + hasil);
        System.out.println("============================");
        bringMeBack();
    }

    static void lingkaran() {

        System.out.println("============================");
        System.out.println("Anda Memilih Lingkaran");
        System.out.println("============================\n");
        System.out.print("Masukkan jari-jari: ");
        int jari_jari = input.nextInt();

        wait(500);

        double hasil = 3.14 * (jari_jari * jari_jari);
        System.out.println("Luas dari Lingkaran adalah " + hasil);
        System.out.println("============================");
        bringMeBack();
    }

    static void segitiga() {

        System.out.println("============================");
        System.out.println("Anda Memilih Segitiga");
        System.out.println("============================\n");
        System.out.print("Masukkan alas: ");
        int alas = input.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        wait(1000);

        double hasil = 0.5 * alas * tinggi;
        System.out.println("Luas dari Lingkaran adalah " + hasil);
        System.out.println("============================");
        bringMeBack();

    }

//  End Perhitungan Luas Bidang
    //    Perhitungan Volume Bidang

    static void kubus() {

        System.out.println("============================");
        System.out.println("Anda Memilih Kubus");
        System.out.println("============================\n");
        System.out.print("Masukkan sisi: ");
        int sisi = input.nextInt();

        wait(1000);

        int hasil = sisi * sisi * sisi;
        System.out.println("Volume dari Kubus adalah " + hasil);
        System.out.println("============================");
        bringMeBack();

    }

    static void balok() {

        System.out.println("============================");
        System.out.println("Anda Memilih Balok");
        System.out.println("============================\n");
        System.out.print("Masukkan Panjang: ");
        int panjang = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        int lebar = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int tinggi = input.nextInt();

        wait(1000);

        int hasil = panjang * lebar * tinggi;
        System.out.println("Volume dari Balok adalah " + hasil);
        System.out.println("============================");
        bringMeBack();
    }

    static void tabung() {

        System.out.println("============================");
        System.out.println("Anda Memilih Tabung");
        System.out.println("============================\n");
        System.out.print("Masukkan Tinggi: ");
        int tinggi = input.nextInt();
        System.out.print("Masukkan Jari-jari: ");
        int jari_jari = input.nextInt();

        wait(1000);

        double volume = (3.14 * jari_jari * jari_jari) * tinggi;
        System.out.println("Volume dari Tabung adalah " + volume);
        System.out.println("============================");
        bringMeBack();
    }

//    End Perhitungan Volume

    static void wait(int ms) {
        final String WAIT_TIME_PROCESSING = "\nProses menghitung. Tunggu sebentar yaa... \n";

        System.out.println(WAIT_TIME_PROCESSING);
        try {
            TimeUnit.MILLISECONDS.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("System gagal menghitung : %s ", e);
        }

    }

    static void bringMeBack() {
        BufferedReader back = new BufferedReader(new InputStreamReader(System.in));
        final String BACK_TO_MAIN_MENU = "Tekan apa saja untuk kembali ke Menu Utama";
        System.out.print(BACK_TO_MAIN_MENU);

        try {
            back.readLine();
            mainMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }
        input.close();
    }

}
