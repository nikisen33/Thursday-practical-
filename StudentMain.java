import java.util.*;
class Student{
	int stuId, atten, marks;
	String stuName;
	Student(String stuName,int stuId,int atten,int marks){
		this.stuId=stuId;
		this.stuName=stuName;
		this.atten=atten;
		this.marks=marks;
		}
	
		public String toString(){
			return "Student Name:"+stuName+"\t\t "+"Student Id:"+stuId+" \t\t"+"Student Attendance:"+atten+" \t\t"+"Student Marks:"+marks;
		}
}

class StudentMain{
	public static void main(String... args){
		HashSet<Student>hs=new HashSet<>();
		Student s= new Student("Nikita",202001,89,96);
		Student s1= new Student("Nupur",202002,75,86);
		Student s2= new Student("Anu",202003,65,93);

		hs.add(s);
		hs.add(s1);
		hs.add(s2);
		for(Student stu: hs){
			System.out.println(stu);

		Iterator it= hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			}
		}
	}
}

		
	