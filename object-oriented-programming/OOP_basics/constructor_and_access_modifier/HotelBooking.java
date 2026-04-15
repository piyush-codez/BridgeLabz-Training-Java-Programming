package OOP_basics.constructor_and_access_modifier;

class HotelBooking {
    String guestName;
    String roomType;
    int nights;


    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }


    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }


    void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();

        HotelBooking booking2 = new HotelBooking("Piyush", "Deluxe", 3);

        HotelBooking booking3 = new HotelBooking(booking2);

        System.out.println("Default Constructor Booking:");
        booking1.displayBookingDetails();

        System.out.println("\nParameterized Constructor Booking:");
        booking2.displayBookingDetails();

        System.out.println("\nCopy Constructor Booking:");
        booking3.displayBookingDetails();
    }
}