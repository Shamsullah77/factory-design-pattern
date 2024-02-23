
// Client class
public class Main {
    public static void main(String[] args) {
        // Create products using the factory
        Product productA = ProductFactory.createProduct("A");
        Product productB = ProductFactory.createProduct("B");

        // Perform operations on products
        productA.operation();
        productB.operation();
        productA.operation();
    }
}