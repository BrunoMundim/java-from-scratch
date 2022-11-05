package DataStructures.ListasEncadeadas;

public class Main {

    public static void main(String[] args) {
        ListaEncadeada<String> lista = new ListaEncadeada<String>();

        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        lista.add("Quarto");

        System.out.println(lista);

        System.out.println("Removendo: " + lista.remove(0));

        System.out.println(lista);

    }



}
