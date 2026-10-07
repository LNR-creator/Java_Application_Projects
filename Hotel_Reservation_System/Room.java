package Hotel_Reservation_System;

class Room {
    int roomno;
    String roomType;
    double pricePerDay;
    boolean isAvailable;

    public Room(int roomno, String roomType, double pricePerDay, boolean isAvailable) {
        this.roomno = roomno;
        this.roomType = roomType;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
    }
    
}
