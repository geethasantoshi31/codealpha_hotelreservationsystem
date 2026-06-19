import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");

            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    hotel.displayAvailableRooms();
                    break;

                case 2:

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter Room Number: ");
                    int roomNo = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Booking Date: ");
                    String date = sc.nextLine();

                    Customer customer =
                            new Customer(name, phone);

                    hotel.bookRoom(customer, roomNo, date);

                    break;

                case 3:

                    System.out.print("Enter Room Number: ");
                    int cancelRoom = sc.nextInt();

                    hotel.cancelReservation(cancelRoom);

                    break;

                case 4:

                    System.out.println("Thank You!");
                    System.exit(0);

                default:

                    System.out.println("Invalid choice!");
            }
        }
    }
}