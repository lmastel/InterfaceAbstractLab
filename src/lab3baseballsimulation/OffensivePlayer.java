
package lab3baseballsimulation;

//This class extends BaseballPlayer because OffensivePlayer is a more specific type
//of baseball player and baseball players takes turns playing offense and defense so
//they are not restricted to either offense or defense. It also implements Baserunner
//because offensive players are batters but also play the role of baserunners.
public class OffensivePlayer extends BaseballPlayer implements BaseRunner {
    private int plateAppearances;
    private int walks;
    private int strikeouts;
    private int hitbatters;
    private int singles;
    private int doubles;
    private int triples;
    private int homeruns;
    private int outs;
    private double battingAverage;
    private int stealAttempts;
    private int caughtStealing;

    @Override
    public void setStatistics(String team, String name, int season) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    public void setStealSuccessPercentage(int stealAttempts, int caughtStealing) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
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

    public int getOuts() {
        return outs;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getStealAttempts() {
        return stealAttempts;
    }

    public void setStealAttempts(int stealAttempts) {
        this.stealAttempts = stealAttempts;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    
}
