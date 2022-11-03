package OOP;

import OOP.Classes.Carro;
import OOP.Heranca.Caminhao;
import OOP.Heranca.Veiculo;
import OOP.Interfaces.Moto;

public class OOP {

    /*
    Class: Blueprint de um objeto
    Object: Objeto que simula um objeto do mundo real, com atributos e ações
    Interfaces: Blueprint de uma classe. Permite abstração máxima
    Inheritance (Herança): Uma classe pode ser subclasse de outra, herdando atributos e métodos
    Polymorphism: Realizar a mesma ação de maneiras diferentes, ou seja, podemos criar variações do mesmo método
        I. Overloading: A variação é dada pela mudança do tipo de parâmetro
        II. Overriding: A subclasse altera o que um método faz
    Abstraction: A abstração mostra apenas o necessário e esconde o como algo é feito
    Encapsulation: Os atributos são privados e toda alteração é feita através de métodos (Getters and Setters)
     */

    public static void main(String[] args) {
        // Classes
        Carro meuCarro = new Carro();
        meuCarro.setModelo("Fusion");
        meuCarro.setCor("Preto");
        meuCarro.setAnoFabricacao(2020);
        meuCarro.setChassi(157826);
        System.out.println(meuCarro + "\n");

        // Interfaces
        Moto minhaMoto = new Moto();
        minhaMoto.setModelo("CG180");
        minhaMoto.setCor("Vermelho");
        minhaMoto.setAnoFabricacao(2021);
        System.out.println(minhaMoto);
        minhaMoto.acelerar();
        System.out.println("Moto está com a velocidade de: " + minhaMoto.getVelocidade() + "km/h\n");

        // Herança
        Caminhao meuCaminhao = new Caminhao();
        meuCaminhao.setModelo("Bitrem");
        meuCaminhao.setCor("Azul");
        meuCaminhao.setAnoFabricacao(2017);
        meuCaminhao.setTipoCarga("Arroz");
        meuCaminhao.setPesoCarga(12300.0);
        System.out.println(meuCaminhao + "\n");
    }
}
