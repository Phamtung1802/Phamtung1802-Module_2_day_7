public class ColorTest {
    public static void main(String[] args) {
        Shape Square1 = new Square();
        System.out.println(Square1);

        Shape Rectangle2 = new Rectangle(2.3, 3.6);
        System.out.println(Rectangle2);

        Shape Circle3 = new Circle(5.8, "yellow", true);
        System.out.println(Circle3);


        Shape[] ShapeList = new Shape[3];
        ShapeList[0] = Square1;
        ShapeList[1] = Rectangle2;
        ShapeList[2] = Circle3;

        for (Shape Shape : ShapeList) {
            if (Shape instanceof Rectangle) {
                System.out.println(((Rectangle) Shape).getArea());
            }
            if (Shape instanceof Colorable){
                System.out.println("color all 4 sides");
            }
        }
    }
}
