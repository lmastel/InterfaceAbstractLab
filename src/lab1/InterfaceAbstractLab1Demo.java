
package lab1;


public class InterfaceAbstractLab1Demo {

    
    public static void main(String[] args) {
        //Create an instance of a IntroToProgrammingCourse object.
        //Pass the courseName and courseNumber to the IntroToProgrammingCourse constructor.
        //When the IntroToProgrammingCourse constructor executes it calls the superclass
        //setCourseName and setCourseNumber methods that validate the name and number.
        IntroToProgrammingCourse itpc = new IntroToProgrammingCourse("Introduction to Programming", "Computer Science 101");                
        itpc.setCredits(4.0);        
        itpc.setPrerequisites("None");  
        System.out.println("Capitalized Course Name is " + itpc.getCapitalizedCourseName());
        System.out.println(itpc);
        //System.out.println("itpc getCredits" + itpc.getCredits());
        System.out.println("");
                
        
        //Create an instance of a IntroJavaCourse object.
        //Pass the courseName and courseNumber to the IntroJavaCourse constructor.
        //When the IntroJavaCourse constructor executes it calls the superclass
        //setCourseName and setCourseNumber methods that validate the name and number.        
        IntroJavaCourse ijc = new IntroJavaCourse("Introduction to Java", "Computer Science 201");
        ijc.setCredits(4.0);       
        ijc.setPrerequisites("Introduction to Programming");
        System.out.println("Capitalized Course Name is " + ijc.getCapitalizedCourseName());
        System.out.println(ijc);
        //System.out.println("ijc getCredits" + ijc.getCredits());
        System.out.println("");  
        
        
        
        //Create an instance of a AdvancedJavaCourse object and use the
        //Liskov Substitution Principle. 
        //Pass the courseName and courseNumber to the AdvancedJavaCourse constructor.
        //When the AdvancedJavaCourse constructor executes it calls the superclass
        //setCourseName and setCourseNumber methods that validate the name and number.
        
        //When I defined the variable course with
        //the CourseCatalog data type then course didn't have access to the getCredits method
        //in the AdvancedJavaCourse class. When the variable course was defined with the 
        //AdvancedJavaCourse data type then it did have access to the getCredits method.
        //Although I don't know what I'm talking about I would have to say the two objects do not have
        //exactly the same methods(behaviours). I then experimented some more and added the getCredits method
        //to the superclass CourseCatalog as an abstract method. The course reference variable now 
        //appears to have identical behavior if the dat type is CourseCatalog (superclass) or 
        //AdvancedJavaCourse( subclass).
        CourseCatalog course = new AdvancedJavaCourse("Advanced Java", "Computer Science 301");  
        //AdvancedJavaCourse course = new AdvancedJavaCourse("Advanced Java", "Computer Science 301"); 
        course.setCredits(4.0);                
        course.setPrerequisites("Introduction to Java");   
        System.out.println("Capitalized Course Name is " + course.getCapitalizedCourseName());
        System.out.println(course);
        //System.out.println("course getCredits" + course.getCredits());
        
        
        
        
        
       
        
    }
}
