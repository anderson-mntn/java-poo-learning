package grp.mammals;

import grp.Animal;

public class Mammals extends Animal {
    public Mammals(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    private String furColour;
    public String getFurColour() {
        return furColour;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    @Override
    public void move() {
        System.out.println(name + " Running");
    }

    @Override
    public void eat() {
        System.out.println(name + " Drinking milk");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " Making mammal noise");
    
    }
    
}
