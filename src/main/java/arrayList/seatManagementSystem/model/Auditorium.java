package arrayList.seatManagementSystem.model;

import java.util.List;
import java.util.ArrayList;

// Define class
public class Auditorium {
    // Set fields
    private final String name;
    private List<Seat> seatList;

    // Define constructors
    public Auditorium(String name, int numRows, int seatsPerRow) {
        this.name = name;
        this.seatList = new ArrayList<>();

        char startRow = 'A';
        int lastRow = startRow + numRows;

        for (char i = startRow; i <= lastRow; i++) {
            for (int j = 1; j <= seatsPerRow; j++) {
                Seat seat = new Seat(i + String.format("%02d", j));
                this.seatList.add(seat);
            }
        }
    }

    // Define method to display auditorium name
    public String getName() {
        return this.name;
    }

    // Define method to display all seats
    public List<Seat> getSeatList() {
        return this.seatList;
    }

    // Define method to display available seats
    public List<Seat> getAvailableSeatList() {
        List<Seat> availableSeatList = new ArrayList<>();

        for (Seat seat : this.seatList) {
            if (seat.getStatus() == Status.AVAILABLE) availableSeatList.add(seat);
        }

        return availableSeatList;
    }

    // Define method to display reserved seats
    public List<Seat> getReservedSeatList() {
        List<Seat> reservedSeatList = new ArrayList<>();

        for (Seat seat : this.seatList) {
            if (seat.getStatus() == Status.RESERVED) reservedSeatList.add(seat);
        }

        return reservedSeatList;
    }

    // Define method to find specified seat

}