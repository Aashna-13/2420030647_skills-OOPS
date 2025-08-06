package myproject;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class loginTime
{
	 public static void main(String[] args) 
	 {   
	        LocalTime officeStart = LocalTime.of(9, 0);
	        LocalTime officeEnd = LocalTime.of(18, 0);
  
	        LocalTime loginTime = LocalTime.of(9, 15);
	        LocalTime logoutTime = LocalTime.of(17, 45);
 
	        LocalTime currentTime = LocalTime.now();
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");
	        System.out.println("Current Time: " + currentTime.format(formatter));
 
	        if (!loginTime.isBefore(officeStart) && !loginTime.isAfter(officeEnd)) 
	        {
	            System.out.println("Employee logged in during office hours at " + loginTime.format(formatter));
	        } 
	        else 
	        {
	            System.out.println("Employee did NOT log in during office hours.");
	        }
	        
	        Duration workDuration = Duration.between(loginTime, logoutTime);
	        long hours = workDuration.toHours();
	        long minutes = workDuration.toMinutes() % 60;

	        System.out.println("Total Working Time: " + hours + " hours and " + minutes + " minutes");
	    }
}


