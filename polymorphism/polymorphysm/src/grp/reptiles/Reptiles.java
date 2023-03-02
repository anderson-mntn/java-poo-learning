package grp.reptiles;

import grp.Animal;

public class Reptiles extends Animal {
    public Reptiles(float weight, int age, int members, String name) {
        super(weight, age, members, name);
        //TODO Auto-generated constructor stub
    }

    private String scaleColour;
    public String getScaleColour() {
        return scaleColour;
    }

    public void setScaleColour(String scaleColour) {
        this.scaleColour = scaleColour;
    }

    @Override
    public void move() {
        System.out.println(name + " Crawling");
    }

    @Override
    public void eat() {
        System.out.println(name + " Eating reptile food.");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " Making reptile Noise");
    }
    
}
