package com.hong_studio.numberbaseballgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;
    TextView tvBaseball1, tvBaseball2, tvBaseball3;
    String baseball1_text, baseball2_text, baseball3_text;
    int answer1, answer2, answer3;

    ArrayList<RecyclerItem> items= new ArrayList<>();
    RecyclerView recyclerView;
    RecyclerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction tran= getSupportFragmentManager().beginTransaction();
        fragment= new NumberPadFragment();
        tran.add(R.id.numberPad_container, fragment);
        tran.commit();

        tvBaseball1= findViewById(R.id.tv_baseball1);
        tvBaseball2= findViewById(R.id.tv_baseball2);
        tvBaseball3= findViewById(R.id.tv_baseball3);

        baseball1_text= tvBaseball1.getText().toString();
        baseball2_text= tvBaseball2.getText().toString();
        baseball3_text= tvBaseball3.getText().toString();

        recyclerView= findViewById(R.id.recyclerView);
        adapter= new RecyclerAdapter(this, items);
        recyclerView.setAdapter(adapter);

        do {
            answer1= new Random().nextInt(9);
            answer2= new Random().nextInt(9);
            answer3= new Random().nextInt(9);
        } while(answer1==answer2 || answer2==answer3 || answer3==answer1);

    }

    void setOnClickSend(){
        if(baseball1_text.equals("") || baseball2_text.equals("") || baseball3_text.equals(""))
            Toast.makeText(MainActivity.this, "숫자를 3개 넣어주세요!!", Toast.LENGTH_SHORT).show();
        else {
            int num1= Integer.parseInt(baseball1_text);
            int num2= Integer.parseInt(baseball2_text);
            int num3= Integer.parseInt(baseball3_text);

            int strike=0, ball=0;

            if(num1==answer1) strike++;
            else if(num1==answer2 || num1==answer3) ball++;

            if(num2==answer2) strike++;
            else if(num2==answer1 || num2==answer3) ball++;

            if(num3==answer3) strike++;
            else if(num3==answer1 || num3==answer2) ball++;

            if(strike==3) {
                startActivity(new Intent(MainActivity.this, WinActivity.class));
                finish();
            }

            items.add(new RecyclerItem(baseball1_text, baseball2_text, baseball3_text, "S"+String.valueOf(strike), "B"+String.valueOf(ball)));
            adapter.notifyItemInserted(items.size()-1);
            recyclerView.setAdapter(adapter);

            tvBaseball1.setText("");
            tvBaseball2.setText("");
            tvBaseball3.setText("");
            baseball1_text= "";
            baseball2_text= "";
            baseball3_text= "";

            if(items.size()>=10 && !(strike==3)){
                startActivity(new Intent(MainActivity.this, LoseActivity.class));
                finish();
            }
        }
    }
}