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

    TextView number1,number2,number3,number4,number5,number6,number7,number8,number9,number0;
    TextView tvDelete;
//    TextView tvSend;
    String baseball1_text, baseball2_text, baseball3_text;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.number_pad_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //findViewById...
        number1= view.findViewById(R.id.number1); number2= view.findViewById(R.id.number2); number3= view.findViewById(R.id.number3);
        number4= view.findViewById(R.id.number4); number5= view.findViewById(R.id.number5); number6= view.findViewById(R.id.number6);
        number7= view.findViewById(R.id.number7); number8= view.findViewById(R.id.number8); number9= view.findViewById(R.id.number9);
        number0= view.findViewById(R.id.number0); tvDelete= view.findViewById(R.id.tv_delete);
//        tvSend= view.findViewById(R.id.tv_send);
        setOnClickNumbers();

        tvDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)getActivity().findViewById(R.id.tv_baseball1)).setText("");
                ((TextView)getActivity().findViewById(R.id.tv_baseball2)).setText("");
                ((TextView)getActivity().findViewById(R.id.tv_baseball3)).setText("");
            }
        });
    }


    private void setOnClickNumbers() {
        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("1");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("1");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("1");
            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("2");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("2");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("2");
            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("3");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("3");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("3");
            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("4");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("4");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("4");
            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("5");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("5");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("5");
            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("6");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("6");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("6");
            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("7");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("7");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("7");
            }
        });

        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("8");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("8");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("8");
            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("9");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("9");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("9");
            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                baseball1_text= ((TextView)getActivity().findViewById(R.id.tv_baseball1)).getText().toString();
                baseball2_text= ((TextView)getActivity().findViewById(R.id.tv_baseball2)).getText().toString();
                baseball3_text= ((TextView)getActivity().findViewById(R.id.tv_baseball3)).getText().toString();

                if(baseball1_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball1)).setText("0");
                else if(baseball2_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball2)).setText("0");
                else if(baseball3_text.equals("")) ((TextView) getActivity().findViewById(R.id.tv_baseball3)).setText("0");
            }
        });
    }
}
