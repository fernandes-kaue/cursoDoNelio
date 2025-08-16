package org.example.Modulo11DateTime.dateCalendarJava8;

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

        // PARA OBTERMOS AS UNIDADES TEMPORAIS
        // Instanciação normal
        Date date2 = Date.from(Instant.parse("2020-12-31T20:20:20Z"));
        System.out.println("Date2: " + sdf.format(date2));
        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        // para OBTER as unidades
        int minutes = cal2.get(Calendar.MINUTE);
        // MONTH começa com 0, deve-se adicionar 1
        // para seguir a ordem natural
        int month = 1 + cal2.get(Calendar.MONTH);

        System.out.println("Minutes: " +  minutes);
        System.out.println("Month: " + month);

    }
}
