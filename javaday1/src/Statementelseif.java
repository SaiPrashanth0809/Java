import java.util.Scanner;
public class Statementelseif {
    public static void main(String[] args) {
       int a;
       Scanner s = new Scanner(System.in);
       a = s.nextInt();
       if(a<5){
        System.out.println("Prashanth");
       }
       else if (a>5){
        System.out.println("Pavan");
       }
       else{
        System.out.println("None");
       }


    }
    
}
