
package logic;
import grafic.*;

public class main {
    public static Principal principalW = new Principal();
    public static ScheduleW scheduleW = new ScheduleW();
    public static CoordinatorW coordinatorW= new CoordinatorW();
    public static AddStudents AddStudentsW= new AddStudents();
    public static String Name;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Students e1= new Students("1",1, "Kenneth", "2-698-977", 21);
        e1.insert();
        e1.output();
        Students e2= new Students("2",2, "Carlos", "2-598-977", 21);
        e2.insert();
        e2.output();
        Professor p1= new Professor("3",3,"Manfred", "2-456-345", 32);
        p1.insert();
        p1.output();
        Coordinator c1= new Coordinator("5",5,"Manfred", "2-456-345", 32);
        c1.insert();
        c1.output();
        
       new Principal().setVisible(true);
       
        
    }
}
