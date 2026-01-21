public class CarObj {
    public static void main(String[] args) {

        Car obj1 = new Car();
        obj1.brand = "Honda";
        obj1.model = "Civic Hatchback";
        obj1.price = 1600000;

        Car obj2 = new Car();
        obj2.brand = "BMW";
        obj2.model = "M4";
        obj2.price = 9700000;

        // Print
        System.out.println("Cars");
        obj1.printDetails();
        obj2.printDetails();
    }
}