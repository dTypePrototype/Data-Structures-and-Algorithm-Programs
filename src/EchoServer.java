import java.io.*;
import java.net.*;
public class EchoServer {
	private ServerSocket server;
	public EchoServer(int portnum) {
		try {
			server = new ServerSocket(portnum);
			System.out.println("Server Socket on port no: "+portnum);
		}
		catch(IOException err)
		{
			System.out.println(err);
		}
	}
	public void serve()
	{
		try
		{
			System.out.println("Waiting for client to connect");
			Socket client= server.accept();
			System.out.println("Connected to client");
			boolean b= true;
			while(b) 
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter pw = new PrintWriter(client.getOutputStream(),true);
				System.out.println("Communication Channels Opened");
				pw.println("Welcome to the Java Echo Server. Type 'bye' to close. ");
				String line;
				do
				{
					line= br.readLine();
					if(line !=null)
					{
						System.out.println("Recieved and sent: "+line);
						pw.println("Got: "+line);
					}
				}while(!line.trim().equalsIgnoreCase("bye"));
				b = false;
				client.close();
				br.close();
				pw.close();
			}
		}
		catch(IOException err)
		{
			System.out.println(err);
		}
	}
		public static void main(String args[])
		{
			EchoServer s = new EchoServer(9999);
			s.serve();
		}
	}

