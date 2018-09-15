import java.net.*;
import java.io.*;
import java.util.*;
public class HttpURLDemo {
	public static void main(String args[]) throws Exception{
		URL hp = new URL("http://google.com");
		HttpURLConnection hpCon= (HttpURLConnection) hp.openConnection();
		System.out.println("Request method is "+hpCon.getRequestMethod());
		System.out.println("Response code is "+hpCon.getResponseCode());
	}

}
