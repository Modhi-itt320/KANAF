package com.app.kanaf.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.kanaf.Modle.Associations;
import com.app.kanaf.R;

import java.util.List;


public class AdapterAssociations extends RecyclerView.Adapter<AdapterAssociations.ViewHolder> {

    Context context;
    List<Associations> list;

    public AdapterAssociations(Context context, List<Associations> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_all_associations, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int p) {
        Associations data = list.get(p);

        holder.tv_association_name.setText(data.getAssociation_name());
        holder.tv_address_name.setText(data.getAddress_name());
        holder.tv_license_number.setText(data.getLicense_number());
        holder.tv_type_activity.setText(data.getType_activity());



    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_association_name , tv_address_name , tv_license_number , tv_type_activity;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_association_name = itemView.findViewById(R.id.tv_association_name);
            tv_address_name = itemView.findViewById(R.id.tv_address_name);
            tv_license_number = itemView.findViewById(R.id.tv_license_number);
            tv_type_activity = itemView.findViewById(R.id.tv_type_activity);

        }
    }

}