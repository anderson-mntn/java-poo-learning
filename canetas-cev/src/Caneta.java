// CEV - Aula Teoria - #04a 

public class Caneta {
    String modelo;
    String cor;
    Double ponta;

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

    public Double getPonta() {
        return ponta;
    }

    public void setPonta(Double ponta) {
        this.ponta = ponta;
    }

    public Caneta(String modelo, String cor, Double ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    @Override
    public String toString() {
        return "Caneta [modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + "]";
    }

}
