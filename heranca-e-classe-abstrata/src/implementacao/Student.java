package implementacao;

public class Student extends Person {
    private int enrollment;
    private String course;

    public void payMonthly(){
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

    
}
