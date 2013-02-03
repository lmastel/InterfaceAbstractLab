package lab2;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class AdvancedJavaCourse implements CourseCatalog {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;
    
    //original constructor
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.setCourseName(courseName);
        this.setCourseNumber(courseNumber);
    }

    //original code
    public final void setCourseName(String courseName) {
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

    //original code that validates courseNumber
    public final void setCourseNumber(String courseNumber) {
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

    //original code that validates credits
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    //original code
    public double getCredits() {
        return credits;
    }

    //original code that validates prerequisites
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

    //carried over from lab1
    public String getCapitalizedCourseName() {
        return this.getCourseName().toUpperCase();
    }

    @Override
    public String toString() {
        return "AdvancedJavaCourse{" + "courseName=" + courseName + ", courseNumber=" + courseNumber + ", credits=" + credits + ", prerequisites=" + prerequisites + '}';
    }

    
    

    
}
