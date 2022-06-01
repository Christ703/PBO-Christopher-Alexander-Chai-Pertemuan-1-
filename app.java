import java.util.Scanner;

import TEST.tabung;
public class app {
    public static void main(String[] args) throws Exception {

        System.out.print("Perhitungan Volume Tabung\n");
        System.out.print("===========================\n");
        Scanner keyboard = new Scanner(System.in);

        tabung tabung1 = new tabung();
        System.out.print("Masukkan Panjang jari-jari (r) : ");
        tabung1.r= keyboard.nextInt();

        System.out.print("Masukkan tinggi (t) : ");
        tabung1.t= keyboard.nextInt();

        tabung1.luasTabung();

    }
}