/*
*/
//import java.util.Scanner;

class Student
{
    // Instance variable or member variable
    private int id ; 
	private String name;
 
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
    void display()
    {
        // This local variable hides instance variable
        int id = 3;
 
        System.out.println("Student id Instance variable :"
                            + this.id);
        System.out.println("Student id of Local variable :"
                            + id);
		System.out.println("Student name: :"
                            + this.name);
    }
}


class MainClass{
	public static void main(String args[])
	{
		Student s=new Student(1,"nirali");
		s.display();
	}
}

