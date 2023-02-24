import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int R = scan.nextInt();
        int V = 0;
        int J = scan.nextInt();
        while (J <= R) {
            J = scan.nextInt();
            V++;
        }
        System.out.println(V);
    }
}
