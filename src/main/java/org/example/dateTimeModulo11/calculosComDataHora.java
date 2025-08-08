package org.example.dateTimeModulo11;

// quick reminder:
// data hora são objetos imutáveis
// para fazer calculos deve-se
// criar um novo objeto com a data resultante

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class calculosComDataHora {
    LocalDate d04 = LocalDate.parse("2026-02-13");
    LocalDateTime d05 = LocalDateTime.parse("2026-02-13T00:00:00");
    Instant d06 = Instant.parse("2026-02-13T00:00:00Z");

    // cria uma nova data com x dias a menos
    LocalDate pastWeekLocalDate = d04.minusDays(7);
    // cria uma nova data com x dias a mais
    LocalDate nextWeekLocalDate = d04.plusDays(7);

    //cria uam nova dat com x anos a menos
    LocalDate pastYearLocalDate = d04.minusYears(1);
    // cria uma nova data com x anos a mais
    LocalDate nextYearLocalDate = d04.plusYears(1);

}
