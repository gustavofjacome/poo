package ep.formaGeometrica;

public class Circulo extends Forma{
    private double raio;
    public static final double PI = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return PI * (getRaio() * getRaio());
    }

    @Override
    public double perimetro() {
        return 2 * PI * getRaio();
    }
}
