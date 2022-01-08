package rakamtoplamı;

import java.util.Scanner;

public class Rakamtoplamı {

    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Bir sayi giriniz: ");
        int sayi = klavye.nextInt();
        while (sayi > 0) {
            toplam = toplam + sayi % 10;
            sayi /= 10;  // sayi = sayi / 10;
        }
        System.out.println("Girilen sayinin rakamlarının toplamı = " + toplam);
    }
}
