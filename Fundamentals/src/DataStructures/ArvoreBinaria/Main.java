package DataStructures.ArvoreBinaria;

import DataStructures.ArvoreBinaria.model.Obj;

public class Main {

    public static void main(String[] args) {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<>();

        minhaArvore.inserir(new Obj(13));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();

        minhaArvore.remover(new Obj(13));



    }

}
