import grp.Dog;

public class App {
    public static void main(String[] args) throws Exception {
        Dog dog = new Dog("Stewie", 15);

        System.out.println("saying food to Stewie" );
        dog.reaction("food");
        dog.reaction("bad boy");

        //Reaction according to hour of the day
        System.out.println("hours: 7 AM");
        dog.reaction(7);
        System.out.println("hours: 1 PM");
        dog.reaction(13);
        System.out.println("hours: 11 PM");
        dog.reaction(23);

        //Reaction according to dogs age and weight
        System.out.println("if Stewie has 2 years old and 3kg:");
        dog.reaction(2, 3.7f);

        System.out.println("if Stewie has 5 years old and 10kg:");
        dog.reaction(5, 10.5f);
    }
}
