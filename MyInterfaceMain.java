interface MyInterface{
	int add(int a,int b);
	
	static void myInt(){
		System.out.println("Inside Static method");
		}

	static class InnerClass{
		static void display(){
		System.out.println("Inside Inner Class");
		}
	}
}

class MyInterfaceMain{
	public static void main(String... args){
		
		MyInterface.InnerClass.display();
		MyInterface mi =(a,b)->{return a+b;};
		
		System.out.println(mi.add(10,20));
		MyInterface.myInt();
	}
}
