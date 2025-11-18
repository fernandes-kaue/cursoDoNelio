package org.example.Modulo14Exceptions.ExcecoesPersonalizadas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.printf("Room number: ");
        Integer roomNumber = sc.nextInt();
        sc.nextLine();
        System.out.printf("Check-in date (dd/MM/yyyy): ");
        Date checkInDate = sdf.parse(sc.nextLine());
        System.out.printf("Check-out date (dd/MM/yyyy): ");
        Date checkOutDate = sdf.parse(sc.nextLine());

        Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
        System.out.println(reservation);

        System.out.println("Enter data to update reservation:");
        System.out.printf("Check-in date (dd/MM/yyyy): ");
        checkInDate = sdf.parse(sc.nextLine());
        System.out.printf("Check-out date (dd/MM/yyyy): ");
        checkOutDate = sdf.parse(sc.nextLine());
        reservation.updateDates(checkInDate, checkOutDate);
        System.out.println(reservation);
        sc.close();

    }
}
