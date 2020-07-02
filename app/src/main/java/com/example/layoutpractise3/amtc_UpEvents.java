package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class amtc_UpEvents extends AppCompatActivity {

    RecyclerView recyclerView;
    private  TextView EventHeading, NoEventStatus;

    private Boolean data_available=true;

    String s1[],s2[];
    int Value;
    int image[]={};
    int amtcEventImage[]={
            R.drawable.event1, R.drawable.event2, R.drawable.event3,R.drawable.event4,
            R.drawable.event5, R.drawable.event6, R.drawable.event7, R.drawable.event8,
            R.drawable.event9,R.drawable.event10
    };
    int daspEventImage[]={
            R.drawable.deimg1
    };
    int alfaazPastEvent[]={
           R.drawable.alfz_eimg1, R.drawable.alfz_eimg2, R.drawable.azmie_img3
    };
    int strokesEventImage[]={
         R.drawable.sevimg1,R.drawable.sevimg2,R.drawable.sevimg3,R.drawable.sevimg4,R.drawable.sevimg5,
            R.drawable.sevimg6,R.drawable.sevimg7,R.drawable.sevimg8,R.drawable.sevimg9,R.drawable.sevimg10
    };
  int DummyEventImage[]={
    R.drawable.work,   R.drawable.seminar,R.drawable.compete
  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc__up_events);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        recyclerView=findViewById(R.id.recycler1View);
        EventHeading=findViewById(R.id.evt_head);
        NoEventStatus=findViewById(R.id.novettxt);
        NoEventStatus.setVisibility(View.GONE);

        int Second=Value%10;
        if(Second==1)   EventHeading.setText("UpComing Events");
        else if (Second==2) EventHeading.setText("Current Events");
        else if (Second==3) EventHeading.setText("Past Events");

        switch(Value)
        {
            case 1121: s1=getResources().getStringArray(R.array.Amtc_EVENT_TITLE);
                     s2=getResources().getStringArray(R.array.AMTC_Event_Day);
                     image=amtcEventImage;
                    break;
            case 3123:
                    s1=getResources().getStringArray(R.array.DASP_EVENT_TITLE);
                     s2=getResources().getStringArray(R.array.DASP_Event_Day);
                      image=daspEventImage;
                   break;
            case 4121: s1=getResources().getStringArray(R.array.SROKES_EVENT_TITLE);
                     s2=getResources().getStringArray(R.array.AMTC_Event_Day);
                      image=strokesEventImage;
                    break;
            case 6123:  s1=getResources().getStringArray(R.array.Alfaaz_EVENT_TITLE);
                s2=getResources().getStringArray(R.array.Alfaaz_Event_Day);
                image=alfaazPastEvent;
                break;
            case 1221:
                s1=getResources().getStringArray(R.array.DummyEventName);
                s2=getResources().getStringArray(R.array.DummyEventFutureDay);
                image=DummyEventImage;
                break;
            case 1223:
            case 2123:
            case 5123:  s1=getResources().getStringArray(R.array.DummyEventName);
                s2=getResources().getStringArray(R.array.DummyEventPastDay);
                image=DummyEventImage;
                break;

            default:   NoEventStatus.setVisibility(View.VISIBLE);
                       recyclerView.setVisibility(View.GONE);
                         data_available=false;

        }

       // s1=getResources().getStringArray(R.array.Amtc_EVENT_TITLE);
        //s2=getResources().getStringArray(R.array.AMTC_Event_Day);
         if(data_available==true) {
             Amtc_UpEvent_Adapter UpEventAdapter = new Amtc_UpEvent_Adapter(this, s1, s2, image, Value);
             recyclerView.setAdapter(UpEventAdapter);
             recyclerView.setLayoutManager(new LinearLayoutManager(this));
         }
    }
}
