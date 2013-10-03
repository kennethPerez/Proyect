/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Semester {
    private int number;
    private ArrayList<Subject> subjects;

    /**
     *
     * @param number
     */
    public Semester(int number){
        this.number = number;
        this.subjects = new ArrayList();
    }

    /**
     *
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     *
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     *
     * @return
     */
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    /**
     *
     * @param subjects
     */
    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }
    
    
    
}
