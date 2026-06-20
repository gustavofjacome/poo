package ep.formaGeometrica;

import ep.formaGeometrica.Forma;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainFormas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Forma> formas = new ArrayList<>();

        while (true) {

            Forma forma = criarForma(sc);

            if (forma == null) {
                break;
            }

            formas.add(forma);
        }


        exibeAreaPerimetroTotal(formas);


        Collections.sort(formas);

        exibeTodos(formas);


        sc.close();
    }

    public static Forma criarForma(Scanner sc) {

        System.out.println("\nC = Circulo");
        System.out.println("R = Retangulo");
        System.out.println("S = Sair");
        System.out.print("Escolha: ");

        char opcao = Character.toUpperCase(sc.next().charAt(0));

        switch (opcao) {

            case 'C':
                System.out.print("Digite o raio: ");
                return new Circulo(sc.nextDouble());

            case 'R':
                System.out.print("Digite largura e altura: ");
                return new Retangulo(
                        sc.nextDouble(),
                        sc.nextDouble()
                );

            case 'S':
                return null;

            default:
                System.out.println("Opção inválida!");
                return criarForma(sc);
        }
    }

    public static void exibeAreaPerimetroTotal(List<Forma> lista){
        double acumuladorPerimetro = 0.0;
        double acumuladorArea = 0.0;
        for (Forma x : lista){
            acumuladorArea += x.area();
            acumuladorPerimetro += x.perimetro();
        }

        System.out.println("Area Total: " + acumuladorArea);
        System.out.println("Perímetro Total: " + acumuladorPerimetro);
    }

    public static void exibeTodos(List<Forma> lista){
        for (Forma x : lista) {
            System.out.println(x);
        }
    }


}