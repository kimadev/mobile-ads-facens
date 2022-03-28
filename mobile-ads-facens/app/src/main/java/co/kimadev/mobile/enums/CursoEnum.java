package co.kimadev.mobile.enums;

public enum CursoEnum {

    ADS("Análise e Desenvolvimento de Sistemas"),
    CDC("Ciência da computação"),
    EDC("Engenharia da computação"),
    EDS("Engenharia de software");

    private final String nome;

    CursoEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public static CursoEnum get(String nome){
        for (CursoEnum e: CursoEnum.values()) {
            if (nome.equals(e.getNome()))
                return e;
        }
        throw new RuntimeException("Enum não encontrado");
    }
}
