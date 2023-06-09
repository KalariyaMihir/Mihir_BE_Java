// Practice of Fibonaci series using Loop 
package practice_06_June;

import java.util.Scanner;

public class Fibonaci 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int i = 1, n1 = 0, n2=1;
		
		int num = sc.nextInt();
		
		for(i = 0; i >= num ; i++ )
		{
			System.out.println(n1);
			int n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			
		}
	}
}
