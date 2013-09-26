
package logic;

import java.util.ArrayList;

public class ClassroomPractical extends Classroom{
        private int amountOfEquipment;
        private ArrayList<String> listEquipment;

    /**
     *
     * @param amountOfEquipment
     * @param name
     * @param number
     * @param location
     * @param capacity
     */
  
    public ClassroomPractical(int amountOfEquipment, String name, int number, String location, int capacity) {
    super(name, number, location, capacity);
    this.amountOfEquipment = amountOfEquipment;
    this.listEquipment = new ArrayList<>();
    }

        

    /**
     *
     * @return
     */
    public int getAmountOfEquipment() {
        return amountOfEquipment;
    }

    /**
     *
     * @param amountOfEquipment
     */
    public void setAmountOfEquipment(int amountOfEquipment) {
        this.amountOfEquipment = amountOfEquipment;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getListEquipment() {
        return listEquipment;
    }

    /**
     *
     * @param listEquipment
     */
    public void setListEquipment(ArrayList<String> listEquipment) {
        this.listEquipment = listEquipment;
    }
    
    
        
        
        
    
}
