package runner;

import grp.BaldEagle;
import grp.Birds;
import grp.Fishes;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--- birds ---");

        Birds swallow = new Birds(0.2f, 1, 4, "Swallow");
        swallow.eat(); // this bird will eat worms

        BaldEagle baldEagle = new BaldEagle(5.0f, 3, 4, "Bald Eagle");
        
        System.out.println(baldEagle.getAge());
        baldEagle.eat(); // this bird don't eat worms, the eagles hunts their food, so we make an polymorphism on the eat() method.
        baldEagle.makeNoise();
        baldEagle.move();
        baldEagle.setFeathersColour("white and brown");

        System.out.println(baldEagle.getName() + " colour: " + baldEagle.getFeathersColour());

        System.out.println("--- fish ---");
        Fishes goldfish = new Fishes(0.4f, 3, 2, "Goldfish");
        goldfish.eat();
        goldfish.makeNoise();
        goldfish.move();
        goldfish.makeBubbles();

        System.out.println("--- mammal --- ");
    }
}
