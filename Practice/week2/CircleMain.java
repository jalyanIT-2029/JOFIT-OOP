package Practice.week2;

public class CircleMain {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.r = 250;
        c1.getArea();

        System.out.printf("The circle with radius %.2f has an area of %.2f", c1.r, c1.getArea());
    }
}
