package Ex1;

import java.util.*;

public class Exercicio1 {

    public static void main(String[] args) {

        Map<Integer, String> loteriaDosSonhos = new HashMap<>();

        loteriaDosSonhos.put(0, "Ovos");
        loteriaDosSonhos.put(1, "Águia");
        loteriaDosSonhos.put(2, "Escopeta");
        loteriaDosSonhos.put(3, "Cavalo");
        loteriaDosSonhos.put(4, "Dentista");
        loteriaDosSonhos.put(5, "Fogo");

        Map<String, List<String>> apelidos = new HashMap<>();

        List<String> apelidosJoao = new ArrayList<>();
        apelidosJoao.add("Juan");
        apelidosJoao.add("Fissura");
        apelidosJoao.add("Maromba");
        List<String> apelidosMiguel = new ArrayList<>();
        apelidosMiguel.add("Night Watch");
        apelidosMiguel.add("Bruce Wayne");
        apelidosMiguel.add("Tampinha");
        List<String> apelidosMaria = new ArrayList<>();
        apelidosMaria.add("Wonder Woman");
        apelidosMaria.add("Mary");
        apelidosMaria.add("Marilene");
        List<String> apelidoLucas = new ArrayList<>();
        apelidoLucas.add("Lukinha");
        apelidoLucas.add("Jorge");
        apelidoLucas.add("George");

        apelidos.put("João", apelidosJoao);
        apelidos.put("Miguel", apelidosMiguel);
        apelidos.put("Maria", apelidosMaria);
        apelidos.put("Lucas", apelidoLucas);


        loteriaDosSonhos.forEach((key, value) -> System.out.println("Loteria: " + key + ", Significado: " + value));
        System.out.println("--------------------------");
        apelidos.forEach((k, v) -> System.out.println("Amigo: "+ k + ", Apelidos: " + v));
    }
}
