/*
       SCANNER CLASS
*/

import java.util.Scanner;
class MyInformation
{
   public static void main(String args[])
   {
	Scanner sc= new Scanner(System.in);
	
	  System.out.println("ENTER YOUR NAME");
	   String name= sc.next();
	  System.out.println("MY NAME IS:" +name);

	  System.out.println("ENTER YOUR AGE");
	  byte age= sc.nextByte();
	  System.out.println("MY AGE IS:" +age);

	  System.out.println("ENTER YOUR YEAR OF BIRTH");
	  short birth= sc.nextShort();
	  System.out.println("MY YEAR OF BIRTH IS:" +birth);

	  System.out.println("ENTER YOUR PHONE NO.");
	  long num= sc.nextLong();
	  System.out.println("MY PHONE NO. IS:" +num);

	  System.out.println("ENTER YOUR SALARY");
	  double salary= sc.nextDouble();
	  System.out.println("MY SALARY IS:" +salary);
          
	  System.out.println("ENTER YOUR PERCENTAGE IN GRADUATION");
	  float percentage= sc.nextFloat();
	  System.out.println("MY PERCENTAGE IS:" +percentage);
	  
	  System.out.println("ENTER YOUR SECTION");
	  char sec= sc.next().charAt(0);
	  System.out.println("MY SECTION IS:" +sec);

	  System.out.println("ARE YOU FEMALE");
	  boolean gender= sc.nextBoolean();
	  System.out.println(gender);

	  System.out.println("ENTER PINCODE");
	  int pincode= sc.nextInt();
	  System.out.println("MY PINCODE IS:" +pincode);
       }
}
         
	
	
	
	
	
	
	
	