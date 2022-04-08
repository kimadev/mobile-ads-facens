package co.kimadev.mobile.dataset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import co.kimadev.mobile.models.Pessoa;

public class PessoaDataset {
    private static List<Pessoa> pessoas;

    public PessoaDataset() {
        pessoas = new ArrayList<>();
        pessoas.addAll(Arrays.asList(new Pessoa(1, "Pessoa1", "11111-1111"),
                new Pessoa(2, "Pessoa2", "22222-2222"),
                new Pessoa(3, "Pessoa3", "33333-3333"),
                new Pessoa(4, "Pessoa4", "44444-4444")));
    }

    public static List<Pessoa> getPessoas() {
        return pessoas;
    }

    public static void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
}
