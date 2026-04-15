package OOP_basics.this_static_and_final;

class Product {
    static double discount = 10.0;

    String productName;
    double price;
    int quantity;
    final int productID;

    Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    void displayProductDetails() {
        double finalPrice = price - (price * discount / 100);

        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productID);
        System.out.println("Original Price: ₹" + price);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("Quantity: " + quantity);
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 60000, 2, 201);
        Product product2 = new Product("Mobile", 30000, 1, 202);

        if (product1 instanceof Product) {
            product1.displayProductDetails();
        }

        System.out.println();

        Product.updateDiscount(15);

        if (product2 instanceof Product) {
            product2.displayProductDetails();
        }
    }
}
