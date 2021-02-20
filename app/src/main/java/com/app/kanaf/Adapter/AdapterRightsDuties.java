package com.app.kanaf.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.kanaf.Modle.Associations;
import com.app.kanaf.Modle.RightsDuties;
import com.app.kanaf.R;

import java.util.List;


public class AdapterRightsDuties extends RecyclerView.Adapter<AdapterRightsDuties.ViewHolder> {

    Context context;
    List<RightsDuties> list;

    public AdapterRightsDuties(Context context, List<RightsDuties> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_rights_duties, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int p) {
        RightsDuties data = list.get(p);

        holder.tv_rights_duties.setText(data.getRights_duties());




    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_rights_duties   ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_rights_duties = itemView.findViewById(R.id.tv_rights_duties);


        }
    }

}