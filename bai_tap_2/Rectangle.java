package TH_tuan_2.bai_tap_2;


public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width,double length){
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getPerimeter(){
        return (this.length+this.width)*2;
    }
    public double getArea(){
        return this.length * this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = " + this.getWidth() +
                " and length = " + this.getLength() +
                ",which is subclass of " + super.toString();
    }
}
