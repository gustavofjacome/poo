package model;
import domain.Exportavel;
import domain.Midia;
import domain.Reproduzivel;

public class Musica extends Midia implements Reproduzivel, Exportavel {
    private String genero;

    public Musica(String titulo, String artista, int duracao, String genero) {
        super(titulo, artista, duracao);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }



    public void reproduzir(){
        System.out.println("Ouvindo: " + getTitulo());
    }

    public void pausar(){
        System.out.println("Pausado: " + getTitulo() + " -> " + getDuracao());
    }

    @Override
    public int getDuracao() {
        return super.getDuracao(); // TODO: conferir se está certo
    }

    @Override
    public String toString() {
        return "Musica{" +
                "genero='" + genero + '\'' +
                '}';
    }

    @Override
    public String exportar(String formato) {
        return getTitulo() + " | " + getDuracao();
    }
}
