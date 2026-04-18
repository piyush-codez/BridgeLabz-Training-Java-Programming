package OOP_advance.Inheritance;

// Superclass
class Person {
    String name;
    int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Interface
interface Worker {
    void performDuties();
}

// Chef class inheriting Person and implementing Worker
class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties:");
        System.out.println(name + " is preparing food and managing the kitchen.");
    }
}

// Waiter class inheriting Person and implementing Worker
class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties:");
        System.out.println(name + " is taking orders and serving customers.");
    }
}

// Main class
public class RestaurantManagementSystem {
    public static void main(String[] args) {

        Chef chef1 = new Chef("Rahul", 101);
        Waiter waiter1 = new Waiter("Amit", 102);

        System.out.println("Chef Details:");
        System.out.println("Name: " + chef1.name);
        System.out.println("ID: " + chef1.id);
        chef1.performDuties();

        System.out.println();

        System.out.println("Waiter Details:");
        System.out.println("Name: " + waiter1.name);
        System.out.println("ID: " + waiter1.id);
        waiter1.performDuties();
    }
}
