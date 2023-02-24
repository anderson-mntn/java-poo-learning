package caneta.src;

// Aula #05 - CEV 

public class ContaBanco {
    public Integer numConta;
    protected String tipo;
    private String dono;
    private long saldo;
    private boolean status;

    public void Constructor() {
        saldo = 0;
        status = false;
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        if (tipo == "cc") // Conta corrente ganha 50 de saldo ao abrir conta
            setSaldo(50);
        if (tipo == "cp")
            setSaldo(150); // Conta poupança ganha 150 de saldo ao abrir conta

        setStatus(true);
    };

    public void fecharConta() {
        if (getSaldo() > 0) {
            System.out.println("Impossível fechar, cause: conta com dinheiro.");
        } else if (getSaldo() < 0) {
            System.out.println("Impossível fechar, causa: conta com débito.");
        } else {
            System.out.println("Conta fechando");
            setStatus(false);
        }
    }

    public void depositar(long qtdDepositada) {
        long novoSaldo = saldo + qtdDepositada;
        if (isStatus() == true) {
            setSaldo(novoSaldo);
            System.out.println(getDono() + " Depositada: " + qtdDepositada + ", seu saldo agora é: " + getSaldo());
        } else {
            System.out.println("Impossível Depositar, causa: Conta Fechada.");
        }
    };

    public void sacar(long qtdSacada) {
        if (isStatus() == true) {
            if (getSaldo() == 0) {
                System.out.println("Foi impossível sacar, causa: Saldo zerado.");
            } else {
                long novoSalvo = getSaldo() - qtdSacada;
                setSaldo(novoSalvo);
                System.out.println(getDono() + " Sacou: " + qtdSacada + ", seu saldo agora é: " + getSaldo());
            }
        } else {
            System.out.println("Impossível Sacar, causa: Conta Fechada.");
        }
    };

    public void pagarMensalidade() {
        int h = 0;
        if (getTipo() == "cc")
            h = 12;
        if (getTipo() == "cp")
            h = 20;
        setSaldo(getSaldo() - h);
        System.out.println(getDono() + "seu saldo agora é: " + getSaldo());

    };

    // Constructor
    public ContaBanco(Integer numConta, String tipo, String dono, long saldo, boolean status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public ContaBanco(Integer numConta, String dono) {
        this.numConta = numConta;
        this.dono = dono;
    }

    // Getters and Setter
    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // toString
    @Override
    public String toString() {
        return "ContaBanco [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo
                + ", status=" + status + "]";
    }
}
