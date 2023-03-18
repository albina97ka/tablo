package com.example.tablo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer count1 = 0;
    private Integer count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count1", count1);
        outState.putInt("count2", count2);
    }
    protected void onRestoreInstanceState (Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        count1 = savedInstanceState.getInt("count1");
        count2 = savedInstanceState.getInt("count2");
        TextView counterView = findViewById(R.id.count1);
        TextView countView = findViewById(R.id.count2);
        counterView.setText(count1.toString());
        countView.setText(count2.toString());
    }
    public void onClickBtnAddfootball1(View view) {
        count1++;
        TextView counterView = findViewById(R.id.count1);
        counterView.setText(count1.toString());
    }
    public void onClickBtnAddfootball2(View view) {
        count2++;
        TextView countView = findViewById(R.id.count2);
        countView.setText(count2.toString());
    }
    public void onClickButtonClear(View view) {
        count1 = 0;
        count2 = 0;
        TextView counterView = findViewById(R.id.count1);
        TextView countView = findViewById(R.id.count2);
        counterView.setText(count1.toString());
        countView.setText(count2.toString());
    }
}