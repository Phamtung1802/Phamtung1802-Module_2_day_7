package circleComparator;

public class Circle {
    double Radius;
    String Color;
    public Circle(){

    }
    public Circle(double Radius, String Color){
        this.Radius=Radius;
        this.Color=Color;
    }

    public Circle(double v, String indigo, boolean b) {
    }

    public Circle(double v) {
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override

    public String toString(){
        return "circleComparator.Circle with Radius= "+this.getRadius()+" Color= "+this.getColor();
    }
}