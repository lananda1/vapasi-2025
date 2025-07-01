public class Rectangle extends Shape {
    double length, breadth;

    @Override
    public double calculateArea() {
        return length * breadth;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(length+breadth);
    }

    public void setDimensions(double length) {
        this.length = length;
        this.breadth = length;
    }

    public void setDimensions(double length, double breadth) {
        this.length=length;
        this.breadth = breadth;
    }
}
