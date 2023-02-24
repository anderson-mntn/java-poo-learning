public class Filme {
    String nome;
    Double duracao;

    public Filme(String nome, Double duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public Filme() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getDuracao() {
        return duracao;
    }

    public void setDuracao(Double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filmes [nome=" + nome + ", duracao=" + duracao + "]";
    }

}
