
import implementacao.Student;
import implementacao.Studentship;
import implementacao.Visitor;

//Simulating a university with visitors, students and teachers 

public class App {
    public static void main(String[] args) throws Exception {
    
        Visitor v1 = new Visitor();
        v1.setName("joseph");
        v1.setAge(17);
        v1.setGender("M");
        System.out.println(v1.toString());

        Student s1 = new Student();
        s1.setName("Clarice");
        s1.setAge(19);
        s1.setGender("F");
        s1.setCourse("Medinice");
        s1.setEnrollment(443);      
        
        s1.payMonthly();

        Studentship ss1 = new Studentship();
        ss1.setName("Robert");

        ss1.payMonthly();
    }
}

