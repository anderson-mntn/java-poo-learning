package caneta.src;

public class App {
    public static void main(String[] args) throws Exception {

        // Aula #04
        /*
         * Caneta c1 = new Caneta("bic", "vermelha", 0.5f);
         * System.out.println(c1.toString());
         * Caneta c2 = new Caneta("faber castle", "preta", 1.5f);
         * System.out.println(c2.toString());
         * c2.setPonta(2.5f);
         * System.out.println(c2.getPonta());
         * c2.destampar();
         * System.out.println(c2.toString());
         * 
         * Caneta c1 = new Caneta("bic", "vermelha", 0.5f);
         * System.out.println(c1.toString());
         * Caneta c2 = new Caneta("faber castle", "preta", 1.5f);
         * System.out.println(c2.toString());
         * c2.setPonta(2.5f);
         * System.out.println(c2.getPonta());
         * c2.destampar();
         * System.out.println(c2.toString());
         */

        // Aula #05
        System.out.println("--- Aula #05 ---");
        ContaBanco jubileu = new ContaBanco(445566, "jubileu");
        System.out.println(jubileu.toString());
        jubileu.abrirConta("cp");
        jubileu.sacar(25);
        // jubileu.sacar(25);
        // jubileu.sacar(25); //Vai chegar a zero e vai impedir de sacar.
        jubileu.pagarMensalidade(); // A mensalidade de foi de 12, se mudarmos o tipo, a mensalidade muda.
        jubileu.pagarMensalidade();
    }
}
