package OOP.Classes;

public class Carro {

    private String cor;
    private String modelo;
    private int chassi;
    private int anoFabricacao;

    public Carro(){
        super();
    }

    public Carro(String modelo, int anoFabricacao){
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }

    public void frear(){
        System.out.println("Freando...");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", chassi=" + chassi +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
