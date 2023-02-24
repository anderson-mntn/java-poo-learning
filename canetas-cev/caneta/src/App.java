package caneta.src;

public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta("bic", "vermelha", (float) 0.5);
        System.out.println(c1.toString());
        Caneta c2 = new Caneta("faber castle", "preta", (float) 2.5);
        System.out.println(c2.toString());
        System.out.println(c2.getPonta());
        c2.destampar();
        System.out.println(c2.toString());
    }
}
