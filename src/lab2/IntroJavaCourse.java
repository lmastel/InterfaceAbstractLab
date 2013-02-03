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
    private double credits;
    private String prerequisites;
    
    //original constructor
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    //method does not exist to original code
    //implementing code that validates courseName
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
        return courseName;
    }

    //original code dies not validate
    //implementing code that validates courseNumber
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

    //original code does not validate
    //implementing code that validates credits
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    //original code does not validate
    //implementing code that validates prerequisites
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    //original code
    public String getPrerequisites() {
        return prerequisites;
    }

    //does not exist in original code
    //carried over from lab1
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public String toString() {
        return "IntroJavaCourse{" + "courseName=" + courseName + ", courseNumber=" + courseNumber + ", credits=" + credits + ", prerequisites=" + prerequisites + '}';
    }
    

    
}
