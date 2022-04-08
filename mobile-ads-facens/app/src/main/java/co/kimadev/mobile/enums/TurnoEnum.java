package co.kimadev.mobile.enums;

public enum TurnoEnum {
    MANHA("Manhã"),
    TARDE("Tarde"),
    NOITE("Noite");

    private final String value;

    TurnoEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
