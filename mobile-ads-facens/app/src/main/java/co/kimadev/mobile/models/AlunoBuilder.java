
package co.kimadev.mobile.models;

import co.kimadev.mobile.enums.CursoEnum;
import co.kimadev.mobile.enums.SexoEnum;

public class AlunoBuilder {
    private String ra;
    private String nome;
    private CursoEnum curso;
    private Boolean representante;
    private SexoEnum sexo;

    public Aluno build() {
        return new Aluno(ra, nome, curso, representante, sexo);
    }

    public AlunoBuilder representante(Boolean representante) {
        this.representante = representante;
        return this;
    }

    public AlunoBuilder sexo(SexoEnum sexo) {
        this.sexo = sexo;
        return this;
    }

    public AlunoBuilder ra(String ra) {
        this.ra = ra;
        return this;
    }

    public AlunoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public AlunoBuilder curso(CursoEnum curso) {
        this.curso = curso;
        return this;
    }
}
