package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends CourseCatalog{
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    //moved to superclass
//    public String getCourseNumber() {
//        return courseNumber;
//    }

    //moved to superclass
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

    //moved to superclass
//    public double getCredits() {
//        return credits;
//    }

//moved to superclass
//    public String getPrerequisites() {
//        return prerequisites;
//    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    //implements abstract method from CoursCatalog    
    public void setCredits(double credits) {
        //correction of logic to match error message after validating with
        //admissions and computer science department    
        //if(credits < 0 || credits > 5.0) {
          if(credits < 0.5 || credits > 4.0){  
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
    }

}
