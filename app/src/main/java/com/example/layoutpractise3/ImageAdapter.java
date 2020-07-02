package com.example.layoutpractise3;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;

    int PhotoCode= AmtcPhoto.ReturnPhotoValue();

    //ALLOCATING PHOTOS TO RESPECTIVE CLUBS

    int[] amtcimage= {
            R.drawable.aimg1,R.drawable.aimg2,R.drawable.aimg3,R.drawable.aimg4,R.drawable.aimg5,
            R.drawable.aimg6,R.drawable.aimg7,R.drawable.aimg8, R.drawable.aimg9,R.drawable.aimg10
    };

    int [] aliasimage={
          R.drawable.alias_img1, R.drawable.alias_logo
    };

    int[] cezzaneimage={
            R.drawable.cimg1,R.drawable.cimg2,R.drawable.cimg3,R.drawable.cimg4,R.drawable.cimg5,
            R.drawable.cimg6,R.drawable.cimg7,R.drawable.cimg8,R.drawable.cimg9,R.drawable.cimg10,
            R.drawable.cimg11
    };

    int[] daspimage={
            R.drawable.dimg1,R.drawable.dimg2,R.drawable.dimg3,R.drawable.dimg4,
            R.drawable.deimg1
    };

    int[] stokesimage={
            R.drawable.simg1, R.drawable.simg2
    };

    int [] alfaazimage={
         R.drawable.alfz_img1,R.drawable.alfz_img2,R.drawable.alfz_img3,R.drawable.alfz_img4,
            R.drawable.alfz_img5,R.drawable.alfz_logo
    };

    int[] azmieimage={
              R.drawable.azmie_img1, R.drawable.azmie_img2, R.drawable.azmie_img3
    };
    //SELECTING APT PHOTO ARRAY FOR RESPECTIVE CLUB
    public int[] Choose()
    {
        int[] iA={ };
        switch(PhotoCode){
            case 11: iA= amtcimage; break;
            case 12: iA= aliasimage; break;
            case 21: iA=cezzaneimage; break;
            case 31: iA= daspimage; break;
            case 41: iA= stokesimage;break;
            case 51: iA=azmieimage; break;
            case 61: iA=alfaazimage; break;

        }
        return  iA;
    }

    public  int[] imageArray= Choose();

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView= new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(340, 340));
        return imageView;
    }
}
