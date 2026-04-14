package Review;

//Problem 2: Hotel Stay Invoice Generator
//Step 1 – Calculate Stay Cost
//Given number of nights and room type, the invoice generator should return the total stay cost.
//
//Cost: ₹1500/night (Standard), ₹3000/night (Deluxe)
//Minimum Charge: ₹1500
//
//Step 2 – Multiple Bookings
//The Invoice Generator should now accept multiple bookings and return the aggregate total.
//        Step 3 – Enhanced Invoice
//The Invoice Generator should now return:
//
//Total Number of Bookings
//Total Amount
//Average Cost Per Booking
//
//Step 4 – Booking Service
//Given a customer ID, the Booking Service fetches the list of stays from the Booking Repository and returns the Invoice.
//        Step 5 – Seasonal Pricing
//The hotel now supports 2 seasons:
//
//Off-Season: ₹1500/night Standard, ₹3000/night Deluxe, Minimum ₹1500
//Peak Season: ₹2500/night Standard, ₹5000/night Deluxe, Minimum ₹2500


import java.util.Scanner;

public class HotelStayInvoiceGenerator {

    public static int calculateBookingCost(int nights, String roomType, String season) {
        int ratePerNight = 0;
        int minimumCharge = 0;

        if (season.equalsIgnoreCase("OffSeason")) {
            if (roomType.equalsIgnoreCase("Standard")) {
                ratePerNight = 1500;
            } else if (roomType.equalsIgnoreCase("Deluxe")) {
                ratePerNight = 3000;
            }

            minimumCharge = 1500;
        } else if (season.equalsIgnoreCase("PeakSeason")) {
            if (roomType.equalsIgnoreCase("Standard")) {
                ratePerNight = 2500;
            } else if (roomType.equalsIgnoreCase("Deluxe")) {
                ratePerNight = 5000;
            }

            minimumCharge = 2500;
        }

        int bookingCost = nights * ratePerNight;

        if (bookingCost < minimumCharge) {
            bookingCost = minimumCharge;
        }

        return bookingCost;
    }

    public static void displayCustomerDetails(String customerName, String customerPhone, String customerEmail) {
        System.out.println("\n----- Customer Details -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Phone Number  : " + customerPhone);
        System.out.println("Email ID      : " + customerEmail);
    }

    public static void displayFinalInvoice(String customerName, String customerPhone, String customerEmail,
                                           int totalBookings, int totalAmount) {

        double averageCost = (double) totalAmount / totalBookings;

        System.out.println("\n========== Final Invoice ==========");
        System.out.println("Customer Name          : " + customerName);
        System.out.println("Phone Number           : " + customerPhone);
        System.out.println("Email ID               : " + customerEmail);
        System.out.println("Total Number of Booking: " + totalBookings);
        System.out.println("Total Amount           : ₹" + totalAmount);
        System.out.println("Average Cost Per Booking: ₹" + averageCost);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter Customer Details ");

        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String customerPhone = sc.nextLine();

        System.out.print("Enter Email ID: ");
        String customerEmail = sc.nextLine();

        displayCustomerDetails(customerName, customerPhone, customerEmail);

        System.out.print("\nEnter number of bookings: ");
        int totalBookings = sc.nextInt();

        int totalAmount = 0;

        for (int i = 1; i <= totalBookings; i++) {
            System.out.println("\nBooking " + i);

            System.out.print("Enter number of nights: ");
            int nights = sc.nextInt();

            System.out.print("Enter room type (Standard/Deluxe): ");
            String roomType = sc.next();

            System.out.print("Enter season (OffSeason/PeakSeason): ");
            String season = sc.next();

            int bookingCost = calculateBookingCost(nights, roomType, season);

            System.out.println("Booking Cost: ₹" + bookingCost);

            totalAmount += bookingCost;
        }

        displayFinalInvoice(customerName, customerPhone, customerEmail, totalBookings, totalAmount);
    }
}