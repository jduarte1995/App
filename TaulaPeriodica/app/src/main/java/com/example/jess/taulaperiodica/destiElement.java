package com.example.jess.taulaperiodica;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class destiElement extends AppCompatActivity {
    private String nom="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desti_element);

        TextView tvNom = (TextView)findViewById(R.id.tvNom);
        TextView tvSerie = (TextView)findViewById(R.id.tvSerie);
        TextView tvMasa = (TextView)findViewById(R.id.tvMasa);
        TextView tvConfiguracio = (TextView)findViewById(R.id.tvConfiguracio);
        TextView tvFase = (TextView)findViewById(R.id.tvFase);



        Bundle b = this.getIntent().getExtras();

        this.nom = b.getString("Nom");
        if(b.getString("Nom").equals("Radi")){
            this.nom = nom+"_(element)";
        }
        if(b.getString("Nom").equals("Bari")){
            this.nom = nom+"_(element)";
        }
        tvNom.setText(b.getString("Nom"));
        tvSerie.setText(b.getString("Serie química"));
        tvMasa.setText(b.getString("Masa atòmica"));
        tvConfiguracio.setText(b.getString("Configuració electrònica"));
        tvFase.setText(b.getString("Fase"));

        final Button btnWiki = (Button)findViewById(R.id.btnWiki);


        btnWiki.setOnClickListener(new View.OnClickListener() {
            String url = "https://ca.wikipedia.org/wiki/" + nom;
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }
}
