public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(2.5, 3.8, "orange", true);
        System.out.println(rectangle3);

        Rectangle[] RectangleList=new Rectangle[3];
        RectangleList[0]=rectangle1;
        RectangleList[1]=rectangle2;
        RectangleList[2]=rectangle3;

        for(Rectangle Rectangle:RectangleList){
            Rectangle.Resize(Math.random());
            System.out.println(Rectangle);
        }
    }
}
