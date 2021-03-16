package com.example.win7.goodgood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn1(View v) {
        Intent apasi = new Intent(Main.this, card1.class);
        startActivity(apasi);

    }

    public void btn2(View v) {
        Intent apasi = new Intent(Main.this, card2.class);
        startActivity(apasi);

    }
    public void btn3(View v) {
        Intent apasi = new Intent(Main.this, card3.class);
        startActivity(apasi);

    }
    public void btn4(View v) {
        Intent apasi = new Intent(Main.this, card4.class);
        startActivity(apasi);

    }

    public void btn5(View v) {
        Intent apasi = new Intent(Main.this, card5.class);
        startActivity(apasi);

    }
}
