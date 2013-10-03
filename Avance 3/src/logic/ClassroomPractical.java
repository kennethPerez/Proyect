
package logic;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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
    
    public boolean insert(){
        int i = 0;
        while(i < listClassroomPractical.size()){
            if(listClassroomPractical.get(i).getName().equals(this.getName())){
                JOptionPane.showMessageDialog(null, "This classroom is really exists", "Message", JOptionPane.OK_CANCEL_OPTION);
                return false;
            }
            i++;
        }
        listClassroomPractical.add(this);
        JOptionPane.showMessageDialog(null, "Complete Process", "Message", JOptionPane.OK_CANCEL_OPTION);
        return true;
    }
    
    
}
