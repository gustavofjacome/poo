package resumoBiblioteca;

import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    List<Material> materiais;

    public void adicionar(Material material){
        materiais.add(material);
    }

    public void listar(){
        materiais.forEach(System.out::println);
    }

    public void ordenarPorTitulo(){
        materiais = materiais.stream().sorted(Comparator.comparing(Material::getTitulo)).toList();
    }

    public void ordenaPorAno(){
        materiais = materiais.stream().sorted(Comparator.comparing(Material::getAno)).toList();
    }



}
