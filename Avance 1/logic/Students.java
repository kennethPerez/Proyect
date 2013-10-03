/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author CH
 */
public class Students extends Person{
    
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
    public Students(String code, int pin, String name, String identity, int age) {
        super(name, identity, age);
        this.code = code;
        this.pin = pin;
    }

    
    
    public static ArrayList<Students> liststudents= new ArrayList();

  

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



    @Override
    public void output() {
        int i=0;
        System.out.println("--------------------------Estudiantes--------------------------");
        while(i<liststudents.size()){
            if(liststudents.get(i).code.equals(this.code)){
                System.out.println("Name: "+liststudents.get(i).getName()+"\n"+"Idetity: "+liststudents.get(i).getIdentity()+
                        "\n"+"Code: "+liststudents.get(i).getCode()+"\n"+
                        "Pin: "+liststudents.get(i).getPin()+"\n" +"Age: "+liststudents.get(i).getAge());}
            i++;
        }
        
    }

    @Override
    public void insert() {
        liststudents.add(this);
        
    }

    @Override
    public void delete(String identity) {
        int i=0;
        while(liststudents.size()>i){
            if(liststudents.get(i).getIdentity().equals(identity)){
                 liststudents.remove(i);}
            i++;}
        
    }
    
    

   
        
        
        
        
        
    
}

