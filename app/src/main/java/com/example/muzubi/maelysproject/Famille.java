package com.example.muzubi.maelysproject;
import android.app.ActionBar;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
public class Famille extends AppCompatActivity implements View.OnClickListener {
    private ImageButton imageButtonFirst;
    private ImageButton imageButtonPrevious;
    private ImageButton imageButtonNext;
    private ImageButton imageButtonLast;
    private ImageView imageView1;
    private TextView textViewMessage;
    private int iiCompteur;
    private final int MAX = 5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.famille);

        //Actionbar retour
        ActionBar actionBar = getActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }



        imageButtonFirst = findViewById(R.id.imageButtonFirst);
        imageButtonPrevious = findViewById(R.id.imageButtonPrevious);
        imageButtonNext = findViewById(R.id.imageButtonNext);
        imageButtonLast = findViewById(R.id.imageButtonLast);
        imageView1 = findViewById(R.id.imageView1);
        textViewMessage = findViewById(R.id.textViewMessage);
        iiCompteur = 1;
        imageButtonFirst.setOnClickListener(this);
        imageButtonPrevious.setOnClickListener(this);
        imageButtonNext.setOnClickListener(this);
        imageButtonLast.setOnClickListener(this);
        onClick(imageButtonFirst);
    } /// onCreate
    @Override
    public void onClick(View view) {
        if (view == imageButtonFirst) {
            iiCompteur = 1;
        }
        if (view == imageButtonPrevious) {
            iiCompteur--;
        }
        if (view == imageButtonNext) {
            iiCompteur++;
        }
        if (view == imageButtonLast) {
            iiCompteur = MAX;
        }
        if (iiCompteur == 1) {
            imageView1.setImageResource(R.drawable.maelysaccueil);
        }
       /* if (iiCompteur == 2) {
            imageView1.setImageResource(R.drawable.jr_2);
        }
        if (iiCompteur == 3) {
            imageView1.setImageResource(R.drawable.jr_3);
        }
        if (iiCompteur == 4) {
            imageView1.setImageResource(R.drawable.jr_4);
        }
        if (iiCompteur == 5) {
            imageView1.setImageResource(R.drawable.jr_5);
        }
        afficherCompteur();
        gererBoutons();*/

    } /// onClick
    /**
     *
     */
    private void afficherCompteur() {
        textViewMessage.setText(Integer.toString(iiCompteur) + " sur " + Integer.toString(MAX));
    } /// afficherCompteur
    /**
     *
     */
    private void gererBoutons() {
        imageButtonFirst.setEnabled(iiCompteur != 1);
        imageButtonPrevious.setEnabled(iiCompteur != 1);
        imageButtonNext.setEnabled(iiCompteur != MAX);
        imageButtonLast.setEnabled(iiCompteur != MAX);
        imageButtonFirst.setBackgroundColor(Color.GREEN);
        imageButtonPrevious.setBackgroundColor(Color.GREEN);
        imageButtonNext.setBackgroundColor(Color.GREEN);
        imageButtonLast.setBackgroundColor(Color.GREEN);
        if (iiCompteur == 1) {
            imageButtonFirst.setBackgroundColor(Color.RED);
            imageButtonPrevious.setBackgroundColor(Color.RED);
        }
        if (iiCompteur == MAX) {
            imageButtonNext.setBackgroundColor(Color.RED);
            imageButtonLast.setBackgroundColor(Color.RED);
        }
    } /// gererBoutons
} /// class

