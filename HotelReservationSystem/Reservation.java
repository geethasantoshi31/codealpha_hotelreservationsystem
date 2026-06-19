class Reservation {

    private Customer customer;
    private Room room;
    private String bookingDate;

    public Reservation(Customer customer, Room room, String bookingDate) {

        this.customer = customer;
        this.room = room;
        this.bookingDate = bookingDate;
    }

    public Room getRoom() {
        return room;
    }

    public void displayReservation() {

        System.out.println("\n===== BOOKING DETAILS =====");

        System.out.println("Customer: " + customer.getName());
        System.out.println("Phonenumber: " + customer.getPhone());
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Category: " + room.getCategory());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Booking Date: " + bookingDate);
    }

    public String saveFormat() {

        return customer.getName() + "," +
                customer.getPhone() + "," +
                room.getRoomNumber() + "," +
                room.getCategory() + "," +
                bookingDate;
    }
}