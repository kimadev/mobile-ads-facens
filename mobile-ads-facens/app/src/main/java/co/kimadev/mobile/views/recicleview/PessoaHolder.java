package co.kimadev.mobile.views.recicleview;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import co.kimadev.mobile.R;

public class PessoaHolder extends RecyclerView.ViewHolder {

    public TextView nome;
    public TextView telefone;
    public ImageButton excluir;

    public PessoaHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.txtNome);
        telefone = itemView.findViewById(R.id.txtTelefone);
        excluir = itemView.findViewById(R.id.btnExcluir);
    }
}
