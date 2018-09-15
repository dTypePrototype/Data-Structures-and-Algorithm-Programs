import java.io.*;
import java.lang.*;
class MaxSubsetOf1{
	static int min(int a, int b, int c)
	{
		int m = a;
		if (m > b) 
			m = b;
		if (m > c) 
		m = c;
		return m;
	}
	static int maxSubarrayofOne(int arr[][], int C, int R){
		int subArray[][]=new int[C][R];
		for(int i=0;i<R;i++){
			subArray[0][i]=arr[0][i];
		}
		for(int i=0;i<C;i++){
			subArray[i][0]=arr[i][0];
		}
		for(int i=1;i<C;i++){
			for(int j=1;j<R;j++){
				if(arr[i][j]==1){
					subArray[i][j]=min(subArray[i-1][j-1],subArray[i-1][j],subArray[i][j-1])+1;
				}
				else{
					subArray[i][j]=0;
				}
			}
		}
		int maximum=0;
		for(int i=0;i<C;i++){
			for(int j=0;j<R;j++){
				if(subArray[i][j]>maximum){
					maximum=subArray[i][j];
				}
			}
		}
		return maximum;
	}
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int C= Integer.parseInt(br.readLine());
		int R= Integer.parseInt(br.readLine());
		int arr[][]=new int[C][R];
		for(int i=0;i<C;i++){
			String[] line=br.readLine().split(" ");
			for(int j=0;j<R;j++){
				arr[i][j]= Integer.parseInt(line[j]);
			}
		}
		int maxSquare= maxSubarrayofOne(arr,C,R);
		System.out.println(maxSquare);
	}
}