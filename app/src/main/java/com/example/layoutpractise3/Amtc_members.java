package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Amtc_members extends AppCompatActivity {

    private Button corememberbutton, generalmemberbtn, facultybtn;
    int Value,nvalue=0;
    private TextView MemTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc_members);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        MemTitle=findViewById(R.id.Membertitle);
        corememberbutton=findViewById(R.id.btn_main_member);
        generalmemberbtn=findViewById(R.id.btn_gen_members);
        facultybtn=findViewById(R.id.btn_teacher_member);

        switch(Value)
        {
            case 11: MemTitle.setText("AMTC: MEMBERS");
                break;
            case 12: MemTitle.setText("ALIAS: MEMBERS");
                break;
            case 21: MemTitle.setText("CEZZANE: MEMBERS");
                break;
            case 31: MemTitle.setText("DASP: MEMBERS");
                break;
            case 41: MemTitle.setText("STROKES: MEMBERS");
                break;
            case 51: MemTitle.setText("AZMIE: MEMBERS");
                break;
            case 61: MemTitle.setText("ALFAAZ: MEMBERS");
                break;
        }

        corememberbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cmbutton= new Intent(Amtc_members.this, CoreTeamMembers.class);
                nvalue=100*Value+31;
                cmbutton.putExtra("value",nvalue);
                startActivity(cmbutton);
            }
        });

        generalmemberbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cmbutton= new Intent(Amtc_members.this, CoreTeamMembers.class);
                nvalue=100*Value+32;
                cmbutton.putExtra("value",nvalue);
                startActivity(cmbutton);
            }
        });

        facultybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cmbutton= new Intent(Amtc_members.this, CoreTeamMembers.class);
                nvalue=100*Value+33;
                cmbutton.putExtra("value",nvalue);
                startActivity(cmbutton);
            }
        });
    }
}
