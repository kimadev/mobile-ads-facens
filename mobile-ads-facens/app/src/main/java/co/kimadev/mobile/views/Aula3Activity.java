package co.kimadev.mobile.views;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import co.kimadev.mobile.R;
import co.kimadev.mobile.dataset.PessoaDataset;
import co.kimadev.mobile.views.recicleview.PessoaAdapter;

public class Aula3Activity extends AppCompatActivity {
    private RecyclerView listPessoa;
    private PessoaAdapter adapter;
    private FloatingActionButton btnAdicionar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aula_3_activity);
        listPessoa = findViewById(R.id.listPessoa);
        btnAdicionar = findViewById(R.id.btnAdicionar);
        btnAdicionar.setOnClickListener(l -> {

        });
        setupRecyclerPessoa();
    }

    private void setupRecyclerPessoa() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listPessoa.setLayoutManager(layoutManager);
        adapter = new PessoaAdapter(new PessoaDataset().getPessoas());
        listPessoa.setAdapter(adapter);
        listPessoa.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }
}
