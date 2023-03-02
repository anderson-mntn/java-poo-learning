package grp.mammals;

public class Dog extends Mammals {

    public Dog(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void makeNoise(){
        System.out.println(name + " BARK! BARK!");
    }

    
}
