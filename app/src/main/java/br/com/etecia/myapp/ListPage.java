package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {

    List<Books> listaLivros;
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpage);

        idRecyclerView = findViewById(R.id.listaLivros);
        listaLivros = new ArrayList<>();
        listaLivros.add(new Books("Macaco", "Macumbeiraa", "macumbaiada", "Mandela"));

        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaLivros);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);
        idRecyclerView.setAdapter(adapter);
    }
}