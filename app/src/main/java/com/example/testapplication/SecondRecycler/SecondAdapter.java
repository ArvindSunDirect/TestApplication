package com.example.testapplication.SecondRecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testapplication.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SecondAdapter extends RecyclerView.Adapter<SecondAdapter.TestViewHolder> {

    private Context context;
    private List<Source> mData;

    public SecondAdapter(Context context, List<Source> mData) {
        this.context = context;
        this.mData = mData;
    }


    @NonNull
    @NotNull
    @Override
    public SecondAdapter.TestViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_second_adapter,parent,false);
        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull SecondAdapter.TestViewHolder holder, int position) {

        Annotations annotations = mData.get(position).getAnnotations();

        holder.mode.setText(mData.get(position).getName());
        holder.amt.setText(annotations.getTopic());
        holder.date.setText(annotations.getSourceDescription());
        holder.mid.setText(String.valueOf(annotations.getSourceName()));
        holder.trasnID.setText(String.valueOf(annotations.getSubtopic()));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class TestViewHolder extends RecyclerView.ViewHolder {

        TextView mode,amt,date,mid,trasnID;

        public TestViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            mode = itemView.findViewById(R.id.mode);
            amt = itemView.findViewById(R.id.amount);
            date = itemView.findViewById(R.id.date);
            mid = itemView.findViewById(R.id.id);
            trasnID = itemView.findViewById(R.id.transid);

        }
    }
}
