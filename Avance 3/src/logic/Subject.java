/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author 
 */
public class Subject {
    private String name;
    private String number_credits;
    private String Semester;

    public Subject(String name, String number_credits, String Semester) {
        this.name = name;
        this.number_credits = number_credits;
        this.Semester = Semester;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber_credits() {
        return number_credits;
    }

    public void setNumber_credits(String number_credits) {
        this.number_credits = number_credits;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    
    
    
}
