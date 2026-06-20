package ep.formaGeometrica;

public class Retangulo extends Forma{
    private double largula;
    private double altura;

    public Retangulo(double largula, double altura) {
        this.largula = largula;
        this.altura = altura;
    }

    public double getLargula() {
        return largula;
    }

    public void setLargula(double largula) {
        this.largula = largula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return getAltura() * getLargula();
    }

    @Override
    public double perimetro() {
        return 2 * (getAltura() + getLargula());
    }
}
