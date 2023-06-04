// Write a Program to check the given year is leap year or not.
public class Leap_year
{
	public static void main(String[] args)
	{
		int year = 2001;
		
		// if else for check condition 
		if (year % 400 == 0) 
		{
			System.out.println("Given Year is Leap Year");
		}
		else if(year % 100 == 0)
		{
			System.out.println("Given Year is Not Leap Year");
		}
		
		else if (year % 4 == 0) 
		{
			System.out.println("Given Year is Leap Year");
		}
		
		else
		{
			System.out.println("Given Year is Not Leap Year");
		}
	}
}
