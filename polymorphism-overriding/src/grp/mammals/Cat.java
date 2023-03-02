package grp.mammals;

public class Cat extends Mammals {

    public Cat(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void makeNoise(){
        System.out.println(name + " Meow... Meow...");
    }

    
}
