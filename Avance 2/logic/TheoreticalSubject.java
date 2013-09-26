/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author 
 */
public class TheoreticalSubject extends Subject {
            private String webSite;

    /**
     *
     * @param webSite
     * @param name
     * @param number_credits
     */
    public TheoreticalSubject(String webSite, String name, int number_credits) {
        super(name, number_credits);
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

    
            
            
            
}
