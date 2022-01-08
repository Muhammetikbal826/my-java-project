   package asalsayı;
 
 public class Asalsayı {
    public static void main(String[] args) {
        int a,b;
        boolean d;
        for(a=2;a<=50;a++){
            d=false;
            for(b=2;b<=a-1;b++){
            if(a%b==0){
                   d=true;
                break;
            }
        }
            if(d==false){
                System.out.println(a);
                
            }
        }
     
    }
    
}
