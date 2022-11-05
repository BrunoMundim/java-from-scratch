package DataStructures.ListaCircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println(lista);

        lista.remove(1);

        System.out.println(lista);
    }

}
