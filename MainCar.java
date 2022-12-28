abstract class Car{
    int regNo;
     Car(int regNo){
     this.regNo= regNo;
   }

    void fuelTank(){
	System.out.println("Fill The Tank");
	}

    abstract void brake();
}

class Maruti extends Car{
   Maruti(int regNo){
	super(regNo);
	}
   void brake(){
	System.out.println("Hydraulic braking");
  }
}

class Santro extends Car{
    Santro(int regNo){
	super(regNo);
   }
  void brake(){
  	 System.out.println("Gas braking");
   }
}

class MainCar{
	public static void main(String args[]){
	  Car c;
	  Maruti m= new Maruti(76453);
	  Santro s= new Santro(98054);
	  c=m;
	  c.fuelTank();
	  c.brake();
	  c=s;
	  c.fuelTank();
	  c.brake();
	System.out.println("Reg No. of Maruti:" +m.regNo);
	System.out.println("Reg No. of Santro:" +s.regNo);
  	}
}
	