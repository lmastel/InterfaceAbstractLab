
package lab3baseballsimulation;


//This class extends BaseballPlayer because DefensivePlayer is a more specific type
//of baseball player and baseball players takes turns playing offense and defense so
//they are not restricted to either offense or defense.
public class DefensivePlayer extends BaseballPlayer implements Fielder {
    private String name;
    private int [] positions;
    private char throwingHand;
    private int putouts;
    private int assists;
    private int errors;
    private int fieldingOpportunities;

    public void setThrowingHand(char throwingHand) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setFieldingPercentage(int fieldingOpportunities, int errors) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public double getFieldingPercentage() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setPositionArray(int[] positionNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setStatistics(String team, String name, int season) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
