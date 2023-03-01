
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
        s1.setMonthPayment(400);
        s1.setEnrollment(443);
        System.out.println(s1.toString());      
        
        s1.payMonthly();

        Studentship st1 = new Studentship();
        st1.setName("Robert");
        st1.setGender("M");
        st1.setCourse("Engineering");
        st1.setEnrollment(1132);
        st1.setMonthPayment(400);
        st1.setScholarship(20);
        System.out.println(st1.toString());

        st1.payMonthly();
    }
}

