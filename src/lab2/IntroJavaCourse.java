package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse implements CourseCatalog {
    //original code did not make this attribute private
    //String courseName;
    private String courseName;
    private String courseNumber;
    
    //original constructor
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    //method does not exist to original code
    //implementing code that validates coyrseName
    public void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    //does not exist in original code
    public String getCourseName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //original code dies not validate
    public void setCourseNumber(String courseNumber) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //original code
    public String getCourseNumber() {
        return courseNumber;
    }

    //original code does not validate
    public void setCredits(double credits) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //original code does not validate
    public void setPrerequisites(String prerequisites) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //original code
    public String getPrerequisites() {
        return prerequisites;
    }

    //does not exist in original code
    public String getCapitalizedCourseName() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    
}
