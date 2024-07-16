class scooty{
    public void twoweels(){
        System.out.println("ascess");


    }
}
 class scotor extends scooty{
    public void wheels(){
        System.out.println("tvs");
    }
 }
public class Bike{
    public static void main(String[] args) {
        scotor sc = new scotor();
        sc.twoweels();
        sc.wheels();
    }
} 
