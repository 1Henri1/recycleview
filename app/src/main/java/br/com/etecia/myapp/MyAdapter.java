package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mContexto;
    private List<Books> lstBooks;

    public MyAdapter(Context mContexto, List<Books> lstFilmes) {
        this.mContexto = mContexto;
        this.lstBooks = lstFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;

                LayoutInflater inflater = LayoutInflater.from(mContexto);
                view = inflater.inflate(R.layout.modelo_livros, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    holder.idTituloLivros.setText(lstBooks.get(position).getTitulo());
    holder.idGeneroLivros.setText(lstBooks.get(position).getGenero());
    holder.idAutorLivros.setText(lstBooks.get(position).getAutor());
    holder.idEditoraLivros.setText(lstBooks.get(position).getEditora());
    }

    @Override
    public int getItemCount() {
        return lstBooks.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView idTituloLivros, idEditoraLivros, idAutorLivros, idGeneroLivros;
        CardView idCardLivros;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        idTituloLivros = itemView.findViewById(R.id.Titulo);
        idEditoraLivros = itemView.findViewById(R.id.Editora);
        idAutorLivros = itemView.findViewById(R.id.Autor);
        idGeneroLivros = itemView.findViewById(R.id.Genero);
        idCardLivros = itemView.findViewById(R.id.idCardBooks);
        }
    }


}
