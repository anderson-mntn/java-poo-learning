
// challenger;
    // challenged;
    // rounds;
    // aproved;//same category
    // setFightDate()
    // fight()

public class Fight {
    private Fighter challenger;
    private Fighter challenged;
    private int roundsAmount;
    private boolean fightApproved;

   

    public void setFightDate(Fighter challenger, Fighter challenged){
        isFightApproved();
        if(isFightApproved()){
            System.out.println("Fight was approved");
            fight(challenger, challenged);
        } else {
            System.out.println("Fight Declined! Both fighters must be in same category.");
        }
    }

    public void fight(Fighter challenger, Fighter challenged){

        System.out.println("The challenger " + challenger.getName() + " is fighting the challenged " + challenged.getName());
        
        if(challenger.getWeight() > challenged.getWeight()){
            challenger.winFight();
            challenged.loseFight();
            System.out.println(challenger.getName() + "Won the fight! --- " + challenged.getName() + "Lost the fight" );
        }
        if (challenger.getWeight() == challenged.getWeight()) {
            challenger.drawFight();
            challenged.drawFight();
            System.out.println("The fight drew");
        } else {
            challenger.loseFight();
            challenged.winFight();
            System.out.println(challenger.getName() + " Lost the fight! --- " + challenged.getName() + " Won the fight!" );

        }
    }
    
    public Fight(Fighter challenger, Fighter challenged) {
       this.challenger = challenger;
       this.challenged = challenged;
   }
    public Fighter getChallenger() {
        return challenger;
    }
    public void setChallenger(Fighter challenger) {
        this.challenger = challenger;
    }
    public Fighter getChallenged() {
        return challenged;
    }
    public void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }
    public int getRoundsAmount() {
        return roundsAmount;
    }
    public void setRoundsAmount(int roundsAmount) {
        this.roundsAmount = roundsAmount;
    }
    public boolean isFightApproved() {
        if(getChallenger().getCategory() == getChallenged().getCategory()){
            setFightApproved(true);
            return true;
        } else {
            setFightApproved(false);
            return false;
        }
    }
    public void setFightApproved(boolean fightApproved) {
        this.fightApproved = fightApproved;
    }
   

}
  