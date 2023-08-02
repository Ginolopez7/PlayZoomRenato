package com.gino.playzoom.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.gino.playzoom.R;
import com.gino.playzoom.databinding.FragmentHomeBinding;
import com.gino.playzoom.model.Movie;
import com.gino.playzoom.model.Series;
import com.gino.playzoom.model.Shows;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RVResumeAdapter adapter = new RVResumeAdapter(getData());
        binding.rvMoviesResume.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        binding.rvMoviesResume.setLayoutManager(layoutManager);
    }

    private List<Shows> getData() {
        List<Shows> shows = new ArrayList<>();
        shows.add(new Series("Euphoria","https://www.rockandpop.cl/wp-content/uploads/2020/09/7cb68f2e84e46a6c19926b40543820db-1.jpg",2));
        shows.add(new Series("Flash","https://film-book.com/wp-content/uploads/2016/09/the-flash-logo-01-600x350.jpg",3));
        shows.add(new Movie ("Avengers","https://source.superherostuff.com/wp-content/uploads/2018/05/1875_1_1867_1_header_moviepage_richbanner-id_c4a9424f.jpg","Infinity Wars"));
        shows.add(new Movie ("Mission Imposible ","https://cinema10.com.br/upload/upload/image/mission_impossible_ghost_protocol_ver5_xxlg.jpg","Protocolo Fantasma"));
        shows.add(new Series("Black Mirror","https://www.americatv.com.pe/cinescape/wp-content/uploads/2017/05/189068.jpg",5));
        shows.add(new Series("Arrow","https://cbwentworth.files.wordpress.com/2013/11/cw-arrow-green-arrow-banner.jpg?w=640",1));
        shows.add(new Movie ("Demonio Negro","https://media.zenfs.com/es/sandiegored_883/4226576292ec0098cd294a130d584475",""));

        return shows;
    }
}