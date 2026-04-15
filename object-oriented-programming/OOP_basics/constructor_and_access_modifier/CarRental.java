package OOP_basics.constructor_and_access_modifier;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;


    CarRental() {
        customerName = "Unknown";
        carModel = "Swift";
        rentalDays = 1;
        costPerDay = 1500;
    }


    CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }


    CarRental(CarRental rental) {
        this.customerName = rental.customerName;
        this.carModel = rental.carModel;
        this.rentalDays = rental.rentalDays;
        this.costPerDay = rental.costPerDay;
    }


    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }


    void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Cost Per Day: ₹" + costPerDay);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();

        CarRental rental2 = new CarRental("Piyush", "Hyundai Creta", 5, 2500);

        CarRental rental3 = new CarRental(rental2);

        System.out.println("Default Constructor Rental:");
        rental1.displayRentalDetails();

        System.out.println("\nParameterized Constructor Rental:");
        rental2.displayRentalDetails();

        System.out.println("\nCopy Constructor Rental:");
        rental3.displayRentalDetails();
    }
}
