# codealpha_hotelreservationsystem
Hotel Reservation SystemA lightweight, console-based Hotel Reservation System written in Java. This application manages room availability, handles customer bookings, simulates a secure payment processing step, and logs dynamic booking details directly to an external text file.  
🚀 Features
Room Management: Keeps track of room statuses, automatic availability updates (true/false), categories (Standard, Deluxe, Suite), and prices.  
Customer Registrations: Collects guest information including name and phone numbers seamlessly.  
Integrated Payment Simulator: Simulates a live merchant billing process generating a random 6-digit transaction ID upon every booking.  
File-Based Logging: Automatically exports and appends persistent checkout logs into a bookings.txt text file.  
🛠️ Project Structure
The codebase is built cleanly with modular Object-Oriented Programming (OOP) principles:
Main.java: The interactive console loop managing the user choices (menu screens).  
Hotel.java: The core management class storing array lists of rooms and active bookings.  
Room.java: Holds the specific configuration metrics for room instances.  
Customer.java: Models individual guest information profiles.  
Reservation.java: Captures unified receipt links connecting a customer, their room, and the booking date.  
Payment.java: Handles transaction text mockups and approval simulation routing.  
📄Output Log Format (bookings.txt)
When a user successfully books a room, the reservation data is permanently written using comma-separated variables 
inside bookings.txt:  
PlaintextGeetha,9876543210,101,Standard,25-05-2026
santoshi,7894561232,102,Deluxe,26-05-2026
teja,4561239756,102,Deluxe,26-05-2026
🏃 How to Run the Project
Prerequisites
Java Development Kit (JDK 8 or newer) installed.  
Execution Steps
Clone or copy all .java files into a single project directory.  
Open your terminal inside that directory and compile all files:javac Main.java Hotel.java Room.java Customer.java Reservation.java Payment.java3. **Launch the Application**:
   ```bash
java Main
```
🎮 How to UseWhen launched, follow the interactive console text prompt:
View Rooms: Displays all standard, deluxe, or suite assets along with pricing and live vacancy states.  
Book Room: Input the customer's name, phone details, room selection, and target date. It triggers the Payment phase and locks down availability upon completion.  Cancel Reservation: Input the room number to free up the room and wipe out active booking logs instantly.  
Exit: Cleanly terminates the program loop.
