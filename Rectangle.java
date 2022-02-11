package TH_tuan_2;

public class Rectangle {
    private float length;
    private float width;


    public Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getPerimeter(){
        return (this.length + this.width)*2;
    }
    public double getArea(){
        return (this.length * this.width);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + this.getLength() +
                ", width=" + this.getWidth() +
                ']';
    }
}
