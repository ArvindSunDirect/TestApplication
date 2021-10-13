package com.example.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CustomViewHolder> {

    private Context context;
    List<DataPojo> pojos;
    String TAG = RecyclerAdapter.class.getSimpleName();

    public RecyclerAdapter(Context context, List<DataPojo> pojos) {
        this.context = context;
        this.pojos = pojos;

    }


    @NonNull
    @NotNull
    @Override
    public RecyclerAdapter.CustomViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_lay,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull RecyclerAdapter.CustomViewHolder holder, int position) {

        holder.idtxt.setText(String.valueOf(pojos.get(position).getRid()));
        holder.datetxt.setText(pojos.get(position).getFldDate().toString());
        holder.cridtxt.setText(pojos.get(position).getFldCrid().toString());
        holder.desctxt.setText(pojos.get(position).getFldDesc().toString());

    }

    @Override
    public int getItemCount() {
        return pojos.size();
    }



    public class CustomViewHolder extends RecyclerView.ViewHolder {

        TextView idtxt,datetxt,cridtxt,desctxt;

        public CustomViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            idtxt = itemView.findViewById(R.id.idval);
            datetxt = itemView.findViewById(R.id.date);
            cridtxt = itemView.findViewById(R.id.crid);
            desctxt = itemView.findViewById(R.id.desc);
        }
    }
}
