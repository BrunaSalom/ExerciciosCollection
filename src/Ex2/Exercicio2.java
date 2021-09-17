package Ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercicio2 {

    public static void main(String[] args) {

        List<Integer> lista1 = new ArrayList<>();
        lista1.add(1);
        lista1.add(5);
        lista1.add(5);
        lista1.add(6);
        lista1.add(7);
        lista1.add(8);
        lista1.add(8);
        lista1.add(8);

        lista1.forEach(System.out::print);
        System.out.print("\n---------------\n");

        Set<Integer> lista2 = new HashSet<>();
        lista2.add(1);
        lista2.add(5);
        lista2.add(5);
        lista2.add(6);
        lista2.add(7);
        lista2.add(8);
        lista2.add(8);
        lista2.add(8);

        lista2.forEach(System.out::print);
        System.out.println("\n---------------\n");
    }
}
//A lista List aceita repetição de valores, então adiciona todos os números, enquanto o Set não aceita
//repetição, então só adiciona o número uma vez.
