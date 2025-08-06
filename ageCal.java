package myproject;
import java.util.*;
import java.time.LocalDate;
import java.time.Period;
public class ageCal 
{
	public static void main(String args[])
	{
		Scanner a=new Scanner(System.in);
		System.out.print("Enter your Year of birth(YYYY)");
		int y=a.nextInt();
		System.out.print("Enter your Month of birth(MM)");
		int m=a.nextInt();
		System.out.print("Enter your Date of birth(DD)");
		int da=a.nextInt();
        LocalDate birthDate = LocalDate.of(y, m, da);
        LocalDate currentDate = LocalDate.now();
        Period p = Period.between(birthDate, currentDate);
        System.out.println("You are " + p.getYears() + " years, " + p.getMonths() + " months, and " + p.getDays() + " days old.");
        
        a.close();
		
	}
}
