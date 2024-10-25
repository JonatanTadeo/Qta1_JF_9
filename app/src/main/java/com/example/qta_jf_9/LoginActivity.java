package com.example.qta_jf_9;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion); // Asegúrate de que este sea el layout correcto

        // Encuentra el campo de texto y el botón
        final TextInputEditText usernameInput = findViewById(R.id.usernameInput);
        Button loginButton = findViewById(R.id.loginButton);

        // Configura el click listener para el botón de inicio de sesión
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String usuario = usernameInput.getText().toString();
                Intent intent = new Intent(LoginActivity.this, dos_mitades.class);
                intent.putExtra("usuario", usuario); // Pasamos el usuario a la siguiente pantalla
                startActivity(intent);
            }
        });
    }
}
