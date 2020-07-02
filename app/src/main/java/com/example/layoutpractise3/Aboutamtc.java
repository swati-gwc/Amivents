package com.example.layoutpractise3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Aboutamtc extends AppCompatActivity {

    int Value;

    private TextView InfoTitle, AboutPara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutamtc);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            Value = bundle.getInt("value");
        }

        InfoTitle=findViewById(R.id.Infotitle);
        AboutPara=findViewById(R.id.txtpara);

        switch(Value)
        {
            case 11: InfoTitle.setText("ABOUT AMTC");
                    break;
            case 12: InfoTitle.setText("ABOUT ALIAS");
                AboutPara.setText(R.string.AliasMainAbout);
                break;

            case 21: InfoTitle.setText("ABOUT CEZZANE");
                AboutPara.setText("The official dance club of Aset");
                break;

            case 31: InfoTitle.setText("ABOUT DASP");
                     AboutPara.setText(R.string.aboutDasppage);
                    break;
            case 41:InfoTitle.setText("ABOUT STROKES");
                    AboutPara.setText(R.string.strokesaboutpara);
                    break;
            case 51:InfoTitle.setText("ABOUT AZMIE");
                AboutPara.setText("The official dramatics club of Aset");
                break;
            case 61:   InfoTitle.setText("ABOUT ALFAAZ");
                AboutPara.setText(R.string.aboutAlfaaz);
                break;
            default: InfoTitle.setText("About The Club");
                     AboutPara.setText("Sorry! No Information Available");
        }


    }
}
