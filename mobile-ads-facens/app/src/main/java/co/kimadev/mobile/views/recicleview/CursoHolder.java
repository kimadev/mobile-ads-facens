package co.kimadev.mobile.views.recicleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import co.kimadev.mobile.R;

public class CursoHolder extends RecyclerView.ViewHolder {

    public TextView nome;
    public TextView categoria;
    public TextView nivel;
    public TextView nivelTitulo;
    public TextView valor;
    public RecyclerView listPeriodos;

    public CursoHolder(@NonNull View itemView) {
        super(itemView);
        nome = itemView.findViewById(R.id.txtNomeCurso);
        categoria = itemView.findViewById(R.id.txtCategoriaCurso);
        nivel = itemView.findViewById(R.id.txtNivelCurso);
        nivelTitulo = itemView.findViewById(R.id.txtNivelTitulo);
        valor = itemView.findViewById(R.id.txtValorCurso);
        listPeriodos = itemView.findViewById(R.id.listPeriodos);
    }
}
