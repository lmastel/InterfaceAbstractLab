
package lab3baseballsimulation;


//This interface class is used to provide flexibility due to the fact that
//position players are strictly fielders but that pitchers provides a type of
//defense through pitching skill and is a defensive player who also
//plays the role of a fielder.
public interface Fielder {
    
    void setThrowingHand (char throwingHand);
    
    void setPositionArray (int[] positionNumber);
    
    void setFieldingPercentage (int fieldingOpportunities, int errors);
    
    double getFieldingPercentage();
}
