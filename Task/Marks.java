// Write a program to calculate sum of 5 subjects & find the percentage Subject marks.
public class Marks 
{
	public static void main(String[] args) 
	{
		int Gujarati = 65;
		int English = 57;
		int Maths = 63;
		int Science = 64;
		int Social_science = 68;
		int Sanskrit = 66;
		int Computer = 70;
		double total = 0;
		
		// Sum of all subjects
		 total = Gujarati + English + Maths + Science + Social_science + Sanskrit + Computer;
		System.out.println( total );

		// Percentage of total marks is 
		double pr = total / 700 * 100  ;
		System.out.println(pr);
		
	}
}
