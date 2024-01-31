package seatManagementSystem.model;

public class Seat {
    private String name;
    private Status status;

    public Seat(String name) {
        this.name = name;
        this.status = Status.AVAILABLE;
    }

    public Seat(String name, Status status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return this.name;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
