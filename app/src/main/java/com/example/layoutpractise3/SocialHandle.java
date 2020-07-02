package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SocialHandle extends AppCompatActivity {

    int Value;
    private Button instagram;
    private Button facebook;
    private Button twitter;
    private Button website;
    String insta="https://instagram.com/cybercup19?igshid=1ummkbwogiz0o",
            fb="https://www.facebook.com/amtcnoida",
            twit="https://twitter.com/amtcnoida",
            web="http://www.isajaljain.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_handle);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }


        instagram=(Button)findViewById(R.id.instagram);
        facebook=(Button)findViewById(R.id.facebook);
        twitter=(Button)findViewById(R.id.twitter);
        website=(Button)findViewById(R.id.web);

        switch(Value)
        {
            case 11:   //amtc
                        insta="https://instagram.com/cybercup19?igshid=1ummkbwogiz0o";
                        fb="https://www.facebook.com/amtcnoida";
                        twit="https://twitter.com/amtcnoida";
                        web="http://www.isajaljain.com/";
                break;
            case 12:  //alias
                insta="https://instagram.com/asetalias?igshid=153l3skdgw123";
                fb="https://www.facebook.com/asetalias/";
                twit="https://twitter.com/asetalias";
                web="https://asetalias.in/index.html#events";
                break;
            case 21: //cezanne
                insta="https://www.instagram.com/cezanne_dance_crew/?hl=en";
                fb="https://www.facebook.com/cezannedancecrew/?eid=ARDO4HIqbhoB8he-CI2YbYg_osADlm7kfyaXjUkho8BPCTtydXHgLZd9Lt4SgH1xDCd29izIkXYy07rG";
                twit="";
                web="https://www.youtube.com/channel/UC8DGJ0j67L5KJhYZdI6ffaw";//YOUTUBE CHANNEl
                twitter.setVisibility(View.GONE);
                break;
            case 31: //dasp
                insta="https://instagram.com/daspmusicsociety?igshid=bcjlos8lmmhn";
                fb="https://www.facebook.com/DASPAMITY/?ref=page_internal";
                twit="https://twitter.com/search?q=dasp%20music%20society%20aset&src=typed_query";
                web="";
                website.setVisibility(View.GONE);
                break;
            case 41: //strokes
                insta="https://instagram.com/strokes_aset?igshid=ifnchz25ufbr";
                fb="https://www.facebook.com/STROKES.ASET/";
                twit="";
                web="";
                twitter.setVisibility(View.GONE);
                website.setVisibility(View.GONE);
                break;
            case 51: //azmie
                insta="https://instagram.com/azmiekinautanki?igshid=1mmp309804tne";
                fb="https://www.facebook.com/amtcnoida";
                twit="";
                twitter.setVisibility(View.GONE);
                web="https://www.youtube.com/channel/UC04hSHKPuQ5ZnwyuBCog9sQ";//YOU TUBE CHANNEL
                break;
            case 61: //alfaaz
                insta="https://instagram.com/alfaaz.aset?igshid=qyqz7ue4ukmh";
                fb="https://www.facebook.com/AlfaazASET/";
                twit="";
                twitter.setVisibility(View.GONE);
                web="https://alfaazlitsocblog.wordpress.com/";//wordpress
                break;
        }

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(insta));
                startActivity(intent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(fb));
                startActivity(intent);
            }
        });

        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(web));
                startActivity(intent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse(twit));
                startActivity(intent);
            }
        });

    }
}
