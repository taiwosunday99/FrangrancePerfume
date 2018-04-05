package com.example.tboy.frangranceperfume;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PerfumeAdapter extends RecyclerView.Adapter<PerfumeAdapter.PerfumeViewHolder> {

    private Context mCtx;
    private List<Perfume> PerfumeList;

    public PerfumeAdapter(Context mCtx, List<Perfume> perfumeList) {
        this.mCtx = mCtx;
        PerfumeList = perfumeList;
    }

    @NonNull
    @Override
    public PerfumeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, parent, false);
        PerfumeViewHolder holder = new PerfumeViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PerfumeViewHolder holder, int position) {

        Perfume perfume = PerfumeList.get(position);
        holder.textViewTitle.setText(perfume.getTitle());
        holder.textViewName.setText(perfume.getName());
        holder.textViewType.setText(perfume.getType());
        holder.textViewSize.setText(perfume.getSize());
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(perfume.getImage()));

    }

    @Override
    public int getItemCount() {
        return PerfumeList.size();
    }

    class PerfumeViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewTitle, textViewName, textViewType, textViewSize;

        public PerfumeViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById((R.id.imageView));
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewType = itemView.findViewById(R.id.textViewType);
            textViewSize = itemView.findViewById(R.id.textViewSize);
        }
    }
}
