package OOP.Interfaces;

public class Moto implements Veiculo{

    private String modelo;
    private String cor;
    private int anoFabricacao;
    private int velocidade = 0;

    @Override
    public void acelerar() {
        System.out.println("Acelerando...");
        velocidade += 10;
    }

    @Override
    public void frear() {
        if(velocidade == 0){
            System.out.println("Veículo parado");
        } else {
            System.out.println("Freando...");
            velocidade -= 10;
        }
    }

    @Override
    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }
}
