package OOP_advance.encapsulation_polymorphism_interface_and_abstract;

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {

    Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Electronics Tax: 18%");
    }
}

class Clothing extends Product implements Taxable {

    Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.15;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;
    }

    @Override
    public void getTaxDetails() {
        System.out.println("Clothing Tax: 5%");
    }
}

class Groceries extends Product {

    Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.02;
    }
}

public class EcommercePlatform {
    public static void main(String[] args) {
        Product[] products = {
                new Electronics(1, "Laptop", 50000),
                new Clothing(2, "Shirt", 2000),
                new Groceries(3, "Rice Bag", 1500)
        };

        for (Product product : products) {
            double tax = 0;

            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }

            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Product: " + product.getName());
            System.out.println("Original Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);

            if (product instanceof Taxable) {
                ((Taxable) product).getTaxDetails();
            }

            System.out.println("------------------------");
        }
    }
}
