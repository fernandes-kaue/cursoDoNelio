package org.example.dateTimeModulo11;

// quick reminder:
// data hora são objetos imutáveis
// para fazer calculos deve-se
// criar um novo objeto com a data resultante

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class calculosComDataHora {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
        Instant d06 = Instant.parse("2026-02-13T00:00:00Z");


        // PARA LOCALDATE
        // cria uma nova data com x dias a menos
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        // cria uma nova data com x dias a mais
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        //cria uam nova dat com x anos a menos
        LocalDate pastYearLocalDate = d04.minusYears(1);
        // cria uma nova data com x anos a mais
        LocalDate nextYearLocalDate = d04.plusYears(1);

        // PARA LOCALDATETIME
        // cria uma nova localdatetime com x horas a mais
        // contraparte é minusHours();
        LocalDateTime nextHourLocalDateTime = d05.plusHours(1);
        // cria uma nova localdatetime com x minutos a mais
        // contraparte é minusMinutes();
        LocalDateTime nextFifteenLocalDateTime = d05.plusMinutes(15);
        // cria uma nova localdatetime com x segundos a mais
        // contraparte é minusSeconds();
        LocalDateTime nextTenSecondsLocalDateTime = d05.plusSeconds(10);

        // PARA INSTANT
        // não tem métodos para dia/hora/etc
        // necessita passar como parametro qual unidade temporal será
        // adicionada ou subtraída
        // essas unidades são advindas da classe ChronoUnit
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.minus(7, ChronoUnit.DAYS);

        // CALCULAR DURAÇÃO
        // necessita da classe Duration
        // só funciona com classes que tenham
        // definição de horário
        Duration t1 = Duration.between(pastWeekInstant, d06);

        // pode-se usar .atTime(0,0) para "burlar" com LocalDate
        Duration t2 = Duration.between(pastWeekLocalDate.atTime(0, 0), d04.atTime(0, 0));

        // também pode-se usar .atStartOfDay() para evitar verbosidade
        Duration t3 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println(t1.toDays());
        System.out.println(t2.toDays());
        System.out.println(t3.toDays());

        // pode-se usar duration para ver dias restantes
        // ao passar data "maior" como primeiro argumento
        Duration t4 = Duration.between(d04.atStartOfDay(), pastWeekLocalDate.atStartOfDay());
        System.out.println(t4.toDays());
    }
}
