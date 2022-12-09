class Employee{
  int id;
  String name;
  double salary;

 	Employee(int id,String name,double salary){
	  	this.id=id;
		this.name=name;
		this.salary=salary;
		}
	Employee(){
		}
		 void display()
		  {
			System.out.println("Id=" + id +" "+ "Name=" + name +" "+ "Salary=" + salary);
		   }
}
class Employee1{
  public static void main(String args[])
	{
	    Employee em=new Employee(10,"Nikita",10000.00d);
	    Employee em1=new Employee(20,"Nupur",20000.00d);
	    Employee em2=new Employee(30,"Anu",30000.00d);

	    System.out.println("Details of employees:");
	    	em.display();
		em1.display();
		em2.display();
       }
}