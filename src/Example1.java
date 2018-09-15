import java.io.*;
import java.net.*;
public class Example1 {
	private ServerSocket server;
	public Example1(int portnum){
		try{
			server= new ServerSocket(portnum);
			System.out.println("Server Socket on port no: " +portnum);
		}
		catch(IOException err)
		{
			System.out.println(err);
		}
	}
	public void serve()
	{
		try{
			System.out.println("Waiting for Client");
			Socket client =server.accept();
			System.out.println("Connected to Client");
			boolean b= true;
			while(b){
				BufferedReader br= new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw= new PrintWriter(client.getOutputStream(),true);
				
			}
		}
	}
}