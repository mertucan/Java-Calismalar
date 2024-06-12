package array_ornek;

import java.util.Scanner;

public class array_ornek {

    public static void main(String[] args) {
        int toplam = 0;
        int[] dizi = new int[5];

        int buyuk = dizi[0];
        int maxIntValue = Integer.MAX_VALUE;
        int kucuk = maxIntValue;

        System.out.println("5 tane sayı giriniz.");

        // Scanner nesnesini döngü dışında tanımla
        Scanner giris = new Scanner(System.in);

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz:");
            dizi[i] = giris.nextInt();
            toplam += dizi[i];

            if (dizi[i] > buyuk) buyuk = dizi[i];

            if (dizi[i] < kucuk) kucuk = dizi[i];
        }

        // Scanner'ı kapat
        giris.close();

        System.out.println("Toplam = " + toplam);
        System.out.println("En büyük sayı = " + buyuk);
        System.out.println("En küçük sayı = " + kucuk);
    }

}