package co.kimadev.mobile;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

import co.kimadev.mobile.enums.CursoEnum;
import co.kimadev.mobile.enums.SexoEnum;
import co.kimadev.mobile.models.Aluno;
import co.kimadev.mobile.models.AlunoBuilder;
import co.kimadev.mobile.views.ApoliceActivity;
import co.kimadev.mobile.views.Aula3Activity;
import co.kimadev.mobile.views.CursoActivity;
import co.kimadev.mobile.views.QuizActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.editTextCurso);
        autoCompleteTextView.setOnEditorActionListener((textView, i, keyEvent) -> {
            boolean action = i == EditorInfo.IME_ACTION_SEND;
            if (action)
                btnSalvarClick(null);
            return action;
        });
        String[] cursos = getResources().getStringArray(R.array.cursos_array);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cursos);
        autoCompleteTextView.setAdapter(adapter);
    }

    public void btnSalvarClick(View view) {
        EditText editTextNome = findViewById(R.id.editTextNome);
        EditText editTextRa = findViewById(R.id.editTextRA);
        EditText editTextCurso = findViewById(R.id.editTextCurso);
        CheckBox checkBoxRepresentante = findViewById(R.id.checkBoxRepresentante);
        RadioGroup radioGroupSexo = findViewById(R.id.radioGroupSexo);
        if (validarCampos(Arrays.asList(editTextNome, editTextRa, editTextCurso, radioGroupSexo))) {
            RadioButton radioBtnSelected = findViewById(radioGroupSexo.getCheckedRadioButtonId());
            Aluno aluno = new AlunoBuilder().
                    ra(editTextRa.getText().toString()).
                    nome(editTextNome.getText().toString()).
                    curso(CursoEnum.get(editTextCurso.getText().toString())).
                    representante(checkBoxRepresentante.isActivated()).
                    sexo(SexoEnum.get(radioBtnSelected.getText().toString())).
                    build();

            Toast.makeText(this, "Aluno " + aluno.getNome() + " cadastrado com sucesso! Outras informações: " + aluno.toString(), Toast.LENGTH_SHORT).show();
        }
    }


    private boolean validarCampos(List<View> views) {
        for (View view : views) {

            if (view instanceof EditText && ((EditText) view).getText().toString().isEmpty()) {
                return true;
            }
            if (view instanceof RadioGroup && ((RadioGroup) view).getCheckedRadioButtonId() != -1) {
                return true;
            }
        }
        return false;
    }

    public void btnApoliceIntent(View view) {
        Intent intent = new Intent(this, ApoliceActivity.class);
        startActivity(intent);
    }

    public void btnCursoViewIntent(View view) {
        Intent intent = new Intent(this, CursoActivity.class);
        startActivity(intent);
    }

    public void btnQuizIntent(View view) {
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }

    public void btnAula3Intent(View view) {
        Intent intent = new Intent(this, Aula3Activity.class);
        startActivity(intent);
    }
}