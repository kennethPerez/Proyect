/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class PracticalCourse extends Course{
        private String supportMaterial;
        private String operatingSystem;
        
        public static ArrayList<PracticalCourse> listpracticalSubject  = new ArrayList();

    /**
     *
     * @param supportMaterial
     * @param operatingSystem
     * @param name
     * @param number_credits
     */
    public PracticalCourse(String supportMaterial, String operatingSystem, String name, String number_credits, String Semester) {
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
        
    public boolean insert(){
        int i = 0;
        while(i < listpracticalSubject.size()){
            if(listpracticalSubject.get(i).getName().equals(this.getName())){
                JOptionPane.showMessageDialog(null, "This Subject is really exists", "Message", JOptionPane.OK_CANCEL_OPTION);
                return false;
            }
            i++;
        }
        listpracticalSubject.add(this);
        JOptionPane.showMessageDialog(null, "Complete Process", "Message", JOptionPane.OK_CANCEL_OPTION);
        return true;
    }   
    
}
