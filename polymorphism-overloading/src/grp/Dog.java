package grp;
/*
 * Praticing Overloading - set a method for a dog
 * and set his reaction according with the signature.
 * Set different reactions for the dog according to:
 *  A phrase you tell him, Hour of the day, dog's age, if the user are the owner,
 */
public class Dog extends Canine {
    
    public Dog(String name, int weight) {
       this.name = name;
       this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println(" Bark! Bark!");
    }

    @Override
    public void reaction() {

    }

    // Dog's reaction according to what you say
    public void reaction(String phrase){
        if(phrase.equals("food") || phrase.equals("good boy")){
            System.out.println(name +" Wiggles and Happly Barks!");
        } else if(phrase == "bad boy"){
            System.out.println(name + " Growls!");
        }
        else {
            System.out.println(" Ignores.");
        }
    }
       
    //Dog's reaction according hour of the day (he knows when he make noise)
    public void reaction(int hour) {
        if (hour < 9){
            System.out.println(name + " Wiggles! He don't want to wake people sleeping.");
        } else if ( hour >= 22){
            System.out.println(name + " Ignores! He's tired cause it's late.");
        } else {
            System.out.println(name + " Wiggles and Barks!");
        }
    }

    // If the user are his owner the dog gets one reaction
    public void reaction(boolean dogsOwner){
        if(dogsOwner){
            System.out.println(name + " gets happy and wiggle");
        } else {
            System.out.println(name + " gets angry and growl");
        }
    }

    //Heavier dogs gets angry, and puppies get happy.
    public void reaction(int age, float weight){
        if(age <= 2){
            if(weight < 10){
            System.out.println("Wiggles!");
            } else {
                System.out.println("Barks!");
            }
        } else {
            if (weight > 10){
                System.out.println("Growls");
            } else {
                System.out.println("Barks!");
            }
        }
    }

    
}
