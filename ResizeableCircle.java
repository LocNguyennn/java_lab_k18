package lab4;

public class ResizeableCircle extends Circle implements Resizable{
    public ResizeableCircle(double radius){
        super(radius);
    }

    @Override
    public double resize(int percent) {
        radius = radius*(percent)/100;
        return radius;
    }

    @Override
    public String toString() {
        return "ResizableCircle{ radius = " + radius + "}";
    }
}
