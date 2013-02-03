
package lab3baseballsimulation;


//This class extends DefensivePlayer because a pitcher is a more specific
//type of defensive player and implements Fielder because a pitcher also plays
//the role of a fielder. It provides methods to setRates that will be used
//in algorithms to determine the outcome of a matchup between a batter and
//a pitcher.
public class Pitcher extends DefensivePlayer implements Fielder {
    private char pitchingHand;
    private int walks;
    private int strikeouts;
    private int hitbatters;
    private int singles;
    private int doubles;
    private int triples;
    private int homeruns;

    public void setWalkRate (int plateAppearances, int walks){
        
    }
    
    public void setStrikeoutRate (int plateAppearances, int strikeouts){
        
    }
    
    public void setHitRate (int plateAppearances, int hits){
        
    }
    public void setThrowingHand(char throwingHand) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFieldingPercentage(int fieldingOpportunities, int errors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getFieldingPercentage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public char getPitchingHand() {
        return pitchingHand;
    }

    public void setPitchingHand(char pitchingHand) {
        this.pitchingHand = pitchingHand;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getHitbatters() {
        return hitbatters;
    }

    public void setHitbatters(int hitbatters) {
        this.hitbatters = hitbatters;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getHomeruns() {
        return homeruns;
    }

    public void setHomeruns(int homeruns) {
        this.homeruns = homeruns;
    }
    
    
    
}
