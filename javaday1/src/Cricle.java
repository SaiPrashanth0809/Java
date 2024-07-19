public class Cricle implements Shape{
    private double radius;
    public  Cricle(int radius){
        this.radius=radius;
    }
    
    public int getarea(){
       
     return (int) (Math.PI*radius*radius);
 
    }
 }