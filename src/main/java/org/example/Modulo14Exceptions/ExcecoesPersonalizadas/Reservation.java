package org.example.Modulo14Exceptions.ExcecoesPersonalizadas;

import java.util.Date;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {}

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer duration() {
        return (int) ((checkOut.getTime() - checkIn.getTime()) / (1000 * 60 * 60 * 24));
    }

    public void updateDates(Date newCheckInDate, Date newCheckOutDate) {
        this.checkIn = newCheckInDate;
        this.checkOut = newCheckOutDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room " + roomNumber + ", ");
        sb.append(" check-in: " + checkIn + ", ");
        sb.append(" check-out: " + checkOut + ", ");
        sb.append(duration() + " nights");
        return sb.toString();
    }

}
