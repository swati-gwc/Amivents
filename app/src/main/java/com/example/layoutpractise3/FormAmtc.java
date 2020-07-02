package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormAmtc extends AppCompatActivity {

    int Value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_amtc);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        final EditText edit1=findViewById(R.id.edit1);
        final EditText edit2=findViewById(R.id.edit2);
        final EditText edit3=findViewById(R.id.edit3);
        final EditText edit4=findViewById(R.id.edit4);
        final EditText edit5=findViewById(R.id.edit5);
        final EditText edit6=findViewById(R.id.edit6);
        final EditText edit7=findViewById(R.id.edit7);
        final TextView title=findViewById(R.id.heading);
        Button btn=findViewById(R.id.button);


        switch(Value)
        {
            case 11:  title.setText("AMTC MEMBERSHIP FORM");
                    break;
            case 12: title.setText("ALIAS MEMBERSHIP FORM");
                    break;
            case 21:  title.setText("CEZZANE MEMBERSHIP FORM");
                edit6.setHint("Classical, Western, Free-Style Dance, etc");
                break;
            case 31: title.setText("DASP REGISTRATION FORM");
                edit6.setHint("Vocal,Guitar,Tabla, etc");
                   break;
            case 41:  title.setText("STROKES MEMBERSHIP FORM");
                       edit6.setHint("Doodle, portrait, watercolor, etc");
                    break;
            case 51:  title.setText("AZMIE MEMBERSHIP FORM");
                edit6.setHint("plays, etc");
                break;
            case 61:  title.setText("ALFAAZ MEMBERSHIP FORM");
                edit6.setHint("Writing, Debate, etc");
                break;
        }

        //  final String To= "swatitripathi2000@gmail.com";
        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("IntentReset")
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_SENDTO);
                i.setType("message/html");

                i.setData(Uri.parse("mailto:"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[] { "swatitripathi2000@gmail.com" });
                //i.putExtra(Intent.EXTRA_EMAIL, To);
                i.putExtra(Intent.EXTRA_SUBJECT, "FORM SUBMISSION TO JOIN CLUB");
                i.putExtra(Intent.EXTRA_TEXT, "FORM TO JOIN AMTC CLUB:\n\n"+"\nFullName: "+ edit1.getText()+
                        "\n Class & Section: "+edit2.getText()+
                        "\nRollNo: "+edit3.getText()+
                        "\nCourse: "+edit4.getText()+
                        "\nBatch: "+edit5.getText()+
                        "\nMy Skills: "+edit6.getText()+
                        "\nReason To Join:  "+edit7.getText());
                try{
                    startActivity(Intent.createChooser(i,"Please Select Email"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(FormAmtc.this, "There is no Email clients", Toast.LENGTH_SHORT).show();
                }
                finish();

            }
        });

    }
}
