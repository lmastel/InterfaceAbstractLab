
package lab2;


public interface CourseCatalog {
    
    void setCourseName(String courseName); 
    
    String getCourseName(); 
    
    void setCourseNumber(String courseNumber); 
    
    String getCourseNumber();
        
    void setCredits(double credits);
    
    void setPrerequisites(String prerequisites); 
    
    String getPrerequisites(); 
    
    String getCapitalizedCourseName(); 
    
    String toString();     
    
}
