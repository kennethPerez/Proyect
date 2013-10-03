
package logic;

import java.util.ArrayList;

public class ClassroomPractical extends Classroom{
        private String amountOfEquipment;
        private String type;
        public static ArrayList<ClassroomPractical> listClassroomPractical = new ArrayList();

    /**
     *
     * @param amountOfEquipment
     * @param type
     * @param name
     * @param number
     * @param location
     * @param capacity
     */
  
    public ClassroomPractical(String amountOfEquipment,String type, String name, String number, String location, String capacity) {
    super(name, number, location, capacity);
    this.amountOfEquipment = amountOfEquipment;
    this.type=type;
    }

        

    /**
     *
     * @return
     */
    public String getAmountOfEquipment() {
        return amountOfEquipment;
    }

    /**
     *
     * @param amountOfEquipment
     */
    public void setAmountOfEquipment(String amountOfEquipment) {
        this.amountOfEquipment = amountOfEquipment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void insert(){
        listClassroomPractical.add(this);
    }
    
    
}
