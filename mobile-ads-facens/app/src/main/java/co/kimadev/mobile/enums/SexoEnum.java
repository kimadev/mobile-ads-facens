package co.kimadev.mobile.enums;

public enum SexoEnum {
    MASCULINO('M'),
    FEMININO('F');

    private final Character sigla;

    SexoEnum(Character sigla) {
        this.sigla = sigla;
    }

    public static SexoEnum get(String sigla){
        for (SexoEnum e: SexoEnum.values()) {
            if (e.getSigla().equals(sigla.charAt(0)))
                return e;
        }
        throw new RuntimeException("Enum não encontrado");
    }

    public Character getSigla() {
        return sigla;
    }

}
