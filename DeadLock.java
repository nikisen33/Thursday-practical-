class A{
	public void display(){
		System.out.println("Hi,i'm in class A!!!");
	}
}

class B{
	public void show(){
		System.out.println("Hi,i'm in class B!!!");
	}
}

class One implements Runnable{
	A a;
	B b;
	One(A a,B b){
	this.a=a;
	this.b=b;
	}
	public void run(){
		synchronized(a){
		a.display();
		synchronized(b){
		b.show();
		}
	     }
	}
}

class Two implements Runnable{
	A a;
	B b;
	Two(A a,B b){
	this.a=a;
	this.b=b;
	}
	public void run(){
		synchronized(b){
		b.show();
		synchronized(a){
		a.display();
		}
	     }
	}
}

public class DeadLock{
	public static void main(String... args){
		A a= new A();
		B b= new B();
		One o=new One(a,b);
		Two t=new Two(a,b);
		Thread t1= new Thread(o);
		Thread t2= new Thread(t);
		t1.start();
		t2.start();
	}
}
		