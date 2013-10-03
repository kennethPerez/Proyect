/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author Kenneth
 */
public abstract class Person {
    private String name;
    private String identity;
    private int age;

    /**
     *
     * @param name
     * @param identity
     * @param age
     */
    public Person(String name, String identity, int age) {
        this.name = name;
        this.identity = identity;
        this.age = (byte) age;
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
    public String getIdentity() {
        return identity;
    }

    /**
     *
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }

    /**
     *
     * @return 
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    
    /**
     *
     */
    public abstract void output();
   
  
    /**
     *
     */
    public abstract void insert();
    
    /**
     *
     * @param identity
     */
    public abstract  void delete(String identity);
    
    
    
    
}