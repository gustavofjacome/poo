package ep.formaGeometrica;

public abstract class Forma implements Comparable<Forma>{

    public abstract double area();

    public abstract double perimetro();

    @Override
    public String toString() {
        return "Forma[Area=" + area() +
                ", Perimetro=" + perimetro() + "]";
    }

    @Override
    public int compareTo(Forma forma) {
        if (this.area() < forma.area()){
            return -1;
        } if (this.area() > forma.area()){
            return 1;
        }
        return 0;
    }

}
