  package length;
 import java.util.Scanner;
 public class Length {
 public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
     System.out.println("lütfen mesajı boşluksuz girin:");
     String mesaj=klavye.nextLine();
     System.out.println(mesaj+" mesajın uzunlugu: "+mesaj.length());
  
    }
    
}
 