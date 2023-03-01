package implementacao;

public class Student extends Person {
    private int enrollment;
    private String course;
    protected int monthPayment;

    public int getMonthPayment() {
        return monthPayment;
    }

    public void setMonthPayment(int monthPayment) {
        this.monthPayment = monthPayment;
    }

    public void payMonthly(){ // if add "final" , cannot be overrided (protect the code)
        System.out.println("Paying the monthly of the student: " + name);
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student=" + name + ", Enrollment=" + enrollment + ", course=" + course + ", monthPayment=" + monthPayment + "]";
    }

}
