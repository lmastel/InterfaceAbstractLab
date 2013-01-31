
package lab1;

import javax.swing.JOptionPane;


public abstract class CourseCatalog {
    private String courseName;
    //implemented in subclasses private double credits;
    
    private String courseNumber;
    private String prerequisites;

    //IntroToProgrammingCourse- set by constructor and by the following code
    //which validates courseName which is best practice
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    //IntroJavaCourse- set by constructor, no setter
    
    //AdvancedJavaCourse - set by constructor and by the following code
    //which doesn't validate courseName
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
    
    //IntroToProgrammingCourse - will use this one for all subclasses and make final
    public final String getCourseName() {
        return courseName;
    }
    //IntroJavaCourse- missing
    //AdvancedJavaCourse-
//    public String getCourseName() {
//        return courseName;
//    }
    
    
    //IntroToProgramming-set by constructor and by the following code
    //validates courseNumber which is best practice
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    //IntroJavaCourse-wset by constructor and by the following code
    //doesn't validate courseNumber so will not be used
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
    //AdvancedJavaCourse-set by constructor and by the following code
    //doesn't validate courseNumber so will not be used
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
    
    //IntroToProgrammingCourse- will move this getter to superclass and remove
    //from subclasses and also will make final
    public final String getCourseNumber() {
        return courseNumber;
    }
    //IntroJavaCourse-
//    public String getCourseNumber() {
//        return courseNumber;
//    }
    //AdvancedJavaCourse-
//    public String getCourseNumber() {
//        return courseNumber;
//    }
    
    
    //setCredits method- I will make abstract because implementation differs
    //in subclasses and logic errors
    public abstract void setCredits(double credits);
    //IntroToProgrammingCourse- 
//    public void setCredits(double credits) {
//        if(credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.credits = credits;
//    }
    //IntroJavaCourse-logic conflicts with error message,
//    public void setCredits(double credits) {
//        if(credits < 0 || credits > 5.0) {
//            System.out.println(
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }
    //AdvancedJavaCourse-
//    public void setCredits(double credits) {
//        if(credits < 0.5 || credits > 4.0) {
//            JOptionPane.showMessageDialog(null,
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }
    
    //IntroToProgrammingCourse-will move from subclasses to superclass and
    //make final
//    public final double getCredits() {
//        return credits;
//    }
    //IntroJavaCourse-
//    public double getCredits() {
//        return credits;
//    }
    //AdvancedJavaCourse- missing getCredits()
    
    //IntroToProgrammingCourse- no setter for prereq
    //IntroJavaCourse-
//    public void setPrerequisites(String prerequisites) {
//        this.prerequisites = prerequisites;
//    }
    //AdvancedJavaCourse-will implement this method from Advance
    //best preactice
    public void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    //IntroToProgrammingCourse-no getter prereq
    //IntroJavaCourse-
    //will implement getter prereq in superclass
    public String getPrerequisites() {
        return prerequisites;
    }
    //AdvancedJavaCourse-
//    public String getPrerequisites() {
//        return prerequisites;
//    }
}
