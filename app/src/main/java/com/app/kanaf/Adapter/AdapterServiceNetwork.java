package com.app.kanaf.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.kanaf.MapsActivity;
import com.app.kanaf.Modle.RightsDuties;
import com.app.kanaf.Modle.Service;
import com.app.kanaf.R;

import java.util.List;


public class AdapterServiceNetwork extends RecyclerView.Adapter<AdapterServiceNetwork.ViewHolder> {

    Context context;
    List<Service> list;

    public AdapterServiceNetwork(Context context, List<Service> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_service_network, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int p) {
        Service data = list.get(p);

        holder.tv_service_network.setText(data.getName_Service());

        holder.image_location.setOnClickListener(view -> {

            Intent i = new Intent(context , MapsActivity.class);
            i.putExtra("name", data.getName_Service());
            i.putExtra("lat", data.getLat());
            i.putExtra("lng", data.getLng());
            context.startActivity(i);

        });





    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv_service_network   ;
        ImageView image_location ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_service_network = itemView.findViewById(R.id.tv_service_network);
            image_location = itemView.findViewById(R.id.image_location);


        }
    }

}