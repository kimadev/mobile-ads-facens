package co.kimadev.mobile.views;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import co.kimadev.mobile.R;
import co.kimadev.mobile.dataset.CursoDataset;
import co.kimadev.mobile.views.recicleview.CursoAdapter;

public class CursoActivity extends AppCompatActivity {
    private RecyclerView listCurso;
    private CursoAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_cursos);
        listCurso = findViewById(R.id.listCurso);
        setupRecyclerPessoa();
    }

    private void setupRecyclerPessoa() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listCurso.setLayoutManager(layoutManager);
        adapter = new CursoAdapter(new CursoDataset().getCursos());
        listCurso.setAdapter(adapter);
        listCurso.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
