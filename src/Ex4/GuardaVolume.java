package Ex4;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaVolume {

    private Map<Integer, List<Peca>> dicionario = new HashMap<>();
    private Integer contador = 1;

    public Integer guardarPecas(List<Peca> listaDePecas) {
        int identificador = contador;
        dicionario.put(identificador, listaDePecas);
        contador += 1;
        System.out.println("--------------------------------------------");
        System.out.println("Suas peças foram guardadas na chave " + identificador);
        System.out.println("--------------------------------------------");
        return identificador;
    }

    public void mostrarPecas() {
        System.out.println("--------------------------------------------");
        for (Integer chave : dicionario.keySet()) {
            mostrarPecas(chave);
            System.out.println("----");
        }
        System.out.println("--------------------------------------------");
    }

    public void mostrarPecas(Integer numeroDaPeca) {
        List<Peca> pecasDaChave = dicionario.get(numeroDaPeca);
        System.out.println("Chave: " + numeroDaPeca);
        for (Peca peca : pecasDaChave) {
            System.out.println(peca);
        }
    }

    public void devolverPecas(Integer numeroDaPeca) {
        System.out.println("--------------------------------------------");
        mostrarPecas(numeroDaPeca);
        System.out.println("Foram removidas do guarda-volumes!");
        System.out.println("--------------------------------------------");
        dicionario.remove(numeroDaPeca);
    }
}
