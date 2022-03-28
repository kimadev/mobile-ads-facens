package co.kimadev.mobile.views;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

import co.kimadev.mobile.R;
import co.kimadev.mobile.enums.SexoEnum;
import co.kimadev.mobile.models.Apolice;

public class ApoliceActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apolice);
        Button calcular = findViewById(R.id.btnCalcular);
        Spinner spinnerSexo = findViewById(R.id.spinnerSexo);
        calcular.setOnClickListener(v -> {
            EditText editNumero = findViewById(R.id.editTextNumeroApolice);
            EditText editNome = findViewById(R.id.editTextNomeApolice);
            EditText editIdade = findViewById(R.id.editTextIdade);
            EditText editValor = findViewById(R.id.editTextValor);
            boolean existeErro = validarCampos(Arrays.asList(editNumero, editNome, editIdade, editValor), spinnerSexo);
            if (existeErro) {
                Toast.makeText(this, "Existe(m) campo(s) com erro.", Toast.LENGTH_SHORT).show();
            } else {
                Apolice apolice = new Apolice(Integer.parseInt(editNumero.getText().toString()), editNome.getText().toString(), Integer.parseInt(editNumero.getText().toString()), spinnerSexo.getSelectedItem().toString().charAt(0), Double.parseDouble(editValor.getText().toString()));
                TextView textView = findViewById(R.id.textViewResultadoCalculo);
                textView.setText(String.format("R$ %,.2f", Double.parseDouble(apolice.calcularValor().toString())));
            }
        });
        spinnerSexo.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, SexoEnum.values()));
    }

    private boolean validarCampos(List<EditText> textos, Spinner spinner) {
        for (EditText e : textos) {
            if (e.getText().toString().isEmpty())
                return true;
        }
        return spinner.getSelectedItem().toString().isEmpty();
    }
}
