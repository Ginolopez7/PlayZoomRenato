package com.gino.playzoom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.gino.playzoom.databinding.ActivityPrincipalBinding;
import com.google.android.material.snackbar.Snackbar;

public class PrincipalActivity extends AppCompatActivity {

    private ActivityPrincipalBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPrincipalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.fabAddMovie.setOnClickListener(v -> {
            Snackbar.make(binding.getRoot(), "Add a movie", Snackbar.LENGTH_SHORT).show();
        });
        binding.tbPlayzoom.setTitle("Bienvenido(a) Gino");
        setSupportActionBar(binding.tbPlayzoom);
    }
}