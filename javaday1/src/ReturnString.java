public class ReturnString {
    public String car(String name){
        return name;
    }
    public static void main(String[] args) {
        ReturnString s = new ReturnString();
          String name = s.car("Hero");
          System.out.println(name);
          
    }
    
}
