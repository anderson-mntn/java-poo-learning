package caneta.src;

// CEV - Aula Teoria - #04a 

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada = true;

    public void Caneta(String m, String c, float p) { // Este é um método construtor
        this.m = m;
        this.modelo = m;
        this.c = c;
        this.cor = c;
        this.p = p;
        this.ponta = p;
        this.destampar();
    }

    public void destampar() {
        this.tampada = false;
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

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    @Override
    public String toString() {
        return "Caneta [modelo=" + modelo + ", cor=" + cor + ", ponta=" + ponta + ", tampada: " + tampada + " ]";
    }

}
