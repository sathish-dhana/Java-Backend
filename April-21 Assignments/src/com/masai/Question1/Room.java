package com.masai.Question1;

public class Room {
    int roomNumber;
    RoomTypes roomType;
    boolean isAvaillable;
    int Rate;

    public Room(int roomNumber, RoomTypes roomType, boolean isAvaillable, int rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.isAvaillable = isAvaillable;
        Rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypes roomType) {
        this.roomType = roomType;
    }

    public boolean isAvaillable() {
        return isAvaillable;
    }

    public void setAvaillable(boolean availlable) {
        isAvaillable = availlable;
    }

    public int getRate() {
        return Rate;
    }

    public void setRate(int rate) {
        Rate = rate;
    }
}
