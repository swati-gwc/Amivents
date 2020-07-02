package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AMTC extends AppCompatActivity {

    private TextView ClubTitle;
    private TextView ClubSubTitle;
    private TextView Clubmaininfo;
    private TextView NoofMembers;
    private Button details;
    private Button join;
    private ImageView ClubBanner, ClubProfile;
    int Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_m_t_c);

        ClubBanner=findViewById(R.id.img_header);
        ClubProfile=findViewById(R.id.img_profile);
        ClubTitle=findViewById(R.id.title_amtc);
        ClubSubTitle=findViewById(R.id.subtitle_amtc);
        Clubmaininfo=findViewById(R.id.para);
        NoofMembers=findViewById(R.id.noofmember);
        details=(Button)findViewById(R.id.details_bttn);
        join=(Button)findViewById(R.id.join_bttn);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        switch(Value)
        {
            case 11: ClubTitle.setText("AMTC");
                     ClubSubTitle.setText("AMITY MICROSOFT TECHNICAL CLUB");
                     ClubProfile.setImageResource(R.drawable.amtc_logo);
                     ClubBanner.setImageResource(R.drawable.amtc_banner);
                     break;
            case 12:   ClubTitle.setText("ALIAS");
                     Clubmaininfo.setText(R.string.AliasAbout);
                     ClubSubTitle.setText("Amity Linux Assistance Sapience");
                     ClubProfile.setImageResource(R.drawable.alias_logo);
                     ClubBanner.setImageResource(R.drawable.alias_banner);
                      break;
            case 21:   ClubTitle.setText("CEZZANE");
                      Clubmaininfo.setText(R.string.CezzaneAbout);
                       ClubSubTitle.setText("The Dance Society of Aset");
                      NoofMembers.setText("(27 members)");
                      ClubProfile.setImageResource(R.drawable.cezzane_logo);
                      ClubBanner.setImageResource(R.drawable.cezzane_banner);
                      break;
            case 31: ClubTitle.setText("DASP");
                    ClubSubTitle.setText("Music Society Of Aset");
                    Clubmaininfo.setText(R.string.AboutDASP);
                     ClubProfile.setImageResource(R.drawable.dasp_logo);
                     ClubBanner.setImageResource(R.drawable.dimg5);
                    NoofMembers.setText("(51 members)");
                    break;

            case 41: ClubTitle.setText("STROKES");
                     ClubSubTitle.setText("Let your creativity flow....");
                     Clubmaininfo.setText(R.string.stokesmaininfo);
                     ClubBanner.setImageResource(R.drawable.simg2);
                     ClubProfile.setImageResource(R.drawable.strokes);
                     NoofMembers.setText("(20 members)");
                      break;
            case 51:   ClubTitle.setText("AZMIE");
                ClubSubTitle.setText("The Drama Society of Aset");
                NoofMembers.setText("(30 members)");
                Clubmaininfo.setText(R.string.AzmieAbout);
                ClubProfile.setImageResource(R.drawable.azmie_logo);
                ClubBanner.setImageResource(R.drawable.azmie_banner);
                break;
            case 61:   ClubTitle.setText("ALFAAZ");
                ClubSubTitle.setText("The Literary Society of Aset");
                NoofMembers.setText("(32 members)");
                Clubmaininfo.setText(R.string.aboutAlfaaz);
                ClubBanner.setImageResource(R.drawable.alfz_eimg3);
                ClubProfile.setImageResource(R.drawable.alfz_logo);

                break;
        }



        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it=new Intent(AMTC.this, Amtc_details.class);
                it.putExtra("value",Value);
                startActivity(it);
            }
        });

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent joinintent=new Intent(AMTC.this, FormAmtc.class);
                joinintent.putExtra("value",Value);
                startActivity(joinintent);
            }
        });

    }
}
