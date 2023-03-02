package runner;

import grp.birds.BaldEagle;
import grp.birds.Birds;
import grp.fishes.Fishes;
import grp.mammals.Cat;
import grp.mammals.Dog;
import grp.mammals.Mammals;

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

        System.out.println("--- mammals --- ");

        Mammals cow = new Mammals(200, 5, 4, "Holstein");
        Dog dog1 = new Dog(10, 12, 4, "Marley");
        Cat cat1 = new Cat(3,2, 4 , "Snowflake");

        cow.makeNoise(); // generic from it's super class
        dog1.makeNoise(); // polymorphism
        cat1.makeNoise(); // polymorphism
    }
}
