package OOP_advance.Inheritance;

// Base class
class Order {
    int orderId;
    String orderDate;

    // Constructor
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

// Subclass of Order
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding method
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

// Subclass of ShippedOrder
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding method
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }

    // Method to display details
    void displayInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Current Status: " + getOrderStatus());
    }
}

// Main class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        DeliveredOrder order1 = new DeliveredOrder(
                101,
                "15-Apr-2026",
                "TRK56789",
                "18-Apr-2026"
        );

        order1.displayInfo();
    }
}
