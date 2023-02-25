//We can set weight to change category, set fight


public class App {
    public static void main(String[] args) throws Exception {

        Fighter f[] = new Fighter[5]; //List of fighters

        f[0] = new Fighter("Jhon Wick", "Australian", 25, 71, 1.80f, 3, 0, 0);
        f[1] = new Fighter("Thomas Shelby", "English", 32, 73, 1.85f, 1, 2, 0);
        f[2] = new Fighter("Mario", "Japan", 42, 63, 1.55f, 5, 0, 2 );
        f[3] = new Fighter("Bruce Wayne", "American", 46, 95, 1.88f, 0, 0, 0);
        f[4] = new Fighter("Tony Stark", "American", 38, 102, 1.98f, 0, 0, 0);

   
        System.out.println("---- Jhon Wick x Thomas Shelby");
        Fight fight1 = new Fight(f[0], f[1]);

        //Checking if the fight is possible
        fight1.setFightDate(f[0], f[1]);

        //Fighters Apresentation
        f[0].introduceFighter();
        f[0].fighterStatus();
        f[1].introduceFighter();
        f[1].fighterStatus();

        // Fight!
        fight1.fight(f[0], f[1]);
        f[0].fighterStatus();
        f[1].fighterStatus();

        System.out.println( "----- Thomas Shelby x Mario -----");
        Fight fight2 = new Fight(f[1],f[2]);
        fight2.setFightDate(f[1], f[2]);

        System.out.println("----- Tony Stark x Bruce Wayne -----");
        Fight fight3 = new Fight(f[3], f[4]);

        //Checking fight
        fight3.setFightDate(f[3], f[4]);

        //Fight Apresentation
        f[0].introduceFighter();
        f[0].fighterStatus();
        f[1].introduceFighter();
        f[1].fighterStatus();

        //Fight!
        fight3.fight(f[3],f[4]);
        f[3].fighterStatus();
        f[4].fighterStatus();
    }
}
