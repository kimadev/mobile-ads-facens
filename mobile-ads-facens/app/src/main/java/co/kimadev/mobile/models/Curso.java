package co.kimadev.mobile.models;

import java.util.List;

public class Curso {

    private String nome;
    private String categoria;
    private String nivel;
    private Double valor;
    private List<Periodo> periodos;

    public Curso(String nome, String categoria, String nivel, Double valor, List<Periodo> periodos) {
        this.nome = nome;
        this.categoria = categoria;
        this.nivel = nivel;
        this.valor = valor;
        this.periodos = periodos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public List<Periodo> getPeriodos() {
        return periodos;
    }

    public void setPeriodos(List<Periodo> periodos) {
        this.periodos = periodos;
    }
}
