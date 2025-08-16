package org.example.Modulo11DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Demonstra a conversão de instantes globais (Instant) para representações locais
 * (LocalDate e LocalDateTime) usando ZoneId, bem como a extração de componentes de data e hora.
 */
public class formatacaoDataHoraGlobalParaLocal {
    /**
     * Ponto de entrada do programa que ilustra:
     * - conversão de Instant para LocalDate e LocalDateTime com fuso do sistema ou personalizado;
     * - extração de dia, mês, ano, hora e minuto de objetos locais.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
        Instant d06 = Instant.parse("2026-02-13T00:00:00Z");

        /*
         para se formatar data global para local
         precisa-se informar o TimeZone (fuso)
        */

        /*
         para se formatar um Instant para uma LocalDate
         pode-se usar:
        */
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

        // como obter dia/mes/ano/hora/minuto
        System.out.println(d04.getDayOfMonth());
        System.out.println(d04.getMonthValue());
        System.out.println(d04.getYear());
        System.out.println(d05.getHour());
        System.out.println(d05.getMinute());
    }
}
