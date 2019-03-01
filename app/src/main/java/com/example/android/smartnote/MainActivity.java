package com.example.android.smartnote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.smartnote.Notes.ChmOneOne;
import com.example.android.smartnote.Notes.ChmOneTwo;
import com.example.android.smartnote.Notes.CscTwo;
import com.example.android.smartnote.Notes.MthOneOne;
import com.example.android.smartnote.Notes.MthOneTwo;
import com.example.android.smartnote.Notes.MthTwoOne;
import com.example.android.smartnote.Notes.MthTwoTwo;
import com.example.android.smartnote.Notes.PhyOneOne;
import com.example.android.smartnote.Notes.PhyOneTwo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        openChm101Note();
        openChm102Note();
        openPhy101Note();
        openPhy102Note();
        openMth101Note();
        openMth102Note();
        openMth201Note();
        openMth202Note();
        openCsc201Note();
    }

    public void openChm101Note(){

        TextView chm101Note = findViewById(R.id.chm101);

        chm101Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewChm101 = new Intent(MainActivity.this, ChmOneOne.class);
                startActivity(viewChm101);
            }
        });
    }

    public void openChm102Note(){
        TextView chm102Note = findViewById(R.id.chm102);

        chm102Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viewChm102 = new Intent(MainActivity.this, ChmOneTwo.class);
                startActivity(viewChm102);
            }
        });
    }

    public void openPhy101Note(){
        TextView phy101Note = findViewById(R.id.phy101);

        phy101Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy101 = new Intent(MainActivity.this, PhyOneOne.class);
                startActivity(phy101);
            }
        });
    }

    public void openPhy102Note(){
        TextView phy102Note = findViewById(R.id.phy102);

        phy102Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phy102 = new Intent(MainActivity.this, PhyOneTwo.class);
                startActivity(phy102);
            }
        });
    }

    public void openMth101Note(){
        TextView mth101Note = findViewById(R.id.mth101);

        mth101Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mth101 = new Intent(MainActivity.this, MthOneOne.class);
                startActivity(mth101);
            }
        });
    }

    public void openMth102Note(){
        TextView mth102Note = findViewById(R.id.mth102);

        mth102Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mth102 = new Intent(MainActivity.this, MthOneTwo.class);
                startActivity(mth102);
            }
        });
    }

    public void openMth201Note(){
        TextView mth201Note =  findViewById(R.id.mth201);

        mth201Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mth201 =  new Intent(MainActivity.this, MthTwoOne.class);
                startActivity(mth201);
            }
        });
    }

    public void openMth202Note(){
        TextView mth202Note = findViewById(R.id.mth202);

        mth202Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mth202 = new Intent(MainActivity.this, MthTwoTwo.class);
                startActivity(mth202);
            }
        });
    }

    public void openCsc201Note(){
        TextView csc201Note = findViewById(R.id.csc201);

        csc201Note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent csc201 = new Intent(MainActivity.this, CscTwo.class);
                startActivity(csc201);
            }
        });
    }
}
