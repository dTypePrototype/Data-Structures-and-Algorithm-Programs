import java.net.*;
import java.io.*;
public class google {
	public static void main(String args[])throws Exception
	{
		URL address= new URL("http://www.google.com");
		BufferedReader br= new BufferedReader(new InputStreamReader(address.openStream()));
		String inputLine;
		while((inputLine= br.readLine())!=null)
			System.out.println(inputLine);
		br.close();
		
		
	}

}
