class Person{
  private double height, weight;
  private int age; 
  private String name;
  public void setH(double height){
   this.height= height;
   }
  public void setW(double weight){
    this.weight= weight;
   }
  public void setAge(int age){
    this.age=age;
   }
  public void setName(String name){
    this.name=name;
   }

  public double getH(){
   return height;
  }
  public double getW(){
    return weight;
   }
  public int getAge(){
    return age;
  }
  public String getName(){
   return name;
  }
}

class Rahul extends Person{
   	String Gender;
	public void display(){
	System.out.println("Name :" +getName());
	System.out.println("Age :" +getAge());
	System.out.println("Height :" +getH());
	System.out.println("Weight :" +getW());
	System.out.println("Gender :" +Gender);
	}
}

class MajorMinor{
	public static void main(String args[]){
	 Rahul r= new Rahul();
	r.setName("Rahul");
	r.setAge(28);
	r.setH(5.56d);
	r.setW(72.8d);
	r.Gender= "Male";
	r.display();
	}
}