package com.rikelmy.areadoretangulo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewHolder mViewHolder = new ViewHolder();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.edit_altura = findViewById(R.id.edit_altura);
        this.mViewHolder.edit_largura = findViewById(R.id.edit_largura);
        this.mViewHolder.btn_calcular = findViewById(R.id.button_calcular);
        this.mViewHolder.btn_limpar = findViewById(R.id.button_limpar);
        this.mViewHolder.text_result = findViewById(R.id.text_result);
        this.mViewHolder.btn_calcular.setOnClickListener(this);
        this.mViewHolder.btn_limpar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_calcular) {
            if ("".equals(this.mViewHolder.edit_altura.getText().toString()) || "".equals(this.mViewHolder.edit_largura.getText().toString())) {
                Toast.makeText(this, "preencha os cantos",  Toast.LENGTH_LONG).show();
            }else {

                Double resposta = Double.parseDouble(String.valueOf(this.mViewHolder.edit_altura.getText())) * Double.parseDouble(String.valueOf(this.mViewHolder.edit_largura. getText()));
                mViewHolder.text_result.setText(String.valueOf(resposta));
            }


        } else {
            this.mViewHolder.edit_altura.setText("");
            this.mViewHolder.edit_largura.setText("");
            this.mViewHolder.text_result.setText("");
        }
    }
    private static class ViewHolder{

        EditText edit_altura;
        EditText edit_largura;
        Button btn_calcular;
        Button btn_limpar;
        TextView text_result;


    }
}