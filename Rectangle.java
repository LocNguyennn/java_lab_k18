package TH_tuan_3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
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

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return 2*(this.getLength() + this.getWidth());
    }

    @Override
    public String toString() {
        return "A Rectangle with length = " + this.getLength() + ",width = " + this.getWidth() +
                ",which is a subclass of " + super.toString();
    }
}
