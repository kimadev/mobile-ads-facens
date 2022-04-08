package co.kimadev.mobile.views.recicleview;

import static java.security.AccessController.getContext;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import co.kimadev.mobile.R;
import co.kimadev.mobile.models.Curso;
import co.kimadev.mobile.models.Periodo;

public class CursoAdapter extends RecyclerView.Adapter<CursoHolder> {

    private RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
    private List<Curso> cursos;

    public CursoAdapter(List<Curso> cursos) {
        this.cursos = cursos;
    }

    @NonNull
    @Override
    public CursoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CursoHolder(LayoutInflater.
                from(parent.getContext()).
                inflate(R.layout.card_item_curso, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CursoHolder holder, int position) {
        Curso curso = cursos.get(position);
        holder.nome.setText(curso.getNome());
        holder.categoria.setText(curso.getCategoria());
        if (curso.getNivel().isEmpty()) {
            holder.nivelTitulo.setVisibility(View.INVISIBLE);
            holder.nivel.setVisibility(View.INVISIBLE);
        }
        else {
            holder.nivelTitulo.setVisibility(View.VISIBLE);
            holder.nivel.setVisibility(View.VISIBLE);
            holder.nivel.setText(curso.getNivel());
        }
        holder.valor.setText(String.format("R$ %,.2f", curso.getValor()).replace(".",","));
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                holder.listPeriodos.getContext(),
                LinearLayoutManager.VERTICAL,
                false
        );
        layoutManager.setInitialPrefetchItemCount(curso.getPeriodos().size());
        PeriodoAdapter periodoAdapter = new PeriodoAdapter(curso.getPeriodos());

        holder.listPeriodos.setLayoutManager(layoutManager);
        holder.listPeriodos.setAdapter(periodoAdapter);
        holder.listPeriodos.setRecycledViewPool(viewPool);
    }

    @Override
    public int getItemCount() {
        return cursos.size();
    }

}
