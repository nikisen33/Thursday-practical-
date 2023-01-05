import java.util.*;
class Employee implements Comparator<Employee>{
	int empId;
	String name;
	double sal;
	Employee(){
		}
	Employee(int empId,String name,double sal){
		this.empId=empId;
		this.name=name;
		this.sal=sal;
		}
	public int compare(Employee e1,Employee e2){
		return e2.empId-e1.empId;
		}

	public String toString(){
		return "Employee Id="+empId+"\t\t"+"Employee Name="+name+"\t\t"+"Employee Salary="+sal;
	}
}

class MainEmp{
	public static void main(String... args){
		Employee e1= new Employee(7890,"Akash",56000.00);
		Employee e2= new Employee(3456,"Ashish",67000.00);
		Employee e3= new Employee(9432,"viraj",46000.00);
		Employee e4= new Employee(1679,"Himanshu",30000.00);
		Employee e5= new Employee(2975,"Ravi",45000.00);

		ArrayList<Employee>alist= new ArrayList<Employee>();
			alist.add(e1);
			alist.add(e2);
			alist.add(e3);
			alist.add(e4);
			alist.add(e5);
		
		Collections.sort(alist,new Employee());
		Iterator it=alist.iterator();
			while(it.hasNext()){
			System.out.println(it.next());
		}
		
		ListIterator<Employee> lis= alist.listIterator();
		while(lis.hasNext()){
			System.out.println(lis.next());
		}
		while(lis.hasPrevious()){
			System.out.println(lis.previous());
		}
	}
}
		