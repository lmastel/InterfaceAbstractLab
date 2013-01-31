package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse extends CourseCatalog {
    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

//moved to superclass
//    public String getPrerequisites() {
//        return prerequisites;
//    }

    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    //implements abstract method from CourseCatalog
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.setCredits(credits);
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
    
}
