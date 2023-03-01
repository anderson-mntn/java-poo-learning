package implementacao;

public class Studentship extends Student {
    private float scholarship;

    public void renewScholarship(){
        System.out.println("Renewing the scholarship of: " + this.getName());
    }

    public void payMonthly(){
        System.out.println( "Paying the monthly of the student: " + this.name + " it's a stundetship, pays -25%");
    }
}
