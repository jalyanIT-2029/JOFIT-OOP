package Practice.week2;

public class Circle {
    double r;
    static final double PI = Math.PI;

    public Circle() {
    }

    public Circle(double radius) { // parametarized
        r = radius;
    }

    public double getArea() {
        return PI * r * r;
    }

}
