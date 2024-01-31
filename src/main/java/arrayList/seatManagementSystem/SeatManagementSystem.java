package arrayList.seatManagementSystem;

import arrayList.seatManagementSystem.model.Auditorium;
import arrayList.seatManagementSystem.model.Seat;

import arrayList.seatManagementSystem.util.ReservationSystem;

public class SeatManagementSystem {
    public static void main(String[] args) {
        Auditorium theatre = new Auditorium("Theatre", 2, 3);
        ReservationSystem theatreReservationSystem = new ReservationSystem("Theatre reservation system", theatre);

        System.out.println(theatre.getName());
        // System.out.println(theatreReservationSystem.getName());

        // Display all seats
        System.out.printf("All seats (%d): ", theatre.getSeatList().size());
        for (Seat seat : theatre.getSeatList()) {
            System.out.printf(seat.getName() + " ");
        }

        System.out.println();

        // Test "reserveSeat" functionallity
        System.out.println("Reserve seats: A01, B01, C01");
        theatreReservationSystem.reserveSeat("A01");
        theatreReservationSystem.reserveSeat("B01");
        theatreReservationSystem.reserveSeat("C01");

        // Display reserved seats
        System.out.printf("Reserved seats (%d): ", theatre.getReservedSeatList().size());
        if (theatre.getReservedSeatList().size() != 0) {
            for (Seat seat : theatre.getReservedSeatList()) {
                System.out.printf(seat.getName() + " ");
            }
        } else {
            System.out.println("All seats are available so far");
        }

        System.out.println();
        // Display available seats
        System.out.printf("Available seats (%d): ", theatre.getAvailableSeatList().size());
        if (theatre.getAvailableSeatList().size() != 0) {
            for (Seat seat : theatre.getAvailableSeatList()) {
                System.out.printf(seat.getName() + " ");
            }
        } else {
            System.out.println("All seats are reserved");
        }

        System.out.println();

        // Test "releaseSeat" functionallity
        System.out.println("Release seats: B01");
        theatreReservationSystem.releaseSeat("B01");

        // Display reserved seats
        System.out.printf("Reserved seats (%d): ", theatre.getReservedSeatList().size());
        if (theatre.getReservedSeatList().size() != 0) {
            for (Seat seat : theatre.getReservedSeatList()) {
                System.out.printf(seat.getName() + " ");
            }
        } else {
            System.out.println("All seats are available so far");
        }

        System.out.println();

        // Display available seats
        System.out.printf("Available seats (%d): ", theatre.getAvailableSeatList().size());
        if (theatre.getAvailableSeatList().size() != 0) {
            for (Seat seat : theatre.getAvailableSeatList()) {
                System.out.printf(seat.getName() + " ");
            }
        } else {
            System.out.println("All seats are reserved");
        }

        System.out.println();
    }
}

