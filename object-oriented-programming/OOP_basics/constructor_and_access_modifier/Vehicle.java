package OOP_basics.constructor_and_access_modifier;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Piyush", "Car");
        Vehicle vehicle2 = new Vehicle("Rahul", "Bike");

        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();
        System.out.println();

        Vehicle.updateRegistrationFee(7000);

        System.out.println("After Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        System.out.println();

        vehicle2.displayVehicleDetails();
    }
}