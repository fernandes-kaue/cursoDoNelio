package org.example.dateTimeModulo11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class formatacaoDataHoraGlobalParaLocal {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
        Instant d06 = Instant.parse("2026-02-13T00:00:00Z");

        // para se formatar data global para local
        // precisa-se informar o TimeZone (fuso)

        // para se formatar um Instant para uma LocalDate
        // pode-se usar:
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r1);
        // para informar fuso personalizado
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(r2);

        // para formatar para LocalDateTime
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        System.out.println(r3);
        // para informar fuso personalizado
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println(r4);
    }
}
