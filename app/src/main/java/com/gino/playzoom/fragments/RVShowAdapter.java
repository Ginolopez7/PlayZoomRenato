package com.gino.playzoom.fragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gino.playzoom.databinding.ItemShowBinding;
import com.gino.playzoom.model.Shows;

import java.util.List;

public class RVShowAdapter extends RecyclerView.Adapter<RVShowAdapter.ShowViweHolder> {

    private List<Shows> shows;

    public RVShowAdapter(List<Shows> shows) {
        this.shows = shows;
    }

    @NonNull
    @Override
    public ShowViweHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemShowBinding binding = ItemShowBinding.inflate(LayoutInflater.from(parent.getContext()), parent,false);
        return new ShowViweHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowViweHolder holder, int position) {
        holder.bind(shows.get(position));

    }

    @Override
    public int getItemCount() {
        return shows.size();
    }

    public class ShowViweHolder extends RecyclerView.ViewHolder{

        private ItemShowBinding binding;

        public ShowViweHolder(@NonNull ItemShowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Shows show) {
            binding.txtName.setText(show.getName());
            Glide.with(itemView.getContext()).load(show.getImgUrl()).into(binding.imgShow);
        }
    }
}
