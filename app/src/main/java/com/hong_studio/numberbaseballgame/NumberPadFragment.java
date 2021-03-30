package com.hong_studio.numberbaseballgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class NumberPadFragment extends Fragment {

    TextView numbers[]= new TextView[10];
    TextView tvDelete;
    TextView tvSend;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.number_pad_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //findViewById...
        for(int i=0; i<10; i++){
            numbers[i]= view.findViewById(R.id.number0+i);
        }
        tvDelete= view.findViewById(R.id.tv_delete);
        tvSend= view.findViewById(R.id.tv_send);

        setOnClickNumbers();

        tvSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).setOnClickSend();
            }
        });

        tvDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).tvBaseball1.setText("");
                ((MainActivity)getActivity()).tvBaseball2.setText("");
                ((MainActivity)getActivity()).tvBaseball3.setText("");

                ((MainActivity)getActivity()).baseball1_text= "";
                ((MainActivity)getActivity()).baseball2_text= "";
                ((MainActivity)getActivity()).baseball3_text= "";
            }
        });
    }


    private void setOnClickNumbers() {

        for(int i=0; i<10; i++){
            final int index= i;
            numbers[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(((MainActivity)getActivity()).baseball1_text.equals("")) {
                        ((MainActivity)getActivity()).tvBaseball1.setText(index+"");
                        ((MainActivity)getActivity()).baseball1_text= index+"";
                    } else if (((MainActivity)getActivity()).baseball2_text.equals("")){
                        ((MainActivity)getActivity()).tvBaseball2.setText(index+"");
                        ((MainActivity)getActivity()).baseball2_text= index+"";
                    } else if (((MainActivity)getActivity()).baseball3_text.equals("")){
                        ((MainActivity)getActivity()).tvBaseball3.setText(index+"");
                        ((MainActivity)getActivity()).baseball3_text= index+"";
                    }
                }
            });
        }

    }
}
