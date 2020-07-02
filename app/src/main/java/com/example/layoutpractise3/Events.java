package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class Events extends AppCompatActivity {

    RecyclerView recyclerView;
    String s1[],s2[];
    int Value=1121;
    int image[]={};
    int amtcEventImage[]={
            R.drawable.event1, R.drawable.event2, R.drawable.event3,R.drawable.event4,
            R.drawable.event5, R.drawable.event6, R.drawable.event7, R.drawable.event8,
            R.drawable.event9,R.drawable.event10
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        s1=getResources().getStringArray(R.array.Amtc_EVENT_TITLE);
        s2=getResources().getStringArray(R.array.AMTC_Event_Day);
        recyclerView=findViewById(R.id.evt_recycleview);
       image=amtcEventImage;
        Amtc_UpEvent_Adapter UpEventAdapter = new Amtc_UpEvent_Adapter(this, s1, s2, image, Value);
        recyclerView.setAdapter(UpEventAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
