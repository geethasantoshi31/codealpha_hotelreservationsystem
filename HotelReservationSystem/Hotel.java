import java.util.*;
import java.io.*;

class Hotel {

    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();

    public Hotel() {

        rooms.add(new Room(101, "Standard", 1000));
        rooms.add(new Room(102, "Deluxe", 2000));
        rooms.add(new Room(103, "Suite", 5000));
    }

    public void displayAvailableRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        for (Room room : rooms) {

            if (room.isAvailable()) {
                room.displayRoom();
            }
        }
    }

    public Room searchRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }

        return null;
    }

    public void bookRoom(Customer customer,
                         int roomNumber,
                         String bookingDate) {

        Room room = searchRoom(roomNumber);

        if (room != null && room.isAvailable()) {

            boolean paymentDone =
                    Payment.makePayment(room.getPrice());

            if (paymentDone) {

                room.bookRoom();

                Reservation reservation =
                        new Reservation(customer,
                                room,
                                bookingDate);

                reservations.add(reservation);

                saveBooking(reservation);

                System.out.println("\nRoom booked successfully!");

                reservation.displayReservation();
            }

        } else {

            System.out.println("\nRoom not available!");
        }
    }

    public void cancelReservation(int roomNumber) {

        for (Reservation reservation : reservations) {

            if (reservation.getRoom().getRoomNumber() == roomNumber) {

                reservation.getRoom().cancelRoom();

                reservations.remove(reservation);

                System.out.println("\nReservation cancelled!");

                return;
            }
        }

        System.out.println("\nReservation not found!");
    }

    public void saveBooking(Reservation reservation) {

        try {

            FileWriter fw =
                    new FileWriter("bookings.txt", true);

            fw.write(reservation.saveFormat() + "\n");

            fw.close();

        } catch (Exception e) {

            System.out.println("Error saving booking.");
        }
    }
}