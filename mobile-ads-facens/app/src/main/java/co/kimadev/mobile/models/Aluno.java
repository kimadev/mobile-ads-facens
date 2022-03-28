package co.kimadev.mobile.models;

import co.kimadev.mobile.enums.CursoEnum;
import co.kimadev.mobile.enums.SexoEnum;

public class Aluno {

    private String ra;
    private String nome;
    private CursoEnum curso;
    private Boolean representante;
    private SexoEnum sexo;

    public Aluno(String ra, String nome, CursoEnum curso, Boolean representante, SexoEnum sexo) {
        this.ra = ra;
        this.nome = nome;
        this.curso = curso;
        this.representante = representante;
        this.sexo = sexo;
    }

    public Boolean getRepresentante() {
        return representante;
    }

    public SexoEnum getSexo() {
        return sexo;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public CursoEnum getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", curso=" + curso +
                ", representante=" + representante +
                ", sexo=" + sexo +
                '}';
    }
}
