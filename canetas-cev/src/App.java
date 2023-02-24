public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Caneta c1 = new Caneta("bic", "vermelha", 0.5);
        System.out.println(c1.toString());
        Caneta c2 = new Caneta("faber castle", "preta", 1.5);
        System.out.println(c2.toString());
        System.out.println(c2.getPonta());
    }
}
