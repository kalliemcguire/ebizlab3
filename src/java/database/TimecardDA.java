//creating all timecards for hourly employees in this class
package database;

import domain.Timecard;
import java.util.*;


public class TimecardDA {
    
    private static ArrayList<Timecard> timecards = new ArrayList<Timecard>();
    
    public static void add(Timecard tc) {
        tc.setTimecardId(timecards.size());
        timecards.add(tc);
    }
    
    // create find method, pass timecardId as parameter
    //create update method
    //maybe create delete method
    
    public static void initialize() {

        Timecard t;
        Calendar c;
        c = Calendar.getInstance();
                                
        t = new Timecard();
        c.set(2022, 01, 15);
        t.setDate(c.getTime());
        t.setEmployeeId(103);
        t.setHoursWorked(40);
        t.setOvertimeHours(5);
        
        timecards.add(t);
        
        t = new Timecard();
        c.set(2022, 01, 16);
        t.setDate(c.getTime());
        t.setEmployeeId(103);
        t.setHoursWorked(30);
        t.setOvertimeHours(5);
        
        timecards.add(t);
               
        t = new Timecard();
        c.set(2022, 01, 15);
        t.setDate(c.getTime());
        t.setEmployeeId(104);
        t.setHoursWorked(35);
        t.setOvertimeHours(3);
        
        timecards.add(t);  
        
        t = new Timecard();
        c.set(2022, 01, 16);
        t.setDate(c.getTime());
        t.setEmployeeId(104);
        t.setHoursWorked(36);
        t.setOvertimeHours(3);
        
        timecards.add(t);
    }
    
    public static ArrayList<Timecard> getTimecards() {
        return timecards;
    }
    
    public static ArrayList<Timecard> getEmployeeTimecards(int employeeId) {
        ArrayList<Timecard> timecardsToGet = Timecard.getTimecards();
        ArrayList<Timecard> employeeTimecards = new ArrayList<>();
        System.out.println("Timecard.getEmployeeTimecards  size of timecards = " + timecardsToGet.size());
        
        for (int i = 0; i < timecardsToGet.size(); i++) {
            Timecard r = new Timecard();
            if(employeeId == timecardsToGet.get(i).getEmployeeId())
            r = timecardsToGet.get(i);
          employeeTimecards.add(r);
        }
        System.out.println("Timecard.getEnployeeTimecards  size of employeeTimecards = " + employeeTimecards.size());
        return employeeTimecards;
    }
}