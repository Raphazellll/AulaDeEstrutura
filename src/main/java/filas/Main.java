package filas;

public class Main {
    public static void main(String[] args) {

        Fila <String> minhaFila = new Fila<>();

        minhaFila.enqueue("Primeiro");
        minhaFila.enqueue("Segundo");
        minhaFila.enqueue("Terceiro");
        minhaFila.enqueue("Quarto");

        System.out.println(minhaFila);

    }
}
