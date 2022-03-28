package co.kimadev.mobile.views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import co.kimadev.mobile.R;

public class QuizActivity extends AppCompatActivity {

    private Button btnLimpar;
    private TextView txtResultado;
    private RadioGroup rg1;
    private RadioGroup rg2;
    private RadioGroup rg3;
    private Button btnConferir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_activity);
        btnLimpar = findViewById(R.id.btnLimpar);
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText("");
        txtResultado.setVisibility(View.INVISIBLE);
        btnConferir = findViewById(R.id.btnConferir);
        Button btnConferir = findViewById(R.id.btnConferir);
        btnConferir.setOnClickListener(l -> {
            rg1 = findViewById(R.id.radioGroup);
            rg2 = findViewById(R.id.radioGroup2);
            rg3 = findViewById(R.id.radioGroup3);
            List<String> respostas = validarCampos(Arrays.asList(rg1,rg2,rg3));
            if(!respostas.isEmpty()){
                int total = 0;
                if(respostas.get(0).equals(getString(R.string.quiz_resposta_1)))
                    total++;
                if(respostas.get(1).equals(getString(R.string.quiz_resposta_2)))
                    total++;
                if(respostas.get(2).equals(getString(R.string.quiz_resposta_3)))
                    total++;
                txtResultado.setVisibility(View.VISIBLE);
                btnConferir.setVisibility(View.INVISIBLE);
                btnLimpar.setVisibility(View.VISIBLE);
                txtResultado.setText(String.format("%s acertos de 3", total));
            }
            else
                Toast.makeText(this, "Responda todas as per", Toast.LENGTH_SHORT).show();
        });

        btnLimpar.setVisibility(View.INVISIBLE);
        btnLimpar.setOnClickListener(l -> {
            btnLimpar.setVisibility(View.INVISIBLE);
            txtResultado.setVisibility(View.INVISIBLE);
            rg1.clearCheck();
            rg2.clearCheck();
            rg3.clearCheck();
            btnConferir.setVisibility(View.VISIBLE);
        });
    }

    private List<String> validarCampos(List<RadioGroup> radioGroups) {
        List<String> respostas = new ArrayList<>();
        for (RadioGroup rg: radioGroups) {
            if (rg.getCheckedRadioButtonId() != -1) {
                RadioButton rb = findViewById(rg.getCheckedRadioButtonId());
                respostas.add(rb.getText().toString());
            }
            else{
                return Collections.emptyList();
            }
        }
        btnLimpar.setVisibility(View.VISIBLE);
        return respostas;
    }
}
