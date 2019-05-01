package com.example.teladelogin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private TextView tvLogin;
    private TextView tvSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvLogin = findViewById(R.id.Login);
                tvSenha = findViewById(R.id.Senha);
                String login = tvLogin.getText().toString();
                String senha = tvSenha.getText().toString();

                if (login.equals("teste") && senha.equals("123")){
                    alert("Login efetuado com sucesso");
                } else {
                    alert("Login ou senha incorreto");
                }
            }
        });
    }
    private void alert (String s){
        Toast.makeText(this,s, Toast.LENGTH_LONG).show();
    }
}
