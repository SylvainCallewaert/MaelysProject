package com.example.muzubi.maelysproject;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Apprendre extends AppCompatActivity {

    private EditText editTextApprendre;
    private TextView textViewApprendre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apprendre);

        //Actionbar retour
        ActionBar actionBar = getActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        //Instanciation
        this.editTextApprendre = (EditText) findViewById(R.id.editTextApprendre) ;
        this.textViewApprendre =  (TextView) findViewById(R.id.textViewApprendre);

    }

    public void onClickValider(View view) {
        //Récupérer la saisie d'un edittext vers un testview
        String text = editTextApprendre.getText().toString();
        textViewApprendre.setText(text);
        //Afficher dans un toast le text validé
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();


    }
}
