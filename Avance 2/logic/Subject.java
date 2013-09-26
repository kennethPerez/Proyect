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
    private int number_credits;

    /**
     *
     * @param name
     * @param number_credits
     */
    public Subject(String name, int number_credits) {
        this.name = name;
        this.number_credits = number_credits;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getNumber_credits() {
        return number_credits;
    }

    /**
     *
     * @param number_credits
     */
    public void setNumber_credits(int number_credits) {
        this.number_credits = number_credits;
    }
    
    
    
    
    
}
