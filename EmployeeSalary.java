import java.util.Scanner;
class EmployeeSalary
{
	public static void main(String args[])
   {
	int Basicsalary, HRA, DA, GS, incometax, Netsalary;
	System.out.println("Enter the Amount of Basic salary:");
        Scanner sc= new Scanner(System.in);
	
	Basicsalary= sc.nextInt();
        System.out.println("Basic salary is:" +Basicsalary);
 	
        HRA= Basicsalary*10/100;
	System.out.println("House rent allowance is:" +HRA);
	DA= Basicsalary*73/100;
	System.out.println("Dearness allowance is:" +DA);
	GS= Basicsalary+HRA+DA;
	System.out.println("Gs is:" +GS);
	incometax= GS*30/100;
	System.out.println("Income Tax is:" +incometax);
	Netsalary= GS- incometax;
        System.out.println("Net salary is:" +Netsalary);
	
	}
}
