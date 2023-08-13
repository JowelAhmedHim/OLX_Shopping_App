package com.example.olx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.olx.databinding.ActivityLoginOptionBinding;

public class LoginOptionActivity extends AppCompatActivity {

    private ActivityLoginOptionBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginOptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.clearBtn.setOnClickListener(view -> {
           onBackPressed();
        });
    }
}