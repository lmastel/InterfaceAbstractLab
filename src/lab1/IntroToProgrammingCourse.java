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
    //moved to superclass private String courseName;
    //moved to superclass private String courseNumber;
    //moved to superclass private double credits;

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
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

    //moved to superclass
//    public double getCredits() {
//        return credits;
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

    
}
