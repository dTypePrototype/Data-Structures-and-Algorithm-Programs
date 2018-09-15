import java.io.*;
class Looney{
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int arr[][]=new int [N][N];
		for(int i=0;i<N;i++)
		{
			String line[]=br.readLine().split(" ");
			for(int j=0;j<N;j++)
			{
				arr[i][j]=Integer.parseInt(line[j]);
			}
		}
		int basket=arr[0][0];
		int r=0,c=0,x=0,y=0;
		while(r!=(N-1)||c!=(N-1)){
			if(c+1<N){
				x=arr[r][c+1];
			}
			else{
				r++;
				if(arr[r][c]>basket){
					basket=arr[r][c];
				}
				continue;
			}
			if(r+1<N){
				y=arr[r+1][c];
			}
			else{
				c++;
				if(arr[r][c]>basket){
					basket=arr[r][c];
				}
				continue;
			}
			if(x<y){
				if(x>basket){
					basket=x;
				}
				c++;
			}
			if(y<x){
				if(y>basket){
					basket=y;
				}
				r++;
			}
		}
		System.out.println(basket);
	}
}