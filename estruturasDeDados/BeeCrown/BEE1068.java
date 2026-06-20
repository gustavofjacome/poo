import java.util.*;
import java.util.ArrayList;

public class BEE1068 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> expressao = new ArrayList<>();
        String N;

        for (int i = 0; i < 100000; i++) {
            N = sc.nextLine();
            expressao.add(N);
        }


    }

    public static void verificaParentese(List<String> equacao){
        Map<String, Integer> contaOcorrencia = new HashMap<>();

        for (String x : equacao){
            for (int i = 0; i < x.length(); i++) {
                contaOcorrencia.put(x.charAt(i),contaOcorrencia.getOrDefault(contaOcorrencia,0)+1);
            }
        }


    }

}
