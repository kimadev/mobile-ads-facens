package co.kimadev.mobile.views.recicleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.time.format.TextStyle;
import java.util.List;
import java.util.Locale;

import co.kimadev.mobile.R;
import co.kimadev.mobile.models.Periodo;

public class PeriodoAdapter extends RecyclerView.Adapter<PeriodoHolder> {

    private List<Periodo> periodos;

    public PeriodoAdapter(List<Periodo> periodos) {
        this.periodos = periodos;
    }

    @NonNull
    @Override
    public PeriodoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item_periodo, viewGroup, false);
        return new PeriodoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeriodoHolder holder, int i) {
        Periodo periodo = periodos.get(i);
        holder.dia.setText(periodo.getDia().getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
        holder.turno.setText(periodo.getTurno().getValue());
    }

    @Override
    public int getItemCount() {
        return periodos.size();
    }
}
