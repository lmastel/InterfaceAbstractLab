
package lab1;

import javax.swing.JOptionPane;


public abstract class CourseCatalog {
    private String courseName;
    private String courseNumber;
    private String prerequisites;    
    //implemented in subclasses- private double credits;    
    
    public CourseCatalog(){
        //print line just to display the execution of the superclass constructor
        System.out.println("Superclass CourseCatalog Constructor is executing");    
}

    //IntroToProgrammingCourse uses the following code which validates
    //courseName which is a best practice. I will call this method from 
    //the constructors of each subclass. IntroJavaCourse set the courseName in the
    // constructor with no validation and had no setter. AdvancedJavaCourse
    //set the courseName in the constructor and also had a setter both with no
    //validation.
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }    
    
    //IntroToProgrammingCourse and AdvancedJavaCousre use the following code for
    //getCourseName. Code is missing in IntroJavaCourse. I will use this code 
    //for all subclasses and make the method final.
    public final String getCourseName() {
        return courseName;
    }
    
    //IntroToProgrammingCourse uses the following code which validates
    //courseNumber which is a best practice. I will call this method from 
    //the constructors of each subclass. IntroJavaCourse and AdvancedJavaCourse
    //both set the courseNumber in the constructor with no validation and each
    //had a setter with no validation. 
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
        
    //IntroToProgrammingCourse, IntroJavaCourse, and AdvancedJavaCourse
    //all contained the following code. I moved this getter to superclass and removed
    //from the subclasses and also made it final.
    public final String getCourseNumber() {
        return courseNumber;
    }
        
    //setCredits- I will make this method abstract in the superclass because
    //its implementation differs, or might differ, in the subclasses and there 
    //appears to be errors in the IntroJavaCourse class that needs to be rectified. 
    //Either the if statement range check logic is correct and the error message 
    //is incorrect or vice versa.
    public abstract void setCredits(double credits);
    
    public abstract double getCredits();
    
    
     
    //IntroToProgrammingCourse had no setter for Prerequisites.
    //IntroJavaCourse had a setter but without data valdiation.
    //AdvancedJavaCourse has a stter with data validation which is a 
    //best practcice. I will use that code and place it here in the superclass.
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    //IntroToProgrammingCourse had no getter for Prerequisites. 
    //IntroJavaCourse and AdvancedJavaCourse both had the following code
    //that I will implement here in the superclass.
    public String getPrerequisites() {
        return prerequisites;
    }
    
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }
    
    @Override
    public String toString() {
        return "CourseCatalog{" + "courseName=" + courseName + ", courseNumber=" + courseNumber + ", prerequisites=" + prerequisites + '}';
    }
    
    
}
