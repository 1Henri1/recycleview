package br.com.etecia.myapp;

public class Filmes {

    private String titulo, descricao, categoria;
    private int image;

    // criar o construtor com parametros alt+insert


    public Filmes(String titulo, String descricao, String categoria, int image) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.image = image;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
