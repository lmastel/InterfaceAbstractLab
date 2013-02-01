
package lab1;


public class InterfaceAbstractLab1Demo {

    
    public static void main(String[] args) {
        //create an instance of a IntroToProgrammingCourse object
        //pass the courseName and courseNumber to the constructor
        //when the superclass constructor executes it validates the passed data
        IntroToProgrammingCourse itpc = new IntroToProgrammingCourse("Introduction to Programming", "Computer Science 101");
        System.out.println("Course Name is " + itpc.getCourseName());
        System.out.println("Cousre Number is " + itpc.getCourseNumber());
        
        itpc.setCredits(4.0);
        System.out.println("Credits are " + itpc.getCredits());
        
        itpc.setPrerequisites("None");
        System.out.println("Prerequistite(s) are " + itpc.getPrerequisites());
        
   
        System.out.println(itpc);
        
        IntroJavaCourse ijc = new IntroJavaCourse("Introduction to Java", "Computer Science 201");
        ijc.setCredits(4.0);
        //System.out.println("Credits are " + ijc.);
        
        ijc.setPrerequisites("Introduction to Programming");
        System.out.println("Prerequistite(s) are " + itpc.getPrerequisites());
        
   
        System.out.println(ijc);
        
        //Liskov Substitution Principle
        CourseCatalog course = new AdvancedJavaCourse("Advanced Java", "Computer Science 301");
              
        course.setCredits(4.0);
                
        course.setPrerequisites("Introduction to Java");
        
        System.out.println(course);
    }
}
