package implementacao;

public class Studentship extends Student {
    private int scholarship;


    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public void renewScholarship(){
        System.out.println("Renewing the scholarship of: " + this.getName());
    }

    @Override
    public void payMonthly(){
        int acc = (scholarship * monthPayment) / 100;
        int totalMonthPayment = monthPayment -acc;
        setMonthPayment(totalMonthPayment);
        System.out.println( "Paying the monthly of the student: " + name + " it's a stundetship, pays -" + scholarship + "%, total month payment:  " + getMonthPayment());
    }
}
