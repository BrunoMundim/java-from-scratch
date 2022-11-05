package DataStructures.ListasEncadeadas;

public class ListaEncadeada<T> {

    private No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public int size(){
        int size = 0;

        No<T> referenciaAux = referenciaEntrada;
        while(referenciaAux != null){
            size++;
            if(referenciaAux.getProximoNo() != null){
                referenciaAux = referenciaAux.getProximoNo();
            } else break;
        }
        return size;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T remove(int index){
        No<T> noPivot = getNo(index);
        if(index == 0){
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException(String.format("Não existe conteúdo no índice %d nessa lista. Essa lista só vai até o índice: %d", index, ultimoIndice));
        }
    }

    public boolean isEmpty(){
        return this.referenciaEntrada == null;
    }

    @Override
    public String toString() {
        String str = "";

        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            str += "[Nó{Conteúdo=" + noAuxiliar.getConteudo() + "}] --> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        str += "null";

        return str.toString();
    }
}
