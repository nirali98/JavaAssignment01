/*
*/
import java.util.Scanner;

class Student
{
	
	protected int id;
	protected String name;
	public Scanner sc=new Scanner(System.in);
	
	Student()
	{
		
	}
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
}

class Marks extends Student
{
	protected int m[]=new int[5];
	
	
}

class Result extends Marks
{
	int total;
	double per;
	String grade;
	void enterMarks()
	{
		
	}
}


class MainClass{
	public static void main(String args[])
	{
			
	}
}

