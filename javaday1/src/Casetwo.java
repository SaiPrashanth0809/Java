import java.util.Scanner;
public class Casetwo {
    public static void main(String[] args) {
        System.out.println("Enter your name :");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char scoure=0;

        switch(name){
            case "Prashanth":
                 scoure = 'A';
                 break;
            case "Pavan":
                scoure = 'B';
                break;
            default:
              System.out.println("No More Students");         
        }

        System.out.println("Student Grade"+scoure);
    }
    
}

    

