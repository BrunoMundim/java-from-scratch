package DataStructures.Pilha;

public class Main {

    public static void main(String[] args) {

        Pilha<Integer> minhaPilha = new Pilha<>();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.push(6);

        System.out.println(minhaPilha);

        System.out.println("Popping: " + minhaPilha.pop());
        System.out.println("Popping: " + minhaPilha.pop() + "\n");

        System.out.println(minhaPilha);
    }

}
