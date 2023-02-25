//We can set weight to change category, set fight


public class App {
    public static void main(String[] args) throws Exception {
        

        Fighter jhonWick = new Fighter("Jhon Wick", "Australian", 25, 71, 1.80f, 3, 0, 0);
        Fighter thomasShelby = new Fighter("Thomas Shelby", "English", 32, 73, 1.85f, 1, 2, 0);
        jhonWick.introduceFighter();
        thomasShelby.introduceFighter();
       
        System.out.println(jhonWick.getCategory());
        System.out.println(jhonWick.getWins());

        Fight fight1 = new Fight(jhonWick, thomasShelby);
        System.out.println(fight1.getChallenged().getName());
        fight1.fight(jhonWick, thomasShelby);
    }
}
