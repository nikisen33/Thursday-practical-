class Theater implements Runnable{
	String str;
	Theater(String str){
	this.str=str;
	
	}
	
	public synchronized void run(){
		for(int i=1;i<=20;i++){
			System.out.println(str+":"+i);
			try{
			Thread.sleep(1000);
			}
			catch(InterruptedException ie){
			System.out.println(ie.getMessage());
			}
		}
	System.out.println("House full");
	}
}

class MainTheater{
	public static void main(String... args){
	Theater t1= new Theater("cut the ticket");
	Theater t2= new Theater("show your seat no.");
	
	Thread t3=new Thread(t1);
	Thread t4=new Thread(t2);
		
	t3.start();
	t4.start();
	}
}