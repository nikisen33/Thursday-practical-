import java.util.Scanner;
class ElectricityBill
{
   public static void main(String args[])
   {
     int u, Bill;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the numbers of units:");
     u =sc.nextInt();

     if (u<=100)
	{
	  Bill= u*10;
	  System.out.println("Amount of bill is:" +Bill);
        }
      else if (u<=200)
	{
	 Bill= (100*10)+(u-100)*15;
	  System.out.println("Amount of bill is:" +Bill);
	}
      else if (u<=300)
	{
	 Bill= (100*10)+(100*15)+(u-200)*20;
	  System.out.println("Amount of bill is:" +Bill);
	}
        else if (u>300)
	{
	 Bill= (100*10)+(100*15)+(100*20)+(u-300)*25;
	  System.out.println("Amount of bill is:" +Bill);
	}
   }
}