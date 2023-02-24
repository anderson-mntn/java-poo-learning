package caneta.src;

public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta("bic", "vermelha", 0.5f);
        System.out.println(c1.toString());
        Caneta c2 = new Caneta("faber castle", "preta", 1.5f);
        System.out.println(c2.toString());
        c2.setPonta(2.5f);
        System.out.println(c2.getPonta());
        c2.destampar();
        System.out.println(c2.toString());
    }
}
