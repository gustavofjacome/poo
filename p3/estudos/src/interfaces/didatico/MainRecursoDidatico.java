package interfaces.didatico;

import java.util.ArrayList;
import java.util.List;

public class MainRecursoDidatico {
    public static void main(String[] args) {
        List<RecursoDidatico> recursos = new ArrayList<>();

        Slide s1 = new Slide("ihc", 150);
        Slide s2 = new Slide("pds", 12);
        Slide s3 = new Slide("ingles", 45);

        Video v1 = new Video("Apresentação Jogo", 360);
        Video v2 = new Video("Apresentação Jogo em ingles", 720);
        Video v3 = new Video("Apresentação IHC", 560);

        recursos.add(s1);
        recursos.add(s2);
        recursos.add(s3);
        recursos.add(v1);
        recursos.add(v2);
        recursos.add(v3);

        recursos.forEach(RecursoDidatico::exibir);

    }
}
