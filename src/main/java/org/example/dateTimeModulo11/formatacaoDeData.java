package org.example.dateTimeModulo11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Demonstra várias formas de formatar LocalDate, LocalDateTime e Instant utilizando
 * DateTimeFormatter, incluindo padrões customizados e aplicação de fuso horário via ZoneId.
 */
public class formatacaoDeData {
    /**
     * Ponto de entrada do programa que mostra:
     * - formatação de datas com padrões personalizados;
     * - formatação de data-hora local;
     * - formatação de instantes globais (Instant) respeitando o fuso horário.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2026-02-13");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
        Instant d06 = Instant.parse("2026-02-13T00:00:00Z");

        /*
         formatar objeto data para customizado
         necessita de formatador primeiro
        */
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(d04.format(fmt1));
        // OU
        System.out.println(fmt1.format(d04));
        // OU
        System.out.println(d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // formatar data-hora para customizado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(fmt2.format(d05));
        // OU
        System.out.println(d05.format(fmt2));

        /*
         formatar data-hora gmt
         precisa usar a função .withZone()
         pode-se obter automaticamente o fuso do PC com o ZoneId.systemDefault();
        */
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
        System.out.println(fmt3.format(d06));
    }
}
