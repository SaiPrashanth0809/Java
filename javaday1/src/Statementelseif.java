import java.util.Scanner;
public class Statementelseif {
    public static void main(String[] args) {
       int a;
       Scanner s = new Scanner(System.in);
       a = s.nextInt();
       if(a<18){
        System.out.println("Minnor");
       }
       else if (a>18 || a<30 ){
        System.out.println("Major");
       }
       else{
        System.out.println("Senior citizon");
       }
    }
    
}
