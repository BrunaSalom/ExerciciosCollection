package Ex4;

public class Peca {

    private String marca;
    private String modelo;

    public Peca(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }

    public void retirada() {
    }
}
