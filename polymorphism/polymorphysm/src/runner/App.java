package runner;

import grp.Birds;
import grp.Fishes;

public class App {
    public static void main(String[] args) throws Exception {

        Birds baldEagle = new Birds(1.0f, 1, 2, "Bald Eagle");
        Fishes goldfish = new Fishes(0.4f, 3, 2, "Goldfish");

        System.out.println(baldEagle.getAge());
        baldEagle.eat();
        baldEagle.makeNoise();
        baldEagle.move();
        baldEagle.setFeathersColour("white and brown");

        System.out.println(baldEagle.getName() + " colour: " + baldEagle.getFeathersColour());

        System.out.println("--- fish ---");
        goldfish.eat();
        goldfish.makeNoise();
        goldfish.move();
        goldfish.makeBubbles();
    }
}
