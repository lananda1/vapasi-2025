public class Triangle extends Shape{
    int x,y,z;

    Triangle(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public double calculateArea() {
        return x*y*z; // dummy calculation
    }

    @Override
    public double calculatePerimeter() {
        return x+y+z;
    }
}
