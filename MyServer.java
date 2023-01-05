import java.net.*;
import java.io.*;
public class MyServer{
	public static void main(String... args)throws Exception{
	ServerSocket ss= new ServerSocket(789);
	Socket s= ss.accept();
	System.out.println("Connection Established....");
	PrintStream ps= new PrintStream(s.getOutputStream());
	BufferedReader brcli= new BufferedReader(new InputStreamReader(s.getInputStream()));
	BufferedReader kbinp= new BufferedReader(new InputStreamReader(System.in));
	while(true){
		String cliStr,kbStr;
		while((cliStr=brcli.readLine())!=null){
		System.out.println(cliStr);
		kbStr=kbinp.readLine();
		ps.println(kbStr);
		}
	ps.close();
	ss.close();
	s.close();
	System.exit(0);
	}
      }
}
	
	