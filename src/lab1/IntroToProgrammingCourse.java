package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES!
 * Do not change this fact.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse extends CourseCatalog {
    //moved to superclass- private String courseName;
    //moved to superclass- private String courseNumber;
    private double credits;

    //When the IntroToProgrammingCourse object is created in the Demo main class
    //the courseName and courseNumber are passed to this constuctor and are
    //subsequently passed to the corresponding superclass setters so that
    //the data can be validated.
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);      

    }

    //moved to superclass
//    public String getCourseNumber() {
//        return courseNumber;
//    }

    //moved to superclass
//    public final void setCourseNumber(String courseNumber) {
//        if(courseNumber == null || courseNumber.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseNumber cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseNumber = courseNumber;
//    }

    
    //implements abstract method from CourseCatalog
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
        
    }
    
    public double getCredits() {
        return credits;
    }

    //moved to superclass
//    public String getCourseName() {
//        return courseName;
//    }

//    method now in superclass
//    public final void setCourseName(String courseName) {
//        if(courseName == null || courseName.length() == 0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: courseName cannot be null of empty string");
//            System.exit(0);
//        }
//        this.courseName = courseName;
//    }

    @Override
    public String toString() {
        return super.toString() + 
                "IntroToProgrammingCourse{" + "credits=" + credits + '}';
    }

    
}
