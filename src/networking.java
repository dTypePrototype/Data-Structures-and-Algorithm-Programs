import java.net.*;
public class networking {
	public static void main(String args[])throws Exception
	{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		address= InetAddress.getByName("www.google.com");
		System.out.println(address);
		InetAddress SW[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<SW.length;i++)
			System.out.println(SW[i]);
	}
}
