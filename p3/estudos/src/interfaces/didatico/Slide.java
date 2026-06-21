package interfaces.didatico;

public class Slide implements RecursoDidatico{
    private String titulo;
    private int numeroPaginas;

    public Slide(String titulo, int numeroPaginas) {
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Slide{" +
                "titulo='" + titulo + '\'' +
                '}';
    }

    @Override
    public String titulo() {
        return getTitulo();
    }

    @Override
    public void exibir() {
        System.out.println("|" + titulo + "|" + numeroPaginas + "|");
    }
}
