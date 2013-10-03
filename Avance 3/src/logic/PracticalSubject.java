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
public class PracticalSubject extends Subject{
        private String supportMaterial;
        private String operatingSystem;
        
        public static ArrayList<PracticalSubject> listpracticalSubject  = new ArrayList();

    /**
     *
     * @param supportMaterial
     * @param operatingSystem
     * @param name
     * @param number_credits
     */
    public PracticalSubject(String supportMaterial, String operatingSystem, String name, String number_credits, String Semester) {
        super(name, number_credits, Semester);
        this.supportMaterial = supportMaterial;
        this.operatingSystem = operatingSystem;
    }

    /**
     *
     * @return
     */
    public String getSupportMaterial() {
        return supportMaterial;
    }

    /**
     *
     * @param supportMaterial
     */
    public void setSupportMaterial(String supportMaterial) {
        this.supportMaterial = supportMaterial;
    }

    /**
     *
     * @return
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     *
     * @param operatingSystem
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
        
    public void insert(){
        listpracticalSubject.add(this);
    }
    
}
