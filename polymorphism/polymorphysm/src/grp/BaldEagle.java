package grp;

public class BaldEagle  extends Birds{

    public BaldEagle(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void eat() {
        // TODO Auto-generated method stub
        System.out.println(name + " Hunting small animals");
    }
    
}
