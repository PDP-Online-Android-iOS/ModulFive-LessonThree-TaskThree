package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Img;

public class ImgAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final List<Img> imgList;

    public ImgAdapter(List<Img> imgList) {
        this.imgList = imgList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Img img = imgList.get(position);

        if (holder instanceof ItemViewHolder) {
            ((ItemViewHolder) holder).img.setImageResource(img.getImg());
        }
    }

    @Override
    public int getItemCount() {
        return imgList.size();
    }

    private static class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView img;

        public ItemViewHolder(View view) {
            super(view);

            img = view.findViewById(R.id.img);
        }
    }
}
