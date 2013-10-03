/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ClassroomTheoretical extends Classroom{
        private String airContioning;
        private String multimediaEquipment;
        public static ArrayList<ClassroomTheoretical> listTheoreticalClassroom = new ArrayList();

    /**
     *
     * @param airContioning
     * @param multimediaEquipment
     * @param name
     * @param number
     * @param location
     * @param capacity
     */
    public ClassroomTheoretical(String airContioning, String multimediaEquipment, String name, String number, String location, String capacity) {
        super(name, number, location, capacity);
        this.airContioning = airContioning;
        this.multimediaEquipment = multimediaEquipment;
    }

    /**
     *
     * @return
     */
    public String isAirContioning() {
        return airContioning;
    }

    /**
     *
     * @param airContioning
     */
    public void setAirContioning(String airContioning) {
        this.airContioning = airContioning;
    }

    /**
     *
     * @return
     */
    public String isMultimediaEquipment() {
        return multimediaEquipment;
    }

    /**
     *
     * @param multimediaEquipment
     */
    public void setMultimediaEquipment(String multimediaEquipment) {
        this.multimediaEquipment = multimediaEquipment;
    }
        
    public boolean insert(){
        int i = 0;
        while(i < listTheoreticalClassroom.size()){
            if(listTheoreticalClassroom.get(i).getName().equals(this.getName())){
                JOptionPane.showMessageDialog(null, "This classroom is really exists", "Message", JOptionPane.OK_CANCEL_OPTION);
                return false;
            }
            i++;
        }
        listTheoreticalClassroom.add(this);
        JOptionPane.showMessageDialog(null, "Complete Process", "Message", JOptionPane.OK_CANCEL_OPTION);
        return true;
    }    
    
}
