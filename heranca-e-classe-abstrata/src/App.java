import implementacao.Visitor;

public class App {
    public static void main(String[] args) throws Exception {
    
        Visitor v1 = new Visitor();
        v1.setName("joseph");
        v1.setAge(17);
        v1.setGender("M");
        System.out.println(v1.toString());
        
    }
}

