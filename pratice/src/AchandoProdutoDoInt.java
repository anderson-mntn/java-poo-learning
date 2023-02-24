import java.util.Scanner;

public class AchandoProdutoDoInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int somaDosValores = somarValor(num);
        int prodDosValores = produtoDoValor(num); 
        System.out.println(prodDosValores - somaDosValores);
        scan.close();
    }

    static int somarValor(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        } return sum;
    }
    
     static int produtoDoValor(int n) {
        int prod = 1, rem;
        while(n > 0){
            rem = n % 10;
            prod = prod * rem;
            n = n / 10;
        } return prod;
    }
    
}
    
