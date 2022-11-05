package DataStructures.Pilha;

public class Pilha<T> {

    private No<T> refNoTopo;

    public Pilha() {
        this.refNoTopo = null;
    }

    public void push(T obj) {
        No<T> novoNo = new No<>(obj);
        No<T> refAuxiliar = refNoTopo;
        refNoTopo = novoNo;
        refNoTopo.setProximoNo(refAuxiliar);
    }

    public T pop() {
        if(!this.isEmpty()){
            No<T> noPoped = refNoTopo;
            refNoTopo = refNoTopo.getProximoNo();
            return noPoped.getDado();
        }else return null;
    }

    public T top() {
        return refNoTopo.getDado();
    }

    public boolean isEmpty() {
        return this.refNoTopo == null;
    }

    @Override
    public String toString() {
        StringBuilder stringRetorno = new StringBuilder("===============\n");
        stringRetorno.append("     Pilha\n");
        stringRetorno.append("===============\n");

        No<T> noAuxiliar = refNoTopo;

        while(noAuxiliar != null){
            stringRetorno.append("[No{objeto=").append(noAuxiliar.getDado()).append("}]\n");
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        stringRetorno.append("===============\n");

        return stringRetorno.toString();
    }
}
