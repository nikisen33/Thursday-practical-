class MyException extends Exception{
	MyException(String str){
		super(str);
	}
	static int stuId[]={10201,10202,10203,10204,10205};
	static String stuName[]={"Nikita","Nupur","Anu","Yukta","Yuvika"};
	static float stuAvg[]={67.5f,34.8f,56.9f,64.2f,89.5f};
}

class MainMyExcep{
	public static void main(String... args){
		System.out.println("Student Id"+"\t"+"Student Name"+"\t"+"Student Average");
		try{
		for(int i=0;i<MyException.stuId.length;i++){
		System.out.println(MyException.stuId[i]+"\t\t"+MyException.stuName[i]+"\t\t "+MyException.stuAvg[i]);

			if(MyException.stuAvg[i]<40){
				throw new MyException(MyException.stuName[i]+" "+"Average less than 40");
				}
			}
		}
		catch(MyException me){
			System.out.println(me.getMessage());
			}
		}
}