interface Product {
    void operation();
}


class ConcreteProductA implements Product {
    @Override
    public void operation() {
        System.out.println("This Operation performed by ConcreteProductA");
    }
}

// Another concrete implementation of a product
class ConcreteProductB implements Product {
    @Override
    public void operation() {
        System.out.println("This Operation performed by ConcreteProductB");
    }
}

class ProductFactory {
    // Method to create products based on input
    public static Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}

