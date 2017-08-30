/*Calculate interest amount, total payable amount and payable amount per month
*/

/*	algorithm

set loan_amount=39990;
claculate 14% interst for 3 years;
interest=(p*r*n)/100;	//(39990*14*3)/100;

total_payable_amount=loan_amount+interest;

monthly_payable_amount=total_payable_amount/12;

print interest,total_payable_amount,monthly_payable_amount;

*/

//import java.util.Scanner;

class Loan
{
	int num_of_years;
	int amount;
	double interest;
	double total_payable_amount,monthly_payable_amount;
	
	void setdata(int amount,int n)
	{
		this.amount=amount;
		this.num_of_years=n;
	}
	
	void calculate_interest()
	{
		interest=(amount*14*num_of_years)/100;
	}
	
	void calculate_total_amount()
	{
		total_payable_amount=amount+interest;
	}
	
	void calculate_monthly_amount()
	{
		monthly_payable_amount=total_payable_amount/12;
	}
	
	void display()
	{
		System.out.println("Loan amount is:"+amount);
		System.out.println("Interest on loan amount is:"+interest);
		System.out.println("Total payable amount is:"+total_payable_amount);
		System.out.println("monthly amount is:"+monthly_payable_amount);
	}
	
}

class MainClass{
	public static void main(String args[])
	{
		
		Loan loanobj=new Loan();
		loanobj.setdata(39990,3);
		
		loanobj.calculate_interest();
		loanobj.calculate_total_amount();
		loanobj.calculate_monthly_amount();
		loanobj.display();
		
	}
}

