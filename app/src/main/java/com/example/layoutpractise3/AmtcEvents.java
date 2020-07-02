package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AmtcEvents extends AppCompatActivity {
    private Button upcomimgEvents;
    private Button CurrentEvents;
    private Button PastEvents;
    private TextView ClubTitle;

    int Value,nvalue=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc_events);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
             Value = bundle.getInt("value");
        }
        ClubTitle=findViewById(R.id.ClubEventTitle);

        switch(Value)
        {
            case 11: ClubTitle.setText("AMTC: Events");
                break;
            case 12: ClubTitle.setText("ALIAS: Events");
                break;
            case 21: ClubTitle.setText("CEZZANE: Events");
                break;
            case 31: ClubTitle.setText("DASP: Events");
                break;
            case 41: ClubTitle.setText("STROKES: Events");
                break;
            case 51: ClubTitle.setText("AZMIE: Events");
                break;
            case 61: ClubTitle.setText("ALFAAZ: Events");
                break;
        }
        upcomimgEvents=findViewById(R.id.btn_upcom_events);
        CurrentEvents=findViewById(R.id.btn_curr_events);
        PastEvents=findViewById(R.id.btn_past_events);

        upcomimgEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent upet=new Intent(AmtcEvents.this, amtc_UpEvents.class);
                nvalue=100*Value+21;
                upet.putExtra("value",nvalue);
                startActivity(upet);
            }
        });

        CurrentEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent curret=new Intent(AmtcEvents.this, amtc_UpEvents.class);
                nvalue=100*Value+22;
                curret.putExtra("value",nvalue);
                startActivity(curret);
            }
        });

        PastEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pastet=new Intent(AmtcEvents.this, amtc_UpEvents.class);
                nvalue=100*Value+23;
                pastet.putExtra("value",nvalue);
                startActivity(pastet);
            }
        });
    }

}
