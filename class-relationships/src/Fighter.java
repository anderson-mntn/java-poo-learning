import java.text.DecimalFormat;
import java.text.NumberFormat;

//Exercise to learn class relationships, creating a "UFC" with fighters.
// Tasks:
// 1. Set fighter to a category automatically according to it's weight: Lightweight/Middleweight/Heavyweight.
// 2. Make array of fighters (increasing it's wins, loses or draws.)
// 3. Set a date to a fight, and checking if fight is valid (both fighters in same category)

public class Fighter {
    private String name;
    private int age;
    private String nacionality;
    private int weight;
    private float height;
    private String category;
    private int wins;
    private int loses;
    private int draws;

    // Methods
    public void introduceFighter(){
        System.out.print("PRESENTING FIGHTER!!! Fighter's Name: " + this.getName());
        System.out.print(", Nacionality: " + this.getNacionality() + ", ");
        System.out.print(this.getAge()+ " Years old, ") ;
        System.out.print("Weighting " + this.getWeight()+"kg, " + "Category: " + getCategory());
        NumberFormat formatter = new DecimalFormat("#0.00");    
        System.out.println(", and " + formatter.format(this.getHeight()) + "cm high.");
    }
    public void fighterStatus(){
        System.out.println(this.getName()+ " Status = Wins: " + this.wins + ", Loses: " + this.loses + ", Draws: " + this.draws);
    }
    public void winFight(){
        setWins(getWins() + 1);
    }
    public void loseFight(){
        setLoses(getLoses() + 1);
    }
    public void drawFight(){
        setDraws(getDraws() + 1);
    }

    // Constructors
    public Fighter() {
    }
    //We won't set category here, fighter's category will be set according to it's weight.
    public Fighter(String name,String nacionality, int age, int weight, float height, int wins, int loses, int draws){
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
        setWeight(weight);
    }

    // Getter and Setters    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getNacionality() {
        return nacionality;
    }
    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }
    public int getWeight() {
        return weight;
    }
    //Whenever weight changes and category change, it will automatically change the fighter category based on new weight.
    public void setWeight(int weight) {
        this.weight = weight;
        setCategory();
         
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public void setCategory(){
        if(weight < 52) setCategory("Underweight");
        if(weight > 52 && weight <= 70) setCategory("Lightweight");
        if(weight >= 70 && weight <= 90) setCategory("Middleweight");
        if(weight >= 90) setCategory("Heavyweight");
    }
    public int getWins() {
        return wins;
    }
    public void setWins(int wins) {
        this.wins = wins;
    }
    public int getLoses() {
        return loses;
    }
    public void setLoses(int loses) {
        this.loses = loses;
    }
    public int getDraws() {
        return draws;
    }
    public void setDraws(int draws) {
        this.draws = draws;
    }
    
}
