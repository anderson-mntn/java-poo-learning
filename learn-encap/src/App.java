public class App {
    public static void main(String[] args) throws Exception {
        RemoteController cr = new RemoteController();
        cr.openMenu();
        cr.play();
        System.out.println(cr.toString());
        cr.pause();
        System.out.println(cr.toString());
    }
}