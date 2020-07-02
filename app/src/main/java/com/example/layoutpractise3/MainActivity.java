package com.example.layoutpractise3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private Button Tech;
    private Button Dance;
    private Button Drama;
    private Button Art;
    private Button Literary;
    private Button Music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawerLayout=findViewById(R.id.drawer);
        mToggle= new ActionBarDrawerToggle(MainActivity.this, mDrawerLayout,R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=findViewById(R.id.navigview);
       navigationView.setNavigationItemSelectedListener(this);

        Tech=findViewById(R.id.tech);
        Dance=findViewById(R.id.dance);
        Drama=findViewById(R.id.drama);
        Art=findViewById(R.id.art);
        Literary=findViewById(R.id.literary);
        Music=findViewById(R.id.music);

        Tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii= new Intent(MainActivity.this, tech.class);
                //NOTE just below line
                ii.putExtra("value",1);
                startActivity(ii);
            }
        });

        //NOTE BELOW FUNCTION
        Art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(MainActivity.this, tech.class);
                ia.putExtra("value",4);
                startActivity(ia);

            }
        });

        Music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(MainActivity.this, tech.class);
                ia.putExtra("value",3);
                startActivity(ia);
            }
        });

        Dance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(MainActivity.this, tech.class);
                ia.putExtra("value",2);
                startActivity(ia);
            }
        });
        Drama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(MainActivity.this, tech.class);
                ia.putExtra("value",5);
                startActivity(ia);
            }
        });

        Literary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ia=new Intent(MainActivity.this, tech.class);
                ia.putExtra("value",6);
                startActivity(ia);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(mToggle.onOptionsItemSelected(item))
        {
            return  true;
        }
        else
        {
            return super.onOptionsItemSelected(item);
        }

    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        switch (id)
        {
            case R.id.home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new society()).commit();

                Toast.makeText(this, "Welcome To Society Page", Toast.LENGTH_SHORT).show();
                break;
            case R.id.setting:  Toast.makeText(this, "Events Page", Toast.LENGTH_SHORT).show();
                   Intent i =new Intent(MainActivity.this, Events.class);
                   startActivity(i);
               // getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new events()).commit();
                break;

            case  R.id.logout: Toast.makeText(this, "About Us!!", Toast.LENGTH_SHORT).show();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new aboutus()).commit();
                break;
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);

        return false;
    }

    @Override
    public void onBackPressed() {
        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

}
