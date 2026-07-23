package domain;

public class ComparadorPorDuracao {
    public int compare(Midia m1, Midia m2){
        if (m1.getDuracao() < m2.getDuracao()){
            return -1;
        } else if (m1.getDuracao() > m2.getDuracao()) {
            return 1;
        } else {
            return 0;
        }
    }


}
