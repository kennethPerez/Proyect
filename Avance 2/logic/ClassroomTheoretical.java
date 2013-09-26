/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


public class ClassroomTheoretical extends Classroom{
        private boolean airContioning;
        private boolean multimediaEquipment;

    /**
     *
     * @param airContioning
     * @param multimediaEquipment
     * @param name
     * @param number
     * @param location
     * @param capacity
     */
    public ClassroomTheoretical(boolean airContioning, boolean multimediaEquipment, String name, int number, String location, int capacity) {
        super(name, number, location, capacity);
        this.airContioning = airContioning;
        this.multimediaEquipment = multimediaEquipment;
    }

    /**
     *
     * @return
     */
    public boolean isAirContioning() {
        return airContioning;
    }

    /**
     *
     * @param airContioning
     */
    public void setAirContioning(boolean airContioning) {
        this.airContioning = airContioning;
    }

    /**
     *
     * @return
     */
    public boolean isMultimediaEquipment() {
        return multimediaEquipment;
    }

    /**
     *
     * @param multimediaEquipment
     */
    public void setMultimediaEquipment(boolean multimediaEquipment) {
        this.multimediaEquipment = multimediaEquipment;
    }
        
        
    
}
