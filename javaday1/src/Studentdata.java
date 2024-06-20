import java.util.*;
public class Studentdata {
    public static void main(String[] args) {
       
       Scanner s = new Scanner(System.in);

       System.out.println("Marks of maths");
       int maths = s.nextInt();
       System.out.println("Marks of hindi");
       int hindi = s.nextInt();
       System.out.println("Marks of histroy");
       int histroy = s.nextInt();
      if(maths < 35 && hindi < 35 && histroy < 35){
       
        System.out.println("Fail");
       }
       else if(maths > 35 && hindi > 35 && histroy > 35){

        System.out.println(maths+hindi+histroy);
       }
       else{
        
        System.out.println("Fail");
       }
    }
}
