package co.kimadev.mobile.views.recicleview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import co.kimadev.mobile.R;

public class PeriodoHolder extends RecyclerView.ViewHolder {

    public TextView dia;
    public TextView turno;

    public PeriodoHolder(@NonNull View itemView) {
        super(itemView);
        dia = itemView.findViewById(R.id.txtDiaCurso);
        turno = itemView.findViewById(R.id.txtTurnoCurso);
    }
}
