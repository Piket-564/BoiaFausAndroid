package com.piket.boiafaus;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class help_page extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_page);
        final Button facebook = (Button) findViewById(R.id.fbpage);
        final Button tripadvisor = (Button) findViewById(R.id.trippage);
        final Button java = (Button) findViewById(R.id.java);
        facebook.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse("https://www.facebook.com/boiafausspensavopeggio/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        tripadvisor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse("https://www.tripadvisor.it/Restaurant_Review-g194664-d7258667-Reviews-Boia_Fauss_Pensavo_Peggio-Alba_Province_of_Cuneo_Piedmont.html");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        java.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Uri uri = Uri.parse("https://github.com/Piket-564/Boia_FausApp/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
