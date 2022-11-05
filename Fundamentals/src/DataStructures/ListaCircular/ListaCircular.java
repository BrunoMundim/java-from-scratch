package DataStructures.ListaCircular;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular(){
        this.cabeca = null;
        this.cauda = null;
        tamanhoLista = 0;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    public void remove(int index){
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        No<T> noAuxiliar = this.cauda;
        if(index == 0){
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else {
            for(int i = 0; i < (index-1); i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
            noAuxiliar.setProximoNo(noAuxiliar.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if(isEmpty()){
            this.cabeca = novoNo;
            this.cauda = cabeca;
            this.cabeca.setProximoNo(cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");

        if(index == 0){
            return cauda;
        }

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i <= index; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        return noAuxiliar;
    }


    public boolean isEmpty() {
        return size() == 0;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "]} --> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += this.isEmpty() ? "[]" : "(Retorna ao início)";


        return strRetorno;
    }
}
