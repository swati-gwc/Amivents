package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AmtcUpEventsDisp extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description,timing,venue,aboutevent;
    String et_time[], et_venue[], et_abt_event[];


    String data1, data2;
    int myImage;
    int pos,Value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc_up_events_disp);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        et_time=getResources().getStringArray(R.array.EventTime);
        et_venue=getResources().getStringArray(R.array.EventVenue);
        et_abt_event=getResources().getStringArray(R.array.EventPurpose);
        switch(Value)
        {
            case 1121: et_time=getResources().getStringArray(R.array.EventTime);
                et_venue=getResources().getStringArray(R.array.EventVenue);
                et_abt_event=getResources().getStringArray(R.array.EventPurpose);
                break;
            case 3121:
                et_time=getResources().getStringArray(R.array.Dasp_EventTime);
                et_venue=getResources().getStringArray(R.array.DaspEventVenue);
                et_abt_event=getResources().getStringArray(R.array.DaspEventPurpose);
                break;
            case 4121:
                et_time=getResources().getStringArray(R.array.StrokesEventTime);
                et_venue=getResources().getStringArray(R.array.StrokesEventVenue);
                et_abt_event=getResources().getStringArray(R.array.StrokesEventPurpose);
                break;
            case 6123:
                et_time=getResources().getStringArray(R.array.AlfaazEventTime);
                et_venue=getResources().getStringArray(R.array.AlfaazEventVenue);
                et_abt_event=getResources().getStringArray(R.array.AlfaazEventPurpose);
                break;
            case 1221:
            case 1223:
            case 2123:
            case 5123:
                et_time=getResources().getStringArray(R.array.DummyEventTime);
                et_venue=getResources().getStringArray(R.array.DummyEventVenue);
                et_abt_event=getResources().getStringArray(R.array.DummyEventPurpose);
                break;

        }


        mainImageView=findViewById(R.id.maineventImageView);
        title=findViewById(R.id.event_heading);
        description=findViewById(R.id.event_daydate);
        timing=findViewById(R.id.tvevent_time);
        venue=findViewById(R.id.tvevent_venue);
        aboutevent=findViewById(R.id.tvevent_purpose);

        getData();
        setData();
    }

    private void getData()
    {

        if(getIntent().hasExtra("myImage")&&getIntent().hasExtra("data1")&&getIntent().hasExtra("data2")&&getIntent().hasExtra("position"))
        {
            data1=getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            myImage=getIntent().getIntExtra("myImage",1);
            pos=getIntent().getIntExtra("position",1);

        }
        else
        {
            Toast.makeText(this, "No data",Toast.LENGTH_SHORT).show();
        }
    }

    private void setData()
    {
        title.setText(data1);
        description.setText(data2);
        mainImageView.setImageResource(myImage);
        timing.setText(et_time[pos]);
        venue.setText(et_venue[pos]);
        aboutevent.setText(et_abt_event[pos]);
    }
}
