package br.com.local.appcomponentes2h;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuPrincipal_Activity extends AppCompatActivity implements View.OnClickListener {

    ImageButton imbFacebook, imbWhatsapp, imbInstagram, imbLinkedin, imbYoutube, imbSnapchat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal_layout);

        imbFacebook = findViewById(R.id.imbFacebook);
        imbWhatsapp = findViewById(R.id.imbWhatsapp);
        imbInstagram = findViewById(R.id.imbInstagram);
        imbLinkedin = findViewById(R.id.imbLinkedin);
        imbYoutube = findViewById(R.id.imbYoutube);
        imbSnapchat = findViewById(R.id.imbSnapchat);

        imbFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Facebook_Activity.class));
            }
        });
        imbWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Whattsapp_Activity.class));
            }
        });
    }

    @Override
    public void onClick(View view) {

    }
}
//@Override
//    public void onclick(View View) {
//        int escolha = view.getId():
//        switch (){
//            case R.id.imbFacebook:
//                startActivity(new Intent(getApplicationContext(),Facebook_Activity.class));
//                ;
//            break;
//        }
//    }