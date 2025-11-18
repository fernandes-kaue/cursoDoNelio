package org.example.Modulo14Exceptions.ExcecoesPersonalizadas;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Long duration() {
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date newCheckInDate, Date newCheckOutDate) {
        this.checkIn = newCheckInDate;
        this.checkOut = newCheckOutDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Room " + roomNumber + ", ");
        sb.append(" check-in: " + sdf.format(getCheckIn()) + ", ");
        sb.append(" check-out: " + sdf.format(getCheckOut()) + ", ");
        sb.append(duration() + " nights");
        return sb.toString();
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

}
