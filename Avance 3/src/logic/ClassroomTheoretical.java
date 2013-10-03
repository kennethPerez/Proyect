/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;


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
        
    public void insert(){
        listTheoreticalClassroom.add(this);
    }    
    
}
