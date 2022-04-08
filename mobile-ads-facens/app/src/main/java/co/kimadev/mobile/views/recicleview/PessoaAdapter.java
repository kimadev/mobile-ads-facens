package co.kimadev.mobile.views.recicleview;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import co.kimadev.mobile.R;
import co.kimadev.mobile.dataset.PessoaDataset;
import co.kimadev.mobile.models.Pessoa;

public class PessoaAdapter extends RecyclerView.Adapter<PessoaHolder> {

    private List<Pessoa> pessoas;
    private Button btnAdicionar;

    public PessoaAdapter(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @NonNull
    @Override
    public PessoaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PessoaHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_item_pessoa, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PessoaHolder holder, int position) {
        holder.nome.setText(pessoas.get(position).getNome());
        holder.telefone.setText(pessoas.get(position).getTelefone());
        holder.excluir.setOnClickListener(l -> excluirItem(position));
    }

    @Override
    public int getItemCount() {
        return pessoas.size();
    }

    private void excluirItem(int position){
        pessoas.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, pessoas.size());
    }

    private void addItem(Pessoa pessoa){
        PessoaDataset.addPessoa(pessoa);
        notifyItemRangeChanged(PessoaDataset.getPessoas().size(), PessoaDataset.getPessoas().size());
    }


    public void btnAddOnclick(){
        //adapter.addItem(new Pessoa(10, "Add", "00000-0000"));
    }
}
