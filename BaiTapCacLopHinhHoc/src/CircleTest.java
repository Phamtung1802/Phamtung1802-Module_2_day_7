public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println(circle3);

        Circle[] CircleList=new Circle[3];
        CircleList[0]=circle1;
        CircleList[1]=circle2;
        CircleList[2]=circle3;

        for(Circle circle:CircleList){
            circle.Resize(Math.random());
            System.out.println(circle);
        }
    }
}
