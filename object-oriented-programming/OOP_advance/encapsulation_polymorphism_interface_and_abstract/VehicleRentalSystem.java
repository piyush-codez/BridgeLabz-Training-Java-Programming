package OOP_advance.encapsulation_polymorphism_interface_and_abstract;

interface Insurable {
    double calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 2000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Car Insurance Cost: 2000");
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 1000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Bike Insurance Cost: 1000");
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    double calculateRentalCost(int days) {
        return getRentalRate() * days + 5000;
    }

    @Override
    public double calculateInsurance() {
        return 5000;
    }

    @Override
    public void getInsuranceDetails() {
        System.out.println("Truck Insurance Cost: 5000");
    }
}

public class VehicleRentalSystem {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("UP32AB1234", 1500, "CAR123"),
                new Bike("UP32XY5678", 500, "BIKE456"),
                new Truck("UP32TR9999", 4000, "TRUCK789")
        };

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());

            double rentalCost = vehicle.calculateRentalCost(rentalDays);
            double insuranceCost = 0;

            if (vehicle instanceof Insurable) {
                insuranceCost = ((Insurable) vehicle).calculateInsurance();
            }

            System.out.println("Rental Cost: " + rentalCost);
            System.out.println("Insurance Cost: " + insuranceCost);
            System.out.println("Total Cost: " + (rentalCost + insuranceCost));

            System.out.println("------------------------");
        }
    }
}
