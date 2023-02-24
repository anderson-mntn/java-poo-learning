package caneta.src;

// CEV - Aula Teoria - #04a 

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada = true;

    // Constructor
    public Caneta(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    // Getters and Setters
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

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    // To String
    @Override
    public String toString() {
        return "Caneta [modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", tampada=" + tampada + "]";
    }

    // Method destampar
    public void destampar() {
        this.tampada = false;
    }

}
