import java.util.*;
class BankAcc{
	private double bal;
	BankAcc(double bal){
		this.bal=bal;
	}
	
	void contact(double r){
		Scanner sc= new Scanner(System.in);
		System.out.println("Input the verification code");
		String str=sc.next();
		if(str.equalsIgnoreCase("m1234")){
			Interest in=new Interest(r);
			in.getInterest();
		}
		else{
			System.out.println("Unauthorized Access");
		    }
		}

	private class Interest{
		private double rate;
		Interest(double rate){
			this.rate=rate;
		}
		public void getInterest(){
			double interest=bal*rate/100;
			bal+= interest;
			System.out.println("Balance after Interest="+bal);
			}
		}
}

class InnerClass{
	public static void main(String... args){
		BankAcc ba= new BankAcc(30000);
		ba.contact(12);
	}
}