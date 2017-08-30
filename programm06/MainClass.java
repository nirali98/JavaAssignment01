/*

*/
import java.util.Scanner;


class Matrix
{
	Scanner sc=new Scanner(System.in);
	public int row,column;
	private int m[][];
	
	Matrix(Matrix m1,Matrix m2)
	{
		row=m1.row;
		column=m1.column;
		m=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				this.m[i][j] = m1.getValue(i,j)+m2.getValue(i,j);
			}
		}
	}
	
	Matrix()
	{
		
	}
	Matrix(int r,int c)
	{
		m=new int[r][c];
		row=r;
		column=c;
	}
	Matrix(Matrix mx)
	{
		row=mx.row;
		column=mx.column;
		m=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				this.m[i][j] = mx.getValue(j,i);
			}
		}
	}
	
	int getValue(int i,int j)
	{
		if(i>=row)
			return -1;
		if(j>=column)
			return -1;
		return m[i][j];
	}
	void getData()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the element : ");
				m[i][j] = sc.nextInt();
			}
		}
	}
	void printData()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}
	}
}

class MainClass{
	public static void main(String args[])
	{
		int x,y;
		Matrix m = new Matrix(3,3);
		m.getData();
		x=2;
		y=5;
		System.out.println("\nMatrix:");
		m.printData();
		Matrix mt = new Matrix(m);
		System.out.println("\nTranpose of Matrix:");
		mt.printData();
		System.out.println("\nAddition of Matrix:");
		Matrix ma = new Matrix(m,mt);
		ma.printData();
	}
}
