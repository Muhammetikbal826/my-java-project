package veveya;

import java.util.Scanner;

public class Veveya {

     public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("sayı girin");
        int sayı = klavye.nextInt();
if(sayı%2==0||sayı%3==0){
    System.out.println("sayı 2  veya 3 e tam bölünüyor");
}
if(sayı%4==0&&sayı%5==0){
    System.out.println("sayı 4 e ve 5 e tam bölünüyor");
}
else{ System.out.println("asal sayı ");
    }

}}
