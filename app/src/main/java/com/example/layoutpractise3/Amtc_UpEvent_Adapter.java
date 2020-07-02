package com.example.layoutpractise3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Amtc_UpEvent_Adapter extends RecyclerView.Adapter<Amtc_UpEvent_Adapter.MyViewHolder> {


    String edata1[], edata2[];
    int images[];
    int Value;
    Context context;

    public Amtc_UpEvent_Adapter(Context ct, String[] s1, String[] s2, int[] img, int Value) {
        context = ct;
        edata1= s1;
        edata2=s2;
        images=img;
        this.Value=Value;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View view1= inflater.inflate(R.layout.amtc_eventrow, parent, false);
        return new MyViewHolder(view1);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.eText1.setText(edata1[position]);
        holder.eText2.setText(edata2[position]);
        holder.eImage.setImageResource(images[position]);

        holder.emainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(context, AmtcUpEventsDisp.class);
                it.putExtra("data1",edata1[position]);
                it.putExtra("data2",edata2[position]);
                it.putExtra("myImage",images[position]);
                it.putExtra("position",position);
                it.putExtra("value",Value);
                context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return edata1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView eText1, eText2;
        ImageView eImage;
        LinearLayout emainLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            eText1=itemView.findViewById(R.id.eventtitle);
            eText2=itemView.findViewById(R.id.eventdaydate);
            eImage=itemView.findViewById(R.id.eventimg);
            emainLayout=itemView.findViewById(R.id.parent_1layout);
        }
    }
}
