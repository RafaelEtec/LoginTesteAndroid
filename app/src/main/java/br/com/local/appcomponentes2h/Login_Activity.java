package br.com.local.appcomponentes2h;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
    }

    public void entrarMenu(View view) {
        Intent intent = new Intent(getApplicationContext(),MenuPrincipal_Activity.class);
        startActivity(intent);
    }
}