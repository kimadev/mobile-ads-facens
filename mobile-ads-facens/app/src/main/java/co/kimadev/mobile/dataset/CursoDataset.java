package co.kimadev.mobile.dataset;

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import co.kimadev.mobile.enums.TurnoEnum;
import co.kimadev.mobile.models.Curso;
import co.kimadev.mobile.models.Periodo;

public class CursoDataset {
    private static List<Curso> cursos;

    public CursoDataset() {
        cursos = new ArrayList<>();
        cursos.addAll(
                Arrays.asList(
                        new Curso("Musicalização", "Infantil", "I", 125.0, Collections.singletonList(new Periodo(DayOfWeek.TUESDAY, TurnoEnum.MANHA))),
                        new Curso("Musicalização", "Infantil", "II", 135.0, Collections.singletonList(new Periodo(DayOfWeek.WEDNESDAY, TurnoEnum.MANHA))),
                        new Curso("Musicalização", "Infantil", "III", 145.00, Collections.singletonList(new Periodo(DayOfWeek.THURSDAY, TurnoEnum.MANHA))),
                        new Curso("Musicalização", "Básica", "", 150.0, Arrays.asList(new Periodo(DayOfWeek.THURSDAY, TurnoEnum.TARDE), new Periodo(DayOfWeek.FRIDAY, TurnoEnum.TARDE))),
                        new Curso("Piano", "Clássico", "", 200.0, Arrays.asList(new Periodo(DayOfWeek.MONDAY, TurnoEnum.MANHA), new Periodo(DayOfWeek.TUESDAY, TurnoEnum.MANHA), new Periodo(DayOfWeek.FRIDAY, TurnoEnum.MANHA)))
                )
        );
    }

    public List<Curso> getCursos() {
        return cursos;
    }

}
