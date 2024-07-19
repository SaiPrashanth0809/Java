public class main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,6);
        Cricle cricle = new Cricle(9);
        Square square = new Square(9);

        printArea(rectangle);
        printArea(cricle);
        printArea(square);
    }
    public static void printArea(Shape shape){
        System.out.println("Area:"+shape.getarea());
    }
}
