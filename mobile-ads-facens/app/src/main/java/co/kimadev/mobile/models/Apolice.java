package co.kimadev.mobile.models;

import co.kimadev.mobile.enums.SexoEnum;

public class Apolice {
    private Integer numero;
    private String nome;
    private Integer idade;
    private Character sexo;
    private Double valorAutomovel;

    public Apolice(Integer numero, String nome, Integer idade, Character sexo, Double valorAutomovel) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.valorAutomovel = valorAutomovel;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(Double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    public Double calcularValor() {
        if (SexoEnum.MASCULINO.getSigla().equals(sexo) && idade >= 0 && idade <= 25) {
            return valorAutomovel * 10 / 100;
        } else if (SexoEnum.MASCULINO.getSigla().equals(sexo) && idade > 25) {
            return valorAutomovel * 5 / 100;
        } else if (SexoEnum.FEMININO.getSigla().equals(sexo)) {
            return valorAutomovel * 2 / 100;
        }
        throw new RuntimeException("Opção inválida");
    }
}
