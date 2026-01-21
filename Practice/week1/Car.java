public class Car {
    String brand;
    String model;
    int price;

    void printDetails() {
        System.out.printf("""
                %s %s worth %d
                """, brand, model, price);
    }

}
