package Hotel_Reservation_System;

public class Reservation {
    int reservation;
    Customer customer;
    Room room;
    int days;
    double totalAmount;

    public Reservation(int reservation, Customer customer, Room room, int days, double totalAmount) {

        this.reservation = reservation;
        this.days = days;
        this.totalAmount = totalAmount;
    }

    public boolean BookRoom(int days) {
        if (days > 0) {
            totalAmount = days * room.pricePerDay;
        }
        return false;
    }
}
