class Room {

    private int roomnumber;
    private String category;
    private double price;
    private boolean available;

    public Room(int roomNumber, String category, double price) {
        this.roomnumber = roomNumber;
        this.category = category;
        this.price = price;
        this.available = true;
    }

    public int getRoomNumber() {
        return roomnumber;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void bookRoom() {
        available = false;
    }

    public void cancelRoom() {
        available = true;
    }

    public void displayRoom() {

        System.out.println(
                "Room: " + roomnumber + "Category: " + category + "Price: $" + price + "Available: " + available);
    }
}