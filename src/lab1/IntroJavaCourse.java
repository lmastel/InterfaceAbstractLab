package lab1;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends CourseCatalog{
    //moved to superclass- String courseName;
    //moved to superclass- private String courseNumber;
    private double credits;
    //moved to superclass- private String prerequisites;

    //When the IntroJavaCourse object is created in the Demo main class
    //the courseName and courseNumber are passed to this constuctor and are
    //subsequently passed to the corresponding superclass setters so that
    //the data can be validated.
    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    //moved to superclass
//    public String getCourseNumber() {
//        return courseNumber;
//    }

    //moved to superclass
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

    
    public double getCredits() {
        return credits;
    }

//moved to superclass
//    public String getPrerequisites() {
//        return prerequisites;
//    }

//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }

    //implements abstract method from CourseCatalog    
    public void setCredits(double credits) {
        //correction of logic to match error message. However this correction
        //needs to be validated with the appropriate departments.    
        //if(credits < 0 || credits > 5.0) {
          if(credits < 0.5 || credits > 4.0){  
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        //removed- this.setCredits(credits);
          this.credits = credits;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "IntroJavaCourse{" + "credits=" + credits + '}';
    }

    
}
