package com.example.jess.taulaperiodica;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton h ;
    ImageButton li ;
    ImageButton be ;
    ImageButton na ;
    ImageButton mg ;
    ImageButton k  ;
    ImageButton ca ;
    ImageButton rb ;
    ImageButton sr;
    ImageButton cs ;
    ImageButton ba;
    ImageButton fr;
    ImageButton ra;

    TextView tvInfo;
    TextView tvMissatge;
    TextView tvContador;

    EditText txtSimbol;

    Button btnJoc;
    Button btnComprova;
    Button btnMes;

    int contador = 0;
    int incorrectes=0;
    int index;
    int x =0;
    int idx;

    boolean jugant = false ;

    String elements[] = {"Hidrogen",
                         "Liti",
                         "Beril·li",
                         "Sodi",
                         "Magnesi",
                         "Potassi",
                         "Calci",
                         "Rubidi",
                         "Stronci",
                         "Cesi",
                         "Bari",
                         "Franci",
                         "Radi"
                        };
    String simbols[] = { "h",
                         "li",
                         "be",
                         "na",
                         "mg",
                         "k",
                         "ca",
                         "rb",
                         "sr",
                         "cs",
                         "ba",
                         "fr",
                         "ra"
                        };

    Boolean posicions[] ={false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false,
                          false
                         };

    int cantitat=13, rang=13,a=0;
    int array[] = new int[cantitat];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = new Intent(MainActivity.this, destiElement.class);
        final Bundle b = new Bundle();

        tvInfo = (TextView) findViewById(R.id.tvInfo);
        tvMissatge = (TextView) findViewById(R.id.tvMissatge);
        tvContador = (TextView) findViewById(R.id.tvContador);
        txtSimbol = (EditText) findViewById(R.id.txtSimbol);

        btnMes = (Button) findViewById(R.id.btnMes);
        btnComprova = (Button) findViewById(R.id.btnComprova);
        btnJoc = (Button) findViewById(R.id.btnJoc);

        h = (ImageButton) findViewById(R.id.imageButtonH);
        li = (ImageButton) findViewById(R.id.imageButtonLi);
        be = (ImageButton) findViewById(R.id.imageButtonBe);
        na = (ImageButton) findViewById(R.id.imageButtonNa);
        mg = (ImageButton) findViewById(R.id.imageButtonMg);
        k = (ImageButton) findViewById(R.id.imageButtonK);
        ca = (ImageButton) findViewById(R.id.imageButtonCa);
        rb = (ImageButton) findViewById(R.id.imageButtonRb);
        sr = (ImageButton) findViewById(R.id.imageButtonSr);
        cs = (ImageButton) findViewById(R.id.imageButtonCs);
        ba = (ImageButton) findViewById(R.id.imageButtonBa);
        fr = (ImageButton) findViewById(R.id.imageButtonFr);
        ra = (ImageButton) findViewById(R.id.imageButtonRa);

        aleatorio(array,a,cantitat,rang);

        if(!jugant) {
            h.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Hidrogen");
                    b.putString("Serie química", "No metalls");
                    b.putString("Masa atòmica", "1,00794 u");
                    b.putString("Configuració electrònica", "1s");
                    b.putString("Fase", "Gas");

                    intent.putExtras(b);

                    startActivity(intent);
                }
            });

            li.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Liti");
                    b.putString("Serie química", "Metall alcalins");
                    b.putString("Masa atòmica", "6.94174064 u");
                    b.putString("Configuració electrònica", "[He]2s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });

            be.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Beril·li");
                    b.putString("Serie química", "Metalls alcalinoterris");
                    b.putString("Masa atòmica", "9,012182(3) u");
                    b.putString("Configuració electrònica", " [He]2s");
                    b.putString("Fase", "Sòlid");


                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            na.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    b.putString("Nom", "Sodi");
                    b.putString("Serie química", "Metalls alcalins");
                    b.putString("Masa atòmica", "22,98976928(2) u");
                    b.putString("Configuració electrònica", " [Ne] 3s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            mg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    b.putString("Nom", "Magnesi");
                    b.putString("Serie química", "Metalls alcalinoterris");
                    b.putString("Masa atòmica", "24,3050(6) u");
                    b.putString("Configuració electrònica", " [Ne] 3s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            k.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Potassi");
                    b.putString("Serie química", "Metalls alcalins");
                    b.putString("Masa atòmica", "39,0983(1) u");
                    b.putString("Configuració electrònica", " [Ar] 4s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            ca.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Carboni");
                    b.putString("Serie química", "No metalls");
                    b.putString("Masa atòmica", "12,0107(8) u");
                    b.putString("Configuració electrònica", " [He] 2s2 2p2");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            rb.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Rubidi");
                    b.putString("Serie química", "Metalls alcalins");
                    b.putString("Masa atòmica", "85,4678(3) u");
                    b.putString("Configuració electrònica", "[Kr] 5s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            sr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Estronci");
                    b.putString("Serie química", "Metalls alcalinoterris");
                    b.putString("Masa atòmica", "87,62 u");
                    b.putString("Configuració electrònica", "[Kr] 5s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            cs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    b.putString("Nom", "Cesi");
                    b.putString("Serie química", "Metalls alcalins");
                    b.putString("Masa atòmica", "132,9054519(2) u");
                    b.putString("Configuració electrònica", "[Xe] 6s");
                    b.putString("Fase", "Sòlid");
                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            ba.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    b.putString("Nom", "Bari");
                    b.putString("Serie química", "Metalls alcalinoterris");
                    b.putString("Masa atòmica", "137,33 u");
                    b.putString("Configuració electrònica", "[Xe] 6s");
                    b.putString("Fase", "Sòlid");
                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            fr.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    b.putString("Nom", "Franci");
                    b.putString("Serie química", "Metalls alcalins");
                    b.putString("Masa atòmica", "(223) u");
                    b.putString("Configuració electrònica", "[Rn] 7s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
            ra.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    b.putString("Nom", "Radi");
                    b.putString("Serie química", "Metalls alcalinoterris");
                    b.putString("Masa atòmica", "(226) u");
                    b.putString("Configuració electrònica", "[Rn] 7s");
                    b.putString("Fase", "Sòlid");

                    intent.putExtras(b);

                    startActivity(intent);

                }
            });
        }



        btnJoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!jugant) {
                    jugant = true;

                } else if (jugant) {
                    jugant = false;
                }
                if (jugant) {
                  jugant();


                } else {
                  noJugant();

                }
            }
        });

        btnComprova.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resposta;
                resposta = txtSimbol.getText().toString().toLowerCase();

                comprova(resposta);


                }
        });

//        btnMes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            tvContador.setText("Encerts:"+contador+"\nErrors:"+incorrectes);
//
//            tvInfo.setText("Escriu el símbol Químic de\n l'element:"+eAleatori());
//            }
//        });

    }

    public void comprova(String resposta)
    {
        String element;

        String valor = simbols[index];

        if(resposta.equals(valor)){
            tvMissatge.setTextColor(Color.GREEN);
            tvMissatge.setText("Correcte!");
            contador++;
            switch(valor){
                case "h":  h.setBackgroundResource(R.drawable.h); break;
                case "li": li.setBackgroundResource(R.drawable.li); break;
                case "be": be.setBackgroundResource(R.drawable.be);break;
                case "na": na.setBackgroundResource(R.drawable.na); break;
                case "mg": mg.setBackgroundResource(R.drawable.mg); break;
                case "k":  k.setBackgroundResource(R.drawable.k);break;
                case "ca": ca.setBackgroundResource(R.drawable.ca); break;
                case "rb": rb.setBackgroundResource(R.drawable.rb); break;
                case "sr": sr.setBackgroundResource(R.drawable.sr); break;
                case "cs": cs.setBackgroundResource(R.drawable.cs); break;
                case "ba": ba.setBackgroundResource(R.drawable.ba); break;
                case "fr": fr.setBackgroundResource(R.drawable.fr); break;
                case "ra": ra.setBackgroundResource(R.drawable.ra); break;
            }

            txtSimbol.setText("");
            tvContador.setText("Encerts:"+contador+"\nErrors:"+incorrectes);

            if(contador == 13) {
                tvInfo.setText("Enhorabona, has encertat\n tots els elements");
                jugant = false;
                contador = 0;
                incorrectes=0;
                x=0;
                tvInfo.setVisibility(tvInfo.VISIBLE);
                tvMissatge.setText("");
                tvMissatge.setVisibility(tvMissatge.INVISIBLE);
                txtSimbol.setVisibility(txtSimbol.INVISIBLE);
                btnComprova.setVisibility(btnComprova.INVISIBLE);
                btnMes.setVisibility(btnMes.INVISIBLE);
                tvContador.setVisibility(tvContador.INVISIBLE);
            }
            else{
                element = eAleatori();
                index = busca(element);
                tvInfo.setText(" Escriu el símbol Químic de\n l'element:" + element);
            }
        }else{
            txtSimbol.setText("");
            tvMissatge.setTextColor(Color.RED);
            incorrectes++;
            tvContador.setText("Encerts:"+contador+"\nErrors:"+incorrectes);
            tvMissatge.setText("Incorrecte!");
        }

    }


    public String eAleatori(){
        String eAleatori = "";

        idx=array[x];

        eAleatori = elements[idx];
        posicions[idx] = true;
        x=x+1;

        return eAleatori;
    }
    public boolean  elementSortit(int posicio){

        return posicions[posicio];
    }

    public int busca(String element){
        int posicio=0;
        for(int i=0;i<elements.length;i++){
            if(element.equals(elements[i])){
                posicio = i;
            }
        }
        return posicio;
    }
    public void aleatorio(int[] array, int i, int cantidad, int rango){

        array[i]=(int)(Math.random()*rango);
        for(i=0;i<cantidad;i++){
            array[i]=(int)(Math.random()*rango);
            for(int j=0;j<i;j++){
                if(array[i]==array[j]){
                    i--;
                }
            }
        }
    }

    public void jugant (){
        h.setBackgroundResource  (R.drawable.h_sin);
        li.setBackgroundResource(R.drawable.li_sin);
        na.setBackgroundResource(R.drawable.na_sin);
        k.setBackgroundResource  (R.drawable.k_sin);
        rb.setBackgroundResource(R.drawable.rb_sin);
        cs.setBackgroundResource(R.drawable.cs_sin);
        fr.setBackgroundResource(R.drawable.fr_sin);
        be.setBackgroundResource(R.drawable.be_sin);
        mg.setBackgroundResource(R.drawable.mg_sin);
        ca.setBackgroundResource(R.drawable.ca_sin);
        sr.setBackgroundResource(R.drawable.sr_sin);
        ba.setBackgroundResource(R.drawable.ba_sin);
        ra.setBackgroundResource(R.drawable.ra_sin);

        contador = 0;
        incorrectes=0;
        tvInfo.setText("Escriu el símbol Químic de\n l'element:");
        btnJoc.setFocusable(true);
        tvInfo.setVisibility(tvInfo.VISIBLE);
        String element = eAleatori();
        index = busca(element);
        tvInfo.setText(tvInfo.getText() + element);
        tvMissatge.setVisibility(tvMissatge.VISIBLE);
        txtSimbol.setVisibility(txtSimbol.VISIBLE);
        btnComprova.setVisibility(btnComprova.VISIBLE);
        btnMes.setVisibility(btnMes.VISIBLE);
        tvContador.setText("Encerts:"+contador+"\nErrors:"+incorrectes);
        tvContador.setVisibility(tvContador.VISIBLE);
    }
    public void noJugant(){
        h.setBackgroundResource  (R.drawable.h);
        li.setBackgroundResource(R.drawable.li);
        na.setBackgroundResource(R.drawable.na);
        k.setBackgroundResource  (R.drawable.k);
        rb.setBackgroundResource(R.drawable.rb);
        cs.setBackgroundResource(R.drawable.cs);
        fr.setBackgroundResource(R.drawable.fr);
        be.setBackgroundResource(R.drawable.be);
        mg.setBackgroundResource(R.drawable.mg);
        ca.setBackgroundResource(R.drawable.ca);
        sr.setBackgroundResource(R.drawable.sr);
        ba.setBackgroundResource(R.drawable.ba);
        ra.setBackgroundResource(R.drawable.ra);

        btnJoc.setFocusable(false);
        tvInfo.setVisibility(tvInfo.INVISIBLE);
        tvInfo.setText("");
        tvMissatge.setVisibility(tvMissatge.INVISIBLE);
        txtSimbol.setVisibility(txtSimbol.INVISIBLE);
        txtSimbol.setText("");
        btnComprova.setVisibility(btnComprova.INVISIBLE);
        btnMes.setVisibility(btnMes.INVISIBLE);
        tvMissatge.setText("");
        tvContador.setVisibility(tvContador.INVISIBLE);
    }


}
