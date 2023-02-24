import java.util.Scanner;

public class SettarFilme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Filme filme1 = new Filme();

        System.out.print("Digite o Nome do Filme: ");
        String nomeDoFilme = sc.next();
        filme1.setNome(nomeDoFilme);

        System.out.print("Digite o Duração do Filme: ");
        Double duracaoDoFilme = sc.nextDouble();
        filme1.setDuracao(duracaoDoFilme);

        System.out.println(filme1.toString());
        sc.close();
    }

}
