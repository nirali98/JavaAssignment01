/*
swap value of three variable without using another temporary variable

**********example**********
var a=1,b=2,c=3;
after swap should be a=3,b=1,c=2;

*******algorythm**********
	// swap (a and b); //after swap a=2, b=1, c=3
		b= a+b;
		a=b-a;
		b= b-a;
	// swap (a and c); //after swap a=3, b=1, c=2
		c= a+c;
		a=c-a;
		c= c-a;
*/
import java.util.Scanner;

class MainClass{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Enter value of a:"); 
		a = sc.nextInt();
		System.out.println("Enter value of b:"); 
		b = sc.nextInt();
		System.out.println("Enter value of c:");
		c = sc.nextInt();
		
		//swap a and b
		b= a+b;
		a=b-a;
		b= b-a;
		
		//swap a and b
		a= c+a;
		c=a-c;
		a= a-c;
		
		//print values after swap
		System.out.println("a:"+a+" b:"+b+" c:"+c);  
		
		//close input
		sc.close();		
	}
}

