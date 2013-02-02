
package lab1;


public class InterfaceAbstractLab1Demo {

    
    public static void main(String[] args) {
        //create an instance of a IntroToProgrammingCourse object
        //pass the courseName and courseNumber to the IntroToProgrammingCourse constructor
        //when the IntroToProgrammingCourse constructor executes it calls the superclass
        //setCourseName and setCourseNumber methods that validate the name and number
        IntroToProgrammingCourse itpc = new IntroToProgrammingCourse("Introduction to Programming", "Computer Science 101");                
        itpc.setCredits(4.0);        
        itpc.setPrerequisites("None");   
        System.out.println(itpc);
        System.out.println("");
        
        IntroJavaCourse ijc = new IntroJavaCourse("Introduction to Java", "Computer Science 201");
        ijc.setCredits(4.0);       
        ijc.setPrerequisites("Introduction to Programming");
        System.out.println(ijc);
        System.out.println("");
        
        //Liskov Substitution Principle
        CourseCatalog course = new AdvancedJavaCourse("Advanced Java", "Computer Science 301");              
        course.setCredits(4.0);                
        course.setPrerequisites("Introduction to Java");        
        System.out.println(course);
    }
}
