package deneme;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("lütfen vize notu girin");
       int vizenotu = klavye.nextInt();
        System.out.println("lütfen final notunu girin");
       int finalnotu = klavye.nextInt();
        double ort = finalnotu * 0.6 + vizenotu * 0.4;
        if (ort < 50||finalnotu<50) 
            System.out.println(ort+" ortalama ile kaldınız");
        
         else 
            System.out.println(ort+"  tebrikler ortalama ile geçtiniz");
        

    }
}
