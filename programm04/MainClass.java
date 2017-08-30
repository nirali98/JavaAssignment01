/*
*/

// 0 3 8 15 24 35 48 63 80
// 3 5 7 9 11 13 15 17
import java.util.Scanner;
import java.io.Console;

class MainClass{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Console c = System.console();
		
		int n,sum=0;
		System.out.println("Enter n term:");
		n=sc.nextInt();
		
		System.out.print(0);
		
		for(int i=3;i<=n*2;i+=2)
		{
			sum +=i;
			System.out.print(", "+sum);
		}
		System.out.println();
		c.readLine();
		//close input
		sc.close();		
	}
}

