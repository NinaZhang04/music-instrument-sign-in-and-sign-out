
/*
 * Author: Core Inc (Kyle, Helen, Nina)
 * Class: ICS4U
 * Program: Teacher class
 * Description: Teacher object class with toString 
 */
package music.checkinout.assignment;

/**
 *
 * @author Helen
 */
public class Teacher {
    // declares all the instance variables belonging to the teacher class
    private int teacherID;
    private String password;
    private String firstName;
    private String lastName;
    private String course;
    
    /**
     * the default constructor for a teacher
     */
    public Teacher() {
        // assigns all variables a default value
        teacherID = 0;
        password = " ";
        firstName = " ";
        lastName = " ";
        course = " ";
    }
    
    /**
     * teacher constructor
     * @param id - their teacherID (9 digits)
     * @param p - the password
     * @param fn - their first name
     * @param ln - last name
     * @param c - the course they teach
     */
    public Teacher(int id, String p, String fn, String ln, String c) {
        // assigns all variables to the parameters passed through
        teacherID = id;
        password = p;
        firstName = fn;
        lastName = ln;
        course = c;
    }
    
    /**
     * toString method to print the teacher in a delimited fashion
     * @return the string with all the info
     */
    public String toString(){
        return teacherID + "," + password + "," + firstName + "," + lastName + "," + course;
    }
    
    /**
     * getter method for the teacher's ID
     * @return teacherID
     */
    public int getID(){
        return teacherID;
    }
    
    /**
     * getter method for the teacher's password
     * @return password
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * getter method for the teacher's first name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * getter method for the teacher's last name
     * @return lastName
     */
    public String getLastName(){
        return lastName;
    }
    
    /**
     * getter method for the teacher's course 
     * @return course
     */
    public String getCourse() {
        return course;
    }
    
    // no setter methods to avoid tampering (could be easily added if necessary)
}
