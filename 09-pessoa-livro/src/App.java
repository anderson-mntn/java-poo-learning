public class App {
    public static void main(String[] args) throws Exception {

        Person[] p = new Person[3];
        p[0] = new Person("Richard", 30, "M");
        p[1] = new Person("Alice", 24, "F");
        p[2] = new Person("Joseph", 49, "M");
        
        
        Book[] b = new Book[5];
        b[0] = new Book("The Lord Of The Rings", "J. R. R. Tolkien", 423, p[0]);
        b[1] = new Book("Don Quixote", "Miguel de Cervantes", 700, p[1]);
        b[2] = new Book("Catcher in the Rye", "J. D. Salinger", 200, p[2]);
        b[3] = new Book("Pinocchio", "Carlo Collodi", 150, p[2]);
        b[4] = new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 360, p[1]);
        
    System.out.println(b[4].toString());
    b[4].browseToPage(3);        
    b[4].open();
    b[4].browseToPage(30);
    b[4].nextPage();
    b[4].nextPage();
    b[4].nextPage();

                
       

    }
}
