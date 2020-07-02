package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tech extends AppCompatActivity {

    private TextView GenClubHeading;
  private Button amtc, alias;
  int value, nvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        GenClubHeading=findViewById(R.id.genclubhead);
        amtc=findViewById(R.id.amtc_bttn);
        alias=findViewById(R.id.alias_btn);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getInt("value");
        }

        DISPLAY();

        amtc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(tech.this, AMTC.class);
                //int no=1;
               // int x=10*value+number;
                //value=AMTC(no);
                nvalue=10*value+1;
                intent.putExtra("value",nvalue);
                startActivity(intent);
            }
        });

        alias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nvalue=10*value+2;
                Intent intent= new Intent(tech.this, AMTC.class);
                intent.putExtra("value",nvalue);
                startActivity(intent);
            }
        });


    }

    void DISPLAY()
    {
        alias.setVisibility(View.GONE);
        switch(value)
        {
            case 1:  GenClubHeading.setText("TECHNICAL SOCIETIES");
                amtc.setText("AMTC");
                alias.setVisibility(View.VISIBLE);
                alias.setText("ALIAS");
                break;

            case 2:  GenClubHeading.setText("DANCE SOCIETIES");
                amtc.setText("CEZZANE");
                break;
            case 3: GenClubHeading.setText("MUSIC SOCIETIES");
                amtc.setText("DASP");
                break;

            case 4:  GenClubHeading.setText("ART SOCIETIES");
                amtc.setText("STROKES");
                 break;

            case 5: GenClubHeading.setText("DRAMA SOCIETIES");
                amtc.setText("AZMIE");
                break;
            case 6:GenClubHeading.setText("LITERARY SOCIETIES");
                amtc.setText("ALFAAZ");
                break;
        }

    }
}


//if(value==1)  GenClubHeading.setText("TECHNICAL SOCITIES");
// if(value==4) GenClubHeading.setText("ART SOCITIES");
         /*
        Intent i=getIntent();
        Bundle b=i.getExtras();
        if(b!=null)
        {
            value=(int) b.get("value");
        }
        if(value==1) GenClubHeading.setText("TECH SOCITIES");
        else if (value==4) GenClubHeading.setText("ART SOCITIES");*/