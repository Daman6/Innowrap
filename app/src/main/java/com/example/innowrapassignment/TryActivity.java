package com.example.innowrapassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.View;

import com.example.innowrapassignment.databinding.ActivityTryBinding;

import java.util.ArrayList;
import java.util.List;

public class TryActivity extends AppCompatActivity {

    ActivityTryBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_try);

        binding = ActivityTryBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.postsRecyclerViewtry.setLayoutManager(
                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        );

        //here im preparing the list from drawable

        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem("Reagale",R.drawable.image1));
        postItems.add(new PostItem("Sergio",R.drawable.image2));
        postItems.add(new PostItem("Reagale",R.drawable.image3));
        postItems.add(new PostItem("How to use amazon smile and give as you live",R.drawable.image4));
        postItems.add(new PostItem("Thank you",R.drawable.image5));postItems.add(new PostItem("Reagale",R.drawable.image1));
        postItems.add(new PostItem("Sergio",R.drawable.image2));
        postItems.add(new PostItem("Reagale",R.drawable.image3));
        postItems.add(new PostItem("How to use amazon smile and give as you live",R.drawable.image4));
        postItems.add(new PostItem("Thank you",R.drawable.image5));

        binding.postsRecyclerViewtry.setAdapter(new PostAdapter(postItems,this));
    }
}