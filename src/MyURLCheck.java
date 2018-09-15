import java.net.*;
public class MyURLCheck {

	public static void main(String args[])throws Exception
	{
		URL aURL= new URL("http://csitgeu.in");
		System.out.println("protocol= "+aURL.getProtocol());
		System.out.println("authority= "+aURL.getAuthority());
		System.out.println("host= "+aURL.getHost());
		System.out.println("port= "+aURL.getPort());
		System.out.println("path= "+aURL.getPath());
		System.out.println("query= "+aURL.getQuery());
		System.out.println("filename= "+aURL.getFile());
		
	}
}
