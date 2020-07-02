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

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    String data1[], data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct, String s1[], String s2[], int img[] ) {

        context = ct;
        data1= s1;
        data2=s2;
        images=img;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater= LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.myText1.setText(data1[position]);
        holder.myText2.setText(data2[position]);
        holder.myImage.setImageResource(images[position]);

        holder.mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(context, Profile.class);
                it.putExtra("data1",data1[position]);
                it.putExtra("data2",data2[position]);
                it.putExtra("myImage",images[position]);
                context.startActivity(it);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView myText1, myText2;
        ImageView myImage;
        LinearLayout mainLayout;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            myText1=itemView.findViewById(R.id.title);
            myText2=itemView.findViewById(R.id.description);
            myImage=itemView.findViewById(R.id.profileimg);
            mainLayout=itemView.findViewById(R.id.parent_layout);
        }
    }
}
