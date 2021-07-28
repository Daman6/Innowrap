package com.example.innowrapassignment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{

    private List<PostItem> postItems;
    private Context context;

    public PostAdapter(List<PostItem> postItems, Context context) {
        this.postItems = postItems;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull PostAdapter.PostViewHolder holder, int position) {

        holder.setImg(postItems.get(position));
        holder.setTitle(postItems.get(position));

    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    class PostViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        ImageView img;

        public PostViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.titleTv);
            img = itemView.findViewById(R.id.imgIv);
        }

        void setImg(PostItem postItem){
            img.setImageResource(postItem.getImage());
        }

        void setTitle(PostItem postItem){
            title.setText(postItem.getTitle());
        }
    }
}
