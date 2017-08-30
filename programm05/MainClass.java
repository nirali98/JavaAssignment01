/*
Wap that finds a key value from the array and show result as successful search or not.
*/

/*
create an array
take input
ask for key to search
search

*/
import java.util.Scanner;

class MainClass{
	public static void main(String args[])
	{
		int hay[]=new int[5];
		int needle,key=-1,i;
		Scanner sc=new Scanner(System.in);
		
		for (i = 0; i < 5; i++) 
		{
			System.out.print("Enter the element " + (i+1) + " : ");
		        hay[i] = sc.nextInt();
		}
		/*
		for ( i = 0; i < 5; i++) 
		{
			System.out.println("element "+(i+1)+":"+hay[i]);
		        
		}
		//*/
		System.out.print("Enter key to search element: ");
		        needle = sc.nextInt();
				
		for ( i = 0; i < 5; i++) 
		{
				if(hay[i]==needle)
				{
					key=i;
					break;
				}    
				
		}
		
		if(key==-1)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("Key found at: "+(key+1));
		}
		//close input
		sc.close();		
	}
}

