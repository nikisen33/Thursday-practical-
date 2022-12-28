abstract class Bus{
 	double rate;
	Bus(double rate){
		this.rate=rate;
	}
	public void show(){
		System.out.println("Hi, You are in abstract class!!!");
		}
	public abstract void seat(String seattype);
	public abstract void acOrNonAc(String acNonac);
}

class PrivateBus extends Bus{
	
	PrivateBus(double rate){
		super(rate);
	System.out.println("RATE:" +rate);
	}
	
	public void seat(String seattype){
		System.out.println("SEAT TYPE:" +seattype);
		}

	public void acOrNonAc(String acNonac){
		System.out.println("AIR CONDITIONED:" +acNonac);
	}
	
}

class PublicBus extends Bus{
	PublicBus(double rate){
		super(rate);
	System.out.println("RATE:" +rate);
	}
	
	public void seat(String seattype){
		System.out.println("SEAT TYPE:" +seattype);
		}

	public void acOrNonAc(String acNonac){
		System.out.println("AIR CONDITIONED:" +acNonac);
	}
	
}

class BusMain{
	public static void main(String... args){
		Bus b;
		PrivateBus pvb= new PrivateBus(100);
		
		b= pvb;
		pvb.show();
		pvb.seat("sleeper");
		pvb.acOrNonAc("Non-Ac");

		PublicBus pb= new PublicBus(200);
		b= pb;
		pb.show();
		pb.seat("Non-sleeper");
		pb.acOrNonAc("Ac");
	}
}