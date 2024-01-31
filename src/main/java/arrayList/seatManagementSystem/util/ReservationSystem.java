package arrayList.seatManagementSystem.util;

import arrayList.seatManagementSystem.model.Auditorium;
import arrayList.seatManagementSystem.model.Status;
import arrayList.seatManagementSystem.model.Seat;

// Define class
public class ReservationSystem {
    // Set fields
    private final String name;
    private Auditorium auditorium;

    // Define constructors
    public ReservationSystem(String name) {
        this.name = name;
    }

    public ReservationSystem(String name, Auditorium auditorium) {
        this.name = name;
        this.auditorium = auditorium;
    }

    // Define method to get the system custom name
    public String getName() {
        return this.name;
    }

    // Define method to get auditorium
    public Auditorium getAuditorium() {
        return this.auditorium;
    }

    // Define method to set auditorium
    public void setAuditorium(Auditorium auditorium) {
        this.auditorium = auditorium;
    }

    // Define method to reserve a seat
    public boolean reserveSeat(String name) {
        boolean isReserved = false;

        for (Seat seat : auditorium.getAvailableSeatList()) {

            if (seat.getName().equals(name)) {
                seat.setStatus(Status.RESERVED);
                isReserved = true;
            }
        }

        return isReserved;
    }

    // Define method to release a reserved seat
    public boolean releaseSeat(String name) {
        boolean isReleased = false;

        for (Seat seat : auditorium.getReservedSeatList()) {
            if (seat.getName().equals(name)) {
                seat.setStatus(Status.AVAILABLE);
                isReleased = true;
            }
        }

        return isReleased;
    }
}
