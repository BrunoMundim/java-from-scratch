package DataStructures.ListaDuplamenteEncadeada;

public class Main {

    public static void main(String[] args) {
         ListaDuplamenteEncadeada<Integer> lista = new ListaDuplamenteEncadeada<>();

         lista.add(1);
         lista.add(2);
         lista.add(3);
         lista.add(4);
         lista.add(5);

        System.out.println(lista);

        System.out.println(lista.get(2));

        lista.add(5, 99);

        System.out.println(lista);
    }

}
