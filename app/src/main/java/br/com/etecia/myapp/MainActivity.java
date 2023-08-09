package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.listaFilmes);
        listaFilmes = new ArrayList<>();

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                        getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);
        idRecyclerView.setAdapter(adapter);
    }
}