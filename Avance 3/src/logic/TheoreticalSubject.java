/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class TheoreticalSubject extends Subject {
            private String webSite;
            public static ArrayList<TheoreticalSubject> listtheoreticalSubject  = new ArrayList();

    /**
     *
     * @param webSite
     * @param name
     * @param number_credits
     */
    public TheoreticalSubject(String webSite, String name, String number_credits, String Semester) {
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

    public void insert(){
        listtheoreticalSubject.add(this);
    }
            
            
            
}
