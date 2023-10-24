package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ListPage extends AppCompatActivity {

    List<Filmes> listaFilmes;
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listpage);

        idRecyclerView = findViewById(R.id.listaFilmes);
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.apocalipe));
        listaFilmes.add(
                new Filmes("Desejos",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.desejos));
        listaFilmes.add(
                new Filmes("Dois e Sessenta e Sete",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.doismilesessetnaesete));
        listaFilmes.add(
                new Filmes("Folha",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.folha));
        listaFilmes.add(
                new Filmes("Interrogação",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.interrogacao));
        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.medo));
        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.menina));
        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.pontabala));
        listaFilmes.add(
                new Filmes("Apocalipse",
                        "Fim do mundo uhull",
                        "action",
                        R.drawable.rei_montanha));


        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        idRecyclerView.setLayoutManager(new
                GridLayoutManager(
                getApplicationContext(), 2));

        idRecyclerView.setHasFixedSize(true);
        idRecyclerView.setAdapter(adapter);
    }
}