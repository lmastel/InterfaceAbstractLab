
package lab3baseballsimulation;


//This interface class is provided because an offensive player in baseball is
//called the batter. When a batter gets on base the person is still an
//offensive player and also plays the role of baserunner. This class provides
//methods that can be used to move a baserunner around the bases.
public interface BaseRunner {   

    void setStealSuccessPercentage(int stealAttempts, int caughtStealing);
}
