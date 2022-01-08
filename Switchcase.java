 package switchcase;
 import java.util.Scanner;
 public class Switchcase {
 public static void main(String[] args) {
  Scanner klavye=new Scanner(System.in);
  System.out.println("1-7 arası bir sayı girin");
  int gun=klavye.nextInt();
  switch(gun){
      case 1:System.out.println("bugun pazartesi");break;
      case 2:System.out.println("bugun salı");break;
      case 3:System.out.println("bugun çarşamba");break;
      case 4:System.out.println("bugun perşembe");break;
      case 5:System.out.println("bugun cuma");break;
      case 6:System.out.println("bugun cumartesi");break;
      case 7:System.out.println("bugun pazar");break;
      default:System.out.println("lütfen geçerli bir sayı girin");
   
    }
 }
}
