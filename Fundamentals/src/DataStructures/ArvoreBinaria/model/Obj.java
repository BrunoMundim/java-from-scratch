package DataStructures.ArvoreBinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashcode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;

        return this.meuValor.compareTo(outro.meuValor);
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
