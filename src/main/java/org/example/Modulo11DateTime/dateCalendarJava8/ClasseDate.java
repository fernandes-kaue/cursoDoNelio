package org.example.Modulo11DateTime.dateCalendarJava8;

/*
 Date representa um instante
 é do pacote java.util

 O tipo Date armazena o número de milissegundos desde
 01/01/1970 GMT (UTC)

 SimpleDateFormat
 Define formatos para conversão entre Date e String
 Ex:

 dd/MM/yyyy -> 09/08/2025
 dd/MM/yyyy HH:mm:ss -> 09/08/2025 21:21:21
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * Demonstra o uso de java.util.Date e SimpleDateFormat para conversão entre Date e String,
 * além de diferentes formas de instanciar datas. Inclui formatação, parsing e uso do epoch (0L).
 *
 * @author Kaue
 * @since 2025-08-15
 * @version 1.0
 */
public class ClasseDate {
    /**
     * Ponto de entrada do programa.
     * <p>
     * - Faz parsing de strings para Date com SimpleDateFormat.<br>
     * - Formata instâncias de Date para strings.<br>
     * - Demonstra criação de datas atuais e a partir do epoch.
     *
     * @param args argumentos de linha de comando (não utilizados)
     * @throws ParseException se as strings de data estiverem em formato inválido
     */
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        /*
        Pode-se definir o fuso que será usado nos SDF's utilizando
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"); (substituir GMT por TimeZone desejado)
         */

        Date y1 = sdf1.parse("09/08/2025");
        Date y2 = sdf2.parse("09/08/2025 21:21:21");

        System.out.println("Print no formato padrão da classe Date: ");
        System.out.println("Y1: " + y1);
        System.out.println("Y2: " + y2);
        System.out.println();

        System.out.println("Print no formato passado da SimpleDateFormat: ");

        System.out.println("Y1: " + sdf1.format(y1));
        System.out.println("Y2: " + sdf2.format(y2));
        System.out.println();

        /*
        Para criar Date a partir de um Instant
         */
        System.out.println("Print de data instanciada a partir de um Instant: ");
        Date y3 = Date.from(Instant.parse("2026-01-01T00:00:00Z"));
        System.out.println("Y3: " + y3);
        System.out.println();

        // para criar Date com horário atual:
        System.out.println("Print de data instanciada a partir do horário atual: ");
        Date x1 = new Date();
        System.out.println("X1: " + x1);

        // ou
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("X2: " + x2);
        System.out.println();

        /*
        Ao instanciar Date com 0L, é instanciado a data de
        01/01/1970 00:00:00

        Como é calculado em MILISSEGUNDOS, tem de se fazer a conversão antes de instanciar
        exemplo:
        Date data = new Date(1000L (milisegundos) * 60L (vira minutos) * 60L (vira hora) * XL(vira x horas);
         */
        System.out.println("Print de data instanciada a partir de passagem de Milissegundos: ");
        Date x3 = new Date(0L);
        System.out.println("X3: " + x3);


    }
}
