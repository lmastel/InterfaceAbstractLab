package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroToProgrammingCourse implements CourseCatalog {
    private String courseName;
    private String courseNumber;
    private double credits;
    
    //original code
    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    //original code
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    

    //original code
    public String getCourseName() {
        return courseName;
    }

    //original code
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
   

    //original code
    public String getCourseNumber() {
        return courseNumber;
    }

    //original code
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    //no implementation in original
    public void setPrerequisites(String prerequisites) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    //no implementation ion original
    public String getPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //no implementation in original
    public String getCapitalizedCourseName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}
