package model;

import domain.Exportavel;
import domain.Midia;
import domain.Reproduzivel;

public class Podcast extends Midia implements Reproduzivel, Exportavel {
    private int episodio;
    private String descricao;

    public Podcast(String titulo, String artista, int duracao, int episodio, String descricao) {
        super(titulo, artista, duracao);
        this.episodio = episodio;
        this.descricao = descricao;
    }

    public int getEpisodio() {
        return episodio;
    }

    public void setEpisodio(int episodio) {
        this.episodio = episodio;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int getDuracao() {
        return super.getDuracao();
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo: " + getTitulo());
    }

    @Override
    public void pausar() {
        System.out.println("Pausado: " + getTitulo() + " -> " + getDuracao());
    }

    @Override
    public String exportar(String formato) {
        return getTitulo() + " | " + getEpisodio();
    }

    @Override
    public String toString() {
        return "Podcast{" +
                "episodio=" + episodio +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
