
package lab1;


public class InterfaceAbstractLab1Demo {

    
    public static void main(String[] args) {
        IntroToProgrammingCourse itpc = new IntroToProgrammingCourse("Introduction to Programming", "Computer Science 101");
        System.out.println("Course Name is " + itpc.getCourseName());
        System.out.println("Cousre Number is " + itpc.getCourseNumber());
        
        itpc.setCredits(4.0);
        System.out.println("Credits are " + itpc.getCredits());
        
        itpc.setPrerequisites("None");
        System.out.println("Prerequistite(s) are " + itpc.getPrerequisites());
    }
}
