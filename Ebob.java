 package ebob;
 
import java.util.Scanner;
 
public class Ebob {
    
    public static void main(String[] args) {
        
        Scanner klavye = new Scanner(System.in);
        int ebob = 0;
        
        System.out.print("1. Sayıyı giriniz: ");
        int sayi1 = klavye.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int sayi2 = klavye.nextInt();
        
        for(int i = 1; i < sayi1; i++)
        {
            if(sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
        }
        System.out.println("Ebob = " + ebob);
    }
}