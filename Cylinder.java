public class Cylinder extends Circle {
    private double height; //height

    public Cylinder() {
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * super.getArea();
    }

    public String toString() {
        return "Cylinder[" + super.toString() + "],height=" + height + "]"; 
    }

    public double getArea() {
        return super.getArea() * 2;
    }    
}