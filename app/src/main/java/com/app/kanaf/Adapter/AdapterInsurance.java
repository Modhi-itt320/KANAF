package com.app.kanaf.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.kanaf.Modle.Associations;
import com.app.kanaf.Modle.Insurance;
import com.app.kanaf.R;

import java.util.List;


public class AdapterInsurance extends RecyclerView.Adapter<AdapterInsurance.ViewHolder> {

    Context context;
    List<Insurance> list;

    public AdapterInsurance(Context context, List<Insurance> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_insurance, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int p) {
        Insurance data = list.get(p);

        holder.tv_txt1.setText(data.getTxt1());
        holder.tv_txt2.setText(data.getTxt2());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_txt1, tv_txt2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_txt1 = itemView.findViewById(R.id.tv_txt1);
            tv_txt2 = itemView.findViewById(R.id.tv_txt2);

        }
    }

}