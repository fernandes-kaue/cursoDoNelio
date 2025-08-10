package org.example.dateTimeModulo11.dateCalendarJava8;

// Date repreasente um instante
// é do pacote java.util
//
// O tipo Date armazena o número de milissegundos desde
// 01/01/1970 GMT (UTC)

// SimpleDateFormat
// Define formatos para conversão entre Date e String
// Ex:
//
// dd/MM/yyyy -> 09/08/2025
// dd/MM/yyyy HH:mm:ss -> 09/08/2025 21:21:21

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseDate {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date y1 = sdf1.parse("09/08/2025");
        Date y2 = sdf2.parse("09/08/2025 21:21:21");

        System.out.println("Y1: " + y1);
        System.out.println("Y2: " + y2);

        System.out.println("Y1: " + sdf1.format(y1));
        System.out.println("Y2: " + sdf2.format(y2));

        // para criar Date com horário atual:
        Date x1 = new Date();
        System.out.println("X1: " + x1);

        // ou
        Date x2 = new Date(System.currentTimeMillis());
        System.out.println("X2: " + x2);

        /*
        Ao instanciar Date com 0L, é instanciado a data de
        01/01/1970 00:00:00

        Como é calculado em MILISSEGUNDOS, tem de se fazer a conversão antes de instanciar
        exemplo:
        Date data = new Date(1000L (milisegundos) * 60L (vira minutos) * 60L (vira hora) * XL(vira x horas);
         */
        Date x3 = new Date(0L);
        System.out.println("X3: " + x3);

    }
}
