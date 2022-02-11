package TH_tuan_2.bai_tap_2;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    public Circle(double radius,String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    @Override
    public String toString() {
        return "A circle with radius = "+ this.getRadius() +
                ",which is a subclass of " + super.toString();
    }
}
