package grp.birds;

import grp.Animal;

public class Birds extends Animal{
    
    public Birds(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    private String feathersColour;

    public String getFeathersColour() {
        return feathersColour;
    }

    public void setFeathersColour(String feathersColour) {
        this.feathersColour = feathersColour;
    }

    @Override
    public void move() {
        System.out.println(name + " Flying");
    }

    @Override
    public void eat() {
        System.out.println(name + " Eating worms");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " Singing");
    }
}
