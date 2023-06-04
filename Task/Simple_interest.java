// WAP to find Simple interest
public class Simple_interest 
{
public static void main(String[] args) 
{
	// a is amount
	int a = 10500;
	
	// b is interest rate
	int b = 12;
	
	// c is time
	int c = 5;
	
	// F for simple interest rate
	int F = ( a * b * c) / 100;
	
	// final amount with interest rate
	int f = F + a;
	
	// print interest rate
	System.out.println(F);
	
	// print final amount with IR
	System.out.println(f);
}
}
