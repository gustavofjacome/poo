package interfaces.didatico;

public class Video implements RecursoDidatico{
    private String titulo;
    private int duracao;

    public Video(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Video{" +
                "titulo='" + titulo + '\'' +
                ", duracao=" + duracao +
                '}';
    }

    @Override
    public String titulo() {
        return titulo;
    }

    @Override
    public void exibir() {
        System.out.println("|" + titulo + "|" + duracao + "|");
    }
}
