package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio4 {

    public static void main(String[] args) {

        List<Peca> lista1 = new ArrayList<>();
        Peca peca1 = new Peca("Hering", "camiseta");
        Peca peca2 = new Peca("Hering", "saia");
        lista1.add(peca1);
        lista1.add(peca2);
        List<Peca> lista2 = new ArrayList<>();
        Peca peca3 = new Peca("Squalle", "vestido");
        Peca peca4 = new Peca("Squalle", "chapéu");
        lista2.add(peca3);
        lista2.add(peca4);


        GuardaVolume gVolume1 = new GuardaVolume();

        gVolume1.guardarPecas(lista1);
        gVolume1.guardarPecas(lista2);
        gVolume1.mostrarPecas();
        gVolume1.mostrarPecas(1);
        gVolume1.devolverPecas(1);
    }
}
