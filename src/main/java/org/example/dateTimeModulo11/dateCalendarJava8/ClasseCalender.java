package org.example.dateTimeModulo11.dateCalendarJava8;

// Como manipular uma data usando o Calender

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class ClasseCalender {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = Date.from(Instant.parse("2018-01-01T15:15:15Z"));

        System.out.println("Date antes do cálculo: " + sdf.format(date));

        // Para instanciarmos um Calendar:
        Calendar cal = Calendar.getInstance();

        // Para instanciar a Date dentro do Calender:
        cal.setTime(date);

        /*
        Para adicionarmos X unidades de tempo na Date,
        usamos:

        cal.add(Calendar.{TIMEUNIT}, {QUANTIDADE});
         */
        cal.add(Calendar.HOUR_OF_DAY, 4);

        // para obter a data após o cálculo
        date = cal.getTime();

        System.out.println("Date após calculo: " + sdf.format(date));

    }
}
