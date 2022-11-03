package OOP.Heranca;

public class Caminhao extends Veiculo{

    private double pesoCarga;
    private String tipoCarga;

    public double getPesoCarga() {
        return pesoCarga;
    }

    public void setPesoCarga(double pesoCarga) {
        this.pesoCarga = pesoCarga;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                ", pesoCarga=" + pesoCarga +
                ", tipoCarga='" + tipoCarga + '\'' +
                '}';
    }
}
