package com.example.materialdesigndemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button t_tab;
private Button t_recycler;
private Button t_naviga;
private Button t_coordinator;
private Button t_notifica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.tool_bar);
        toolbar.setTitle("Material Design控件使用");
        setSupportActionBar(toolbar);


        t_recycler = findViewById(R.id.recycler);
        t_recycler.setOnClickListener(this);
        t_tab = findViewById(R.id.tab);
        t_tab.setOnClickListener(this);
        t_naviga = findViewById(R.id.naviga);
        t_naviga.setOnClickListener(this);
        t_coordinator = findViewById(R.id.coordinator);
        t_coordinator.setOnClickListener(this);
        t_notifica = findViewById(R.id.notifica);
        t_notifica.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.recycler:
                Intent intent = new Intent(MainActivity.this,RecyclerViewActivity.class);
                startActivity(intent);
                break;
            case R.id.tab:
                intent = new Intent(MainActivity.this, TabLayoutActivity.class);
                startActivity(intent);
                break;
            case R.id.naviga:
                intent = new Intent(MainActivity.this, NavigaActivity.class);
                startActivity(intent);
                break;
            case R.id.coordinator:
                 intent = new Intent(MainActivity.this,CoordnatorActivity.class);
                startActivity(intent);
                break;
            case R.id.notifica:
                intent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(intent);
                break;

        }
    }
}
