package DataStructures.Fila;

public class Fila<T> {

    private No<T> refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public T first() {
        if(this.isEmpty()){
            No<T> primeiroNo = refEntradaFila;
            while(primeiroNo.getRefNo() != null){
                primeiroNo = primeiroNo.getRefNo();
            }
            return (T) primeiroNo.getObject();
        }else
            return null;
    }

    public T dequeue() {
        if(this.isEmpty()){
            No<T> primeiroNo = refEntradaFila;
            No<T> noAuxiliar = refEntradaFila;
            while(primeiroNo.getRefNo() != null){
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getRefNo();
            }
            noAuxiliar.setRefNo(null);
            return (T) primeiroNo.getObject();
        }else
            return null;
    }

    public void enqueue(T obj){
        No<T> novoNo = new No<T>(obj);
        novoNo.setRefNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public boolean isEmpty(){
        return this.refEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";

        No<T> noAuxiliar = refEntradaFila;
        if(refEntradaFila != null){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}] ----> ";
                if(noAuxiliar.getRefNo() == null){
                    stringRetorno += "null";
                    break;
                }
                noAuxiliar = noAuxiliar.getRefNo();
            }
        }else {
            stringRetorno = "null";
        }

        return stringRetorno.toString();
    }
}
