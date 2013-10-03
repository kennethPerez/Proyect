
package logic;
import grafic.*;

public class main {
    public static Principal principalW = new Principal();
    public static ScheduleW scheduleW = new ScheduleW();
    public static CoordinatorW coordinatorW= new CoordinatorW();
    public static AddPerson addPersonW  = new AddPerson();
    public static AddClassroom addClassroom  = new  AddClassroom();
    public static AddTheoreticalSubject addTheoreticalSubject = new AddTheoreticalSubject();
    public static AddPracticalSubject addPracticalSubject = new AddPracticalSubject();
    public static String Name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Students e1= new Students("1",1,"4", "Carlos", "2-698-977", 21);
        e1.insert();
        Professor p1= new Professor("2",2,"Manfred", "2-456-345", 32);
        p1.insert();
        Coordinator c1= new Coordinator("3",3,"Kenneth", "2-456-345", 32);
        c1.insert();
        
       new Principal().setVisible(true);
       
    }
}
