package model;

import domain.Exportavel;
import domain.Midia;
import domain.Reproduzivel;

public class AudioLivro extends Midia implements Reproduzivel, Exportavel {
    String autor;
    int capitulo;

    public AudioLivro(String titulo, String artista, int duracao, String autor, int capitulo) {
        super(titulo, artista, duracao);
        this.autor = autor;
        this.capitulo = capitulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(int capitulo) {
        this.capitulo = capitulo;
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo Ebook: " + getTitulo() + '\n');
    }

    @Override
    public void pausar() {
        System.out.println("Ebook pausado: " + getTitulo() + '\n');
    }

    @Override
    public String exportar(String formato) {
        return "Ebook: " + getTitulo() + '\n'
                + "Duracao: " + getDuracao() + '\n'
                + "Detalhes: " + getAutor() + " | " + getCapitulo();
    }
}
