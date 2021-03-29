package com.hong_studio.numberbaseballgame;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.VH> {

    Context context;
    ArrayList<RecyclerItem> items;

    public RecyclerAdapter(Context context, ArrayList<RecyclerItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        VH vh= new VH(itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        VH vh= holder;
        RecyclerItem item= items.get(position);
        vh.tvNum1.setText(item.num1);
        vh.tvNum2.setText(item.num2);
        vh.tvNum3.setText(item.num3);
        vh.tvStrike.setText(item.strike);
        vh.tvBall.setText(item.ball);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class VH extends RecyclerView.ViewHolder{

        TextView tvNum1, tvNum2, tvNum3, tvStrike, tvBall;

        public VH(@NonNull View itemView) {
            super(itemView);

            tvNum1= itemView.findViewById(R.id.tv_num1);
            tvNum2= itemView.findViewById(R.id.tv_num2);
            tvNum3= itemView.findViewById(R.id.tv_num3);
            tvStrike= itemView.findViewById(R.id.tv_strike);
            tvBall= itemView.findViewById(R.id.tv_ball);
        }
    }
}
