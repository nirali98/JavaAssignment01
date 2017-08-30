

class Matrix
{
	Scanner sc=new Scanner(System.in);
	public int row,column;
	private int data[][];
	
	
	Matrix(Matrix source)
	{
		row=column=3;
		data = new int[3][3];
		// this.data = source.data;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				this.data[i][j] = source.getValue(j,i);
			}
		}
	}
	
	Matrix()
	{
		row=column=3;
		data = new int[3][3];
	}
	int getValue(int i, int j)
	{
		return data[i][j];
	}
	void getData()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print("Enter the element : ");
				this.data[i][j] = sc.nextInt();
			}
		}
	}
	void printData()
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(this.data[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}

class MainClass{
	public static void main(String args[])
	{
		Matrix mobject = new Matrix();
		mobject.getData();
		mobject.printData();
		System.out.print("\n\n copy:\n\n");
		Matrix copyobj = new Matrix(mobject);
		copyobj.printData();
	}
}

