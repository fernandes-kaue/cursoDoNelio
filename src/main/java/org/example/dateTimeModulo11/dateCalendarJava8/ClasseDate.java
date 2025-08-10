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

    }
}
