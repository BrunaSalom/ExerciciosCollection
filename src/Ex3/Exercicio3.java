package Ex3;

import java.util.HashSet;
import java.util.Set;

public class Exercicio3 {

    public static void main(String[] args) {

    Set<Integer> valores = new HashSet<>();
    valores.add(1);
    valores.add(2);
    valores.add(3);
    valores.add(4);
    valores.add(5);

    int soma=0;
    for(Integer valor: valores){
        soma+=valor;
    }

        System.out.println(valores);
        System.out.println(soma);
    }
}
