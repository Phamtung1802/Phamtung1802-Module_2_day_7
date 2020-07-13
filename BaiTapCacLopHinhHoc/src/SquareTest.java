public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        Square square2 = new Square(2.3);
        System.out.println(square2);

        Square square3 = new Square(5.8, "yellow", true);
        System.out.println(square3);


        Square[] SquareList=new Square[3];
        SquareList[0]=square1;
        SquareList[1]=square2;
        SquareList[2]=square3;

        for(Square Square:SquareList){
            Square.Resize(Math.random());
            System.out.println(Square);
        }

    }
}
