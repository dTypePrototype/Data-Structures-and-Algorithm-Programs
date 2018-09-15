import java.io.*;
class Panagrams{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		boolean freq[]=new boolean[26];
		String st=str.toUpperCase();
		for(int i=0;i<st.length();i++){
			char ch=st.charAt(i);
			if(ch>=65&&ch<=90){
				freq[(int)(ch)-65]=true;
			}
		}
		int f=0;
		for(int i=0;i<freq.length;i++){
			if(freq[i]==false){
				f=1;
				break;
			}
		}
		if(f==1){
			System.out.println("Not Panagram");
		}
		else{
			System.out.println("Panagram");
		}
	}
}