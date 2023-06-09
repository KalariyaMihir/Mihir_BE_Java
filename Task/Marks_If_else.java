package practice_06_June;

import java.util.Scanner;

public class Marks_If_else 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Mark : ");
		int mark = sc.nextInt();
		
		if(mark>=70)
		{
			System.out.println("Grade A");
		}
		
		else if (mark >=60)
		{
			System.out.println("Grade B");
		}
		
		else if (mark >= 50)
		{
			System.out.println("Grade C");
		}
		
		else if ( mark >= 35)
		{
			System.out.println("Grade D");
		}
		
		else if (mark <=34)
		{
			System.out.println(" Ooops You have Failed This Exam ");
		}
	}
}
