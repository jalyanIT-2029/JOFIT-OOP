package Practice.week3;

public class Main {
    public static void main(String[] args) {

        Shop shopee = new Shop();
        shopee.name = "Lazada";

        Product product1 = new Product("Ballpen", 13.00, 398);
        Product product2 = new Product();
        product2.name = "Bag";
        product2.price = 349;
        product2.stock -= 89;
        Product product3 = new Product("Digital Camera", 2300.00, 56);

        shopee.productList = new Product[50];
        shopee.productList[0] = product1;
        shopee.productList[1] = product2;
        shopee.productList[2] = product3;

        System.out.println("These are the products " + shopee.name);
        shopee.displayProducts();

    }

}
