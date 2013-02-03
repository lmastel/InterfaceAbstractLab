
package lab3baseballsimulation;

//This class extends DefensivePlayer because a catcher is a more specific type
//of defensive player and has unique attributes that other defensive position
//players don't have.
public class Catcher extends DefensivePlayer {
    private int passedBalls;
    private int stolenBaseAttempts;
    private int caughtStealing;

    public int getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public int getStolenBaseAttempts() {
        return stolenBaseAttempts;
    }

    public void setStolenBaseAttempts(int stolenBaseAttempts) {
        this.stolenBaseAttempts = stolenBaseAttempts;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }
    
    
}
