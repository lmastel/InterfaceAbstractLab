
package lab3baseballsimulation;


//This class contains basic baseball player data and is the most generic class in the
//baseball simulation project.
public abstract class BaseballPlayer {
    private String team;
    private String name;
    private String birthdate;
    
    //This method pulls a season's statistics for the baseball player from
    //a database
    public abstract void setStatistics(String team, String name, int season);

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    
    
}
