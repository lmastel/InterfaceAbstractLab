
package lab3baseballsimulation;

//This class extends OffensivePlayer because batter is a more specific type 
//of offensive player and provides methods to setRates that will be used
//in algorithms to determine the outcome of a matchup between a batter and
//a pitcher.
public class Batter extends OffensivePlayer {
    
    private char battingHand;
    
    public void setWalkRate (int plateAppearances, int walks){
        
    }
    
    public void setStrikeoutRate (int plateAppearances, int strikeouts){
        
    }
    
    public void setHitRate (int plateAppearances, int hits){
        
    }

    public char getBattingHand() {
        return battingHand;
    }

    public void setBattingHand(char battingHand) {
        this.battingHand = battingHand;
    }
    
    
}
