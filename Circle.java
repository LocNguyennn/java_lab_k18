package TH_tuan_3;

public class Circle extends Shape{
    protected double radius;

    public Circle(){
    }
    public Circle(double rardius){
        this.radius = rardius;
    }

    public Circle(double radius,String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.getRadius();
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + this.getRadius() + ",which is a subclass of " + super.toString();
    }
}
