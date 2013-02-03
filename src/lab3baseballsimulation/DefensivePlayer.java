
package lab3baseballsimulation;


//This class extends BaseballPlayer because DefensivePlayer is a more specific type
//of baseball player and baseball players takes turns playing offense and defense so
//they are not restricted to either offense or defense.
public class DefensivePlayer extends BaseballPlayer implements Fielder {
    private int [] positions;  //some defensive players play more than 1 position 
    private char throwingHand; //specific attributes to defensive players
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

    public int[] getPositions() {
        return positions;
    }

    public void setPositions(int[] positions) {
        this.positions = positions;
    }

    public int getPutouts() {
        return putouts;
    }

    public void setPutouts(int putouts) {
        this.putouts = putouts;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getErrors() {
        return errors;
    }

    public void setErrors(int errors) {
        this.errors = errors;
    }

    public int getFieldingOpportunities() {
        return fieldingOpportunities;
    }

    public void setFieldingOpportunities(int fieldingOpportunities) {
        this.fieldingOpportunities = fieldingOpportunities;
    }

    public char getThrowingHand() {
        return throwingHand;
    }
    
    
}
