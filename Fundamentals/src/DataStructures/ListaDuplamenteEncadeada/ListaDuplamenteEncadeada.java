package DataStructures.ListaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada(){
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size(){
        return tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximoNo(null);
        novoNo.setNoAnterior(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo != null){
            ultimoNo.setProximoNo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        if(index >= size()){
            add(elemento);
            return;
        }
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setProximoNo(noAuxiliar);


        if(novoNo.getProximoNo() != null){
            if(noAuxiliar.getNoAnterior() != null){
                noAuxiliar.getNoAnterior().setProximoNo(novoNo);
            }
            novoNo.setNoAnterior(noAuxiliar.getNoAnterior());
            novoNo.getProximoNo().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0){
            primeiroNo = novoNo;
        } else{
            novoNo.getProximoNo().setNoAnterior(novoNo);
        }

        tamanhoLista++;
    }

    public void remove(int index) {
        if(index == 0){
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoAnterior().setProximoNo(noAuxiliar.getProximoNo());
            if(noAuxiliar != ultimoNo){
                noAuxiliar.getProximoNo().setNoAnterior(noAuxiliar.getNoAnterior());
            }
        }
        this.tamanhoLista--;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = null;
        if(index <= tamanhoLista/2){
            noAuxiliar = primeiroNo;
            for(int i = 0; (i<index) && (noAuxiliar != null); i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }
        }
        if(index > tamanhoLista/2 && index < size()){
            noAuxiliar = ultimoNo;
            for (int i = size() - 1; i > index; i--) {
                noAuxiliar = noAuxiliar.getNoAnterior();
            }
        }
        return noAuxiliar;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "}] --> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }
}
