package org.example.dateTimeModulo11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanciacaoDeData {
    /**
     * Demonstra a instanciação e manipulação de objetos do tipo Date e
     * DateTime usando a API Date-Time do Java. Vários formatos e métodos são
     * utilizados para criar, analisar e formatar datas e horários.
     *
     */
    /**
     * Ponto de entrada do programa que demonstra:
     * - criação de datas/horas atuais (LocalDate, LocalDateTime, Instant);
     * - parsing de textos ISO 8601;
     * - parsing com formatos personalizados;
     * - criação a partir de componentes isolados.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        // cria data do dia atual
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);

        // cria data com horário e fuso
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        // cria data com horário e fuso com o Z no final (GMT)
        Instant d03 = Instant.now();
        System.out.println(d03);

        // instancia data a partir de texto ISO 8601
        LocalDate d04 = LocalDate.parse("2026-02-13");
        System.out.println(d04);

        // instancia data a partir de texto ISO 8601 COM HORARIO
        LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
        System.out.println(d05);

        // instancia data a partir de texto ISO 8601 COM FUSO GMT
        Instant d06 = Instant.parse("2026-02-13T00:00:00Z");
        System.out.println(d06);

        /*
         instancia data a partir de texto ISO 8601 COM FUSO
         diferente do GMT
        */
        Instant d07 = Instant.parse("2026-02-13T00:00:00-03:00");
        System.out.println(d07);

        // instanciação de data a partir de texto em formato customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08 = LocalDate.parse("13/06/2029", fmt1);
        System.out.println(d08);

        // instanciação de data hora a partir de texto em formato customizado
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d09 = LocalDateTime.parse("13/06/2029 12:02", fmt2);
        System.out.println(d09);

        // instanciação de dados isolados
        LocalDate d10 = LocalDate.of(2025, 12, 5);
        System.out.println(d10);

        LocalDateTime d11 = LocalDateTime.of(2025, 12, 5, 12, 35);
        System.out.println(d11);
    }
}
