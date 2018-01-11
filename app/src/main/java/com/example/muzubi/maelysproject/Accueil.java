package com.example.muzubi.maelysproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Accueil extends AppCompatActivity {

    //création des attributs
    private Intent intentionFamille;
    private Intent intentionJouer;
    private Intent intentionApprendre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);
    }

    //Aller sur la classe Famille
    public void onClickFamille(View view) {
        intentionFamille = new Intent(this, Famille.class);
        startActivityForResult(intentionFamille, 1);

    }
    //Aller sur la classe Jouer
    public void onClickJouer(View view) {
        intentionJouer = new Intent(this, Jouer.class);
        startActivityForResult(intentionJouer, 1);
    }
    //Aller sur la classe Apprendre
    public void onClickApprendre(View view) {
        intentionApprendre = new Intent(this, Apprendre.class);
        startActivityForResult(intentionApprendre, 1);
    }
}
