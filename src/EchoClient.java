import java.io.*;
import java.net.*;
public class EchoClient {
	public static void main(String args[])
	{
		try {
			Socket s = new Socket("127.0.0.1",9999);
			System.out.println("Establised Connection with Server");
			
			BufferedReader br =new BufferedReader(new InputStreamReader(s.getInputStream()));
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			System.out.println("Communication Channel Opened");
			
			BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
			String line;
			do
			{
				line= br.readLine();
				if(line!=null)
					System.out.println(line);
				line= console.readLine();
				pw.println(line);
			}while(!line.trim().equalsIgnoreCase("bye"));
			br.close();
			s.close();
			pw.close();
			console.close();
		}catch(Exception err) {
			System.out.println(err);
		}
	}
}
