/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author kenneth
 */
public class Professor extends Person {
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
    public Professor(String code, int pin, String name, String identity, int age) {
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

  
    
    
   public static ArrayList<Professor> listprofessor=new ArrayList();
;
    @Override
    public void output() {
        int i=0;
        System.out.println("--------------------------Profesores--------------------------");
        while(i<listprofessor.size()){
            if(listprofessor.get(i).getIdentity()==this.getIdentity()){
                System.out.println("Name: "+listprofessor.get(i).getName()+"\n"+"Identity: "+listprofessor.get(i).getIdentity()+
                        "\n"+"Code:"+listprofessor.get(i).getCode()+"\n"+"Pin: "+listprofessor.get(i).getPin() +"\n"+"Age: "+listprofessor.get(i).getAge());
            }
            i++;
        }
        
    }

    @Override
    public void insert() {
        listprofessor.add(this);
        
    }

    @Override
    public void delete(String identity) {
        
    }
    
    
}
