import java.util.Scanner;
public class Case {
    public static void main(String[] args) {
      System.out.println("Enter your no : ");
        Scanner s = new Scanner(System.in);
        int id = s.nextInt();
        switch (id) {
              case 1: 
                System.out.println("Sunny");
                break;
              case 2: 
                System.out.println("Pavan");
                break;
              case 3: 
                System.out.println("Prashanth");
                break;
                case 4: 
                System.out.println("Sai");
                break;
                case 5: 
                System.out.println("Hemant");
                break;
                case 6: 
                System.out.println("Jonny");
                break;
                case 7: 
                System.out.println("Akash");
                break;
            default:
              System.out.println("NO more weakdays");
                break;
        }
    }
    
}
