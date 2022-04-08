package co.kimadev.mobile.models;

import java.time.DayOfWeek;

import co.kimadev.mobile.enums.TurnoEnum;

public class Periodo {
    private DayOfWeek dia;
    private TurnoEnum turno;

    public Periodo(DayOfWeek dia, TurnoEnum turno) {
        this.dia = dia;
        this.turno = turno;
    }

    public DayOfWeek getDia() {
        return dia;
    }

    public void setDia(DayOfWeek dia) {
        this.dia = dia;
    }

    public TurnoEnum getTurno() {
        return turno;
    }

    public void setTurno(TurnoEnum turno) {
        this.turno = turno;
    }
}
