package lab1;

import javax.swing.JOptionPane;


    
    
    
    
/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseCatalog {
    //moved to superclass- String courseName;
    //moved to superclass- private String courseNumber;
    private double credits;
    //private String prerequisites;

    //When the AdvancedJavaCourse object is created in the Demo main class
    //the courseName and courseNumber are passed to this constuctor and are
    //subsequently passed to the corresponding superclass setters so that
    //the data can be validated.
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    //This method appears only in this class, AdvancedJavaCourse, but the 
    //method can be applied to the course names of all subclasses for
    //consistency. I moved it to the superclass.
//    public String getCapitalizedCourseName() {
//        return this.getCourseName().toUpperCase();
//    }

//moved to superclass
//    public String getPrerequisites() {
//        return prerequisites;
//    }

    //moved to superclass
//    public void setPrerequisites(String prerequisites) {
//        if(prerequisites == null || prerequisites.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: prerequisites cannot be null of empty string");
//            System.exit(0);
//        }
//        this.prerequisites = prerequisites;
//    }

    //implements abstract method from superclass CourseCatalog
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        //method calling itself
        //this.setCredits(credits);
        
        this.credits = credits;
    }
    
    //This class was missing getCredits
    public double getCredits(){
        return credits;
    }
    //moved to superclass
//    public String getCourseName() {
//        return courseName;
//    }

//    removed method now in superclass
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }

    //moved to superclass
//    public String getCourseNumber() {
//        return courseNumber;
//    }
    
//moved to superclass
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }

    @Override
    public String toString() {
        return super.toString() +
                "AdvancedJavaCourse{" + "credits=" + credits + '}';
    }

   
                
    
}
