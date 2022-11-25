import java.util.Scanner;
class DiscountAndPrice
{
   public static void main(String args[])
   {
     float cost, payment, Discount;
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the amount:");
     cost =sc.nextFloat();

     if(cost<=800)
	{	
	  payment=cost;
	 System.out.println("No Discount");
	 System.out.println(payment);
	}
     else if(cost>800 && cost<=1500)
	{
	  Discount= (cost*10)/100;
	  payment= cost- Discount;
	  System.out.println("Discount is 10%:" +Discount);
     	  System.out.println("Amount to be paid:" +payment);
	}
      else if(cost>1500 && cost<=2500)
	{
	  Discount= (cost*15)/100;
	  payment= cost- Discount;
	  System.out.println("Discount is 15%:" +Discount);
     	  System.out.println("Amount to be paid:" +payment);
	}
       else if(cost>2500 && cost<=5000)
	{
	  Discount= (cost*20)/100;
	  payment= cost- Discount;
	  System.out.println("Discount is 20%:" +Discount);
     	  System.out.println("Amount to be paid:" +payment);
	}
       else 
	{
	  Discount= (cost*30)/100;
	  payment= cost- Discount;
	  System.out.println("Discount is 30%:" +Discount);
     	  System.out.println("Amount to be paid:" +payment);
	}
   }
}