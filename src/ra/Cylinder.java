package ra;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*Math.pow(super.getRadius(),2)*getHeight();
    }

    @Override
    public String toString() {
        return "hình trụ có chiều cao: "+getHeight() + " thể tích là: "+getVolume();
    }
}