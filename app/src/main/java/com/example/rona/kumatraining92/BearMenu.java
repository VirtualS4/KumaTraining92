package com.example.rona.kumatraining92;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rona.kumatraining92.Biodata.KumaBio;
import com.example.rona.kumatraining92.Biodata.KumoBio;
import com.example.rona.kumatraining92.Kuma.RecyclerView.Beartivity;
import com.example.rona.kumatraining92.Kumo.CardView.KumoCardView;

public class BearMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear_menu);
        initbtn((Button)findViewById(R.id.lat1), KumaBio.class);
        initbtn((Button)findViewById(R.id.lat2), Beartivity.class);
        initbtn((Button)findViewById(R.id.btnLat3), KumoBio.class);
        initbtn((Button)findViewById(R.id.btnLat4), KumoCardView.class);
    }
    private void initbtn(Button btn,final Class bearclass){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bearsense = new Intent(BearMenu.this,bearclass);
                startActivity(bearsense);
            }
        });
    }

}
