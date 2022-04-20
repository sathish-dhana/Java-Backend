package com.BookMyShow;

public class Seats {
    int SeatRate;
    boolean status;

    public Seats(int seatRate, boolean status) {
        SeatRate = seatRate;
        this.status = status;
    }

    public Seats() {

    }

    public int getSeatRate() {
        return SeatRate;
    }

    public void setSeatRate(int seatRate) {
        SeatRate = seatRate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
