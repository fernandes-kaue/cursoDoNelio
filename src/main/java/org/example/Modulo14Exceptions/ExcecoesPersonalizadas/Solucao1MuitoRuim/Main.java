package org.example.Modulo14Exceptions.ExcecoesPersonalizadas.Solucao1MuitoRuim;

import org.example.Modulo14Exceptions.ExcecoesPersonalizadas.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        Reservation reservation = null;

        System.out.printf("Room number: ");
        Integer roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.printf("Check-in date (dd/MM/yyyy): ");
        Date checkInDate = sdf.parse(sc.nextLine());
        System.out.printf("Check-out date (dd/MM/yyyy): ");
        Date checkOutDate = sdf.parse(sc.nextLine());

        if (!checkOutDate.after(checkInDate)) {
            System.out.println("Error in reservation: check-out date must be after check-in date");
            System.exit(0);
        } else {
            System.out.println(reservation);
            reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            updateReservation(reservation);
        }
    }

    public static void updateReservation(Reservation reservation) throws ParseException {
        System.out.println("Enter data to update reservation:");
        System.out.printf("Check-in date (dd/MM/yyyy): ");
        Date checkInDate = sdf.parse(sc.nextLine());
        System.out.printf("Check-out date (dd/MM/yyyy): ");
        Date checkOutDate = sdf.parse(sc.nextLine());

        Date now = new Date();
        if (checkInDate.before(now) || checkOutDate.before(now)) {
            System.out.println("Error in reservation: dates must be in the future");
            System.exit(0);
        } else if (!checkOutDate.after(checkInDate)){
            System.out.println("Error in reservation: check-out date must be after check-in date");
            System.exit(0);
        } else {
            reservation.updateDates(checkInDate, checkOutDate);
            System.out.println(reservation);
        }
        sc.close();
    }
}
