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
public class TheoreticalCourse extends Course {
            private String webSite;
            public static ArrayList<TheoreticalCourse> listtheoreticalSubject  = new ArrayList();

    /**
     *
     * @param webSite
     * @param name
     * @param number_credits
     */
    public TheoreticalCourse(String webSite, String name, String number_credits, String Semester) {
        super(name, number_credits,Semester);
        this.webSite = webSite;
    }

    /**
     *
     * @return
     */
    public String getWebSite() {
        return webSite;
    }

    /**
     *
     * @param webSite
     */
    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public boolean insert(){
        int i = 0;
        while(i < listtheoreticalSubject.size()){
            if(listtheoreticalSubject.get(i).getName().equals(this.getName())){
                JOptionPane.showMessageDialog(null, "This Subject is really exists", "Message", JOptionPane.OK_CANCEL_OPTION);
                return false;
            }
            i++;
        }
        listtheoreticalSubject.add(this);
        JOptionPane.showMessageDialog(null, "Complete Process", "Message", JOptionPane.OK_CANCEL_OPTION);
        return true;
    } 
            
            
            
}
