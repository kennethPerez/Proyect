/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author kenneth
 */
public class Coordinator extends Person {
        private String code;
        private int pin;

    /**
     *
     * @param code
     * @param pin
     * @param name
     * @param identity
     * @param age
     */
    public Coordinator(String code, int pin, String name, String identity, int age) {
        super(name, identity, age);
        this.code = code;
        this.pin = pin;
    }


    /**
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    /**
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     *
     * @return
     */
    public int getPin() {
        return pin;
    }

    /**
     *
     * @param pin
     */
    public void setPin(int pin) {
        this.pin = pin;
    }

  
    
    
   public static ArrayList<Coordinator> listcoordinator=new ArrayList();
;
    @Override
    public void output() {
        int i=0;
        System.out.println("--------------------------Coordinator--------------------------");
        while(i<listcoordinator.size()){
            if(listcoordinator.get(i).getIdentity()==this.getIdentity()){
                System.out.println("Name: "+listcoordinator.get(i).getName()+"\n"+"Identity: "+listcoordinator.get(i).getIdentity()+
                        "\n"+"Code:"+listcoordinator.get(i).getCode()+"\n"+"Pin: "+listcoordinator.get(i).getPin() +"\n"+"Age: "+listcoordinator.get(i).getAge());
            }
            i++;
        }
        
    }

    @Override
    public void insert() {
        listcoordinator.add(this);
    }

    @Override
    public void delete(String identity) {
        
    }
    
    
}
