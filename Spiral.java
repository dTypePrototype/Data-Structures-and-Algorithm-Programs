import java.io.*;
class Spiral{
	public static void spiralArray(int arr[][], int m, int n){
		int spiral[]=new int[m*n];
		int p=0;
		int left=0;
		int right=m-1;
		int top=0;
		int bottom=n-1;
		while(true){
			for(int i=left;i<=right;i++){
				spiral[p++]=arr[top][i];
			}
			top++;
			for(int i=top;i<=bottom;i++){
				spiral[p++]=arr[i][right];
			}
			right--;
			for(int i=right;i>=left;i--){
				spiral[p++]=arr[bottom][i];
			}
			bottom--;
			for(int i=bottom;i>=top;i--){
				spiral[p++]=arr[i][left];
			}
			left++;
			if(left>=right){
				break;
			}
			if(top>=bottom){
				break;
			}
		}
		for(int i=0;i<p;i++){
			System.out.print(spiral[i]+" ");
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int m=Integer.parseInt(br.readLine());
		int arr[][]=new int [n][m];
		for(int i=0;i<n;i++){
			String line[]=br.readLine().split(" ");
			for(int j=0;j<m;j++){
				arr[i][j]=Integer.parseInt(line[j]);
			}
		}
		spiralArray(arr,m,n);
	}
}