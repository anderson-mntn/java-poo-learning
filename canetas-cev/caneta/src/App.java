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
        BankAccount jhon = new BankAccount(445566, "jhon");
        jhon.openAccount("accType2");
        System.out.println(jhon.toString());
        jhon.withdraw(25);
        jhon.deposit(100);
        // jhon.sacar(25);
        // jhon.sacar(25); //Vai chegar a zero e vai impedir de sacar.
        jhon.monthlyPayment(); // A mensalidade de foi de 12, se mudarmos o tipo, a mensalidade muda.
        jhon.monthlyPayment();
        jhon.closeAccount();
        jhon.withdraw(20);
        jhon.closeAccount();
        jhon.withdraw(jhon.getAccBalance());
        jhon.closeAccount();
    }
}
