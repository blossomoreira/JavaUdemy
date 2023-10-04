package javaUdemy.ArraysListas.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class introducao {
    /*
     * Homogeneaa (mesmo tipo)
     * Ordenada (acessados por meio de posições)
     * inicia vazia
     * cada elemento ocupa um "nó" da lista 
     */
     /*Lista de números inteiros */
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(); /*A lista não aceita tipos primitivos como: int, double etc. */
        /* Implementando a interface ArrayList que junta lista e vetores */
        lista.add("maria");
        lista.add("joao");
        lista.add(2,"marcos"); /*Colocando um elemnto em uma posição */
        /* lista.remove(); pode colocar o nome do obj também */
        lista.removeIf(x -> x.charAt(0) == 'x'); /*função lambda predicado */
        lista.indexOf("socorro1"); /*quando não acha retorna -1 */
        System.out.println();
        System.out.println(lista.size());
        for (String obj : lista){
            System.out.println(obj);
        }
        List<String> result = lista.stream().filter(x -> x.charAt(0) == 'm').collect(Collectors.toList());
        for (String n : lista){
        System.out.println(result);
        System.out.println("---------------------");
        String name = lista.stream().filter(x -> x.charAt(0) == 'm').findFirst().orElse(null);
        System.out.println(name);
        System.out.println("----------------------");
        }    
    }
}