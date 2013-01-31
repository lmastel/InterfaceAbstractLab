
package lab1;


public class InterfaceAbstractLab1Demo {

    
    public static void main(String[] args) {
        CourseCatalog cc = new IntroToProgrammingCourse("Introduction to Programming", "Computer Science 101");
        System.out.println("Course Name is " + cc.getCourseName());
        System.out.println("Cousre Number is " + cc.getCourseNumber());
    }
}
