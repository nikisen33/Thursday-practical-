import java.net.*;
import java.io.*;
public class MyClient{
	public static void main(String... args)throws Exception{
	Socket s= new Socket("localhost",789);
	BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader kbr= new BufferedReader(new InputStreamReader(System.in));
	DataOutputStream dos= new DataOutputStream(s.getOutputStream());
	String cStr,kStr;
		
		while(!(kStr=kbr.readLine()).equals("exit")){
		dos.writeBytes(kStr+"\n");
		cStr=br.readLine();
		System.out.println("Server information is:"+cStr);
		}
	br.close();
	s.close();
	}
}
	
	