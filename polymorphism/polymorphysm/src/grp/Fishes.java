package grp;

public class Fishes extends Animal {

    public Fishes(float weight, int age, int members, String name) {
        super(weight, age, members, name);
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
        System.out.println(name + " Swimming");
    }

    @Override
    public void eat() {
        System.out.println(name + " Eating fish food");
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " Fishes don't make noise ");
    }
    
    public void makeBubbles(){
        System.out.println(name + " Bubbling...");
    }
}
