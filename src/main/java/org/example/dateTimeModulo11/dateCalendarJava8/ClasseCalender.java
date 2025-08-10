package org.example.dateTimeModulo11.dateCalendarJava8;

// Como manipular uma data usando o Calender

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class ClasseCalender {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2018-01-01T15:15:15Z"));

        System.out.println(sdf.format(date));

    }
}
