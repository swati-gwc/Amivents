package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class AmtcPhoto extends AppCompatActivity {

    GridView gridView;
    int photovalue;
    static int m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amtc_photo);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            photovalue = bundle.getInt("value");
        }

        getPhotoValue(photovalue);

        gridView=findViewById(R.id.grid_view);

        gridView.setAdapter(new ImageAdapter(this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(getApplicationContext(), Picview.class);
                intent.putExtra("id", position);
                intent.putExtra("value",photovalue);
                startActivity(intent);

            }
        });
    }

    static void getPhotoValue(int x)
    {
        m=x;
    }
    public  static int ReturnPhotoValue()
    {
        return m;
    }
}
