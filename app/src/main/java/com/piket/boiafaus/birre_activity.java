package com.piket.boiafaus;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class birre_activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_birra);
        final Button birra_1 = (Button) findViewById(R.id.btn1);
        Button birra_2 = (Button) findViewById(R.id.btn2);
        Button birra_3 = (Button) findViewById(R.id.btn3);
        final Button birra_4 = (Button) findViewById(R.id.btn4);
        birra_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), birra1.class);
                startActivity(myIntent);
            }
        });
        birra_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), birra2.class);
                startActivity(myIntent);
            }
        });
        birra_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), birra3.class);
                startActivity(myIntent);
            }
        });
        birra_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), birra4.class);
                startActivity(myIntent);
            }
        });
    }
}
