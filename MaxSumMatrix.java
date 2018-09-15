import java.io.*;
import java.lang.*;
class MaxSumMatrix{
	static int N=4;
	static void printMaxSum(int arr[][],int k)
	{
		if(k>N)return;
		
		//preprocessing
		int stripSum[][]=new int[N][N];
		for(int j=0;j<N;j++){
			int sum=0;
			for(int i=0;i<k;i++){
				sum+=arr[i][j];
			}
			stripSum[0][j]=sum;
			for(int i=1;i<N-k+1;i++){
				sum+=(arr[i+k-1][j]-arr[i-1][j]);
				stripSum[i][j]=sum;
			}
		}
		int maxSum=-999;
		for(int i=0;i<N-k+1;i++){
			int sum=0;
			for(int j=0;j<k;j++){
				sum+=stripSum[i][j];
			}
			if(sum>maxSum){
				maxSum=sum;
			}
			for(int j=1;j<N-k+1;j++){
				sum+=(stripSum[i][j+k-1]-stripSum[i][j-1]);
				if(sum>maxSum){
					maxSum=sum;
				}
			}
		}
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int[][] arr={{2,-8,4,-6},
					 {7,1,-5,3},
					 {-9,7,6,5},
					 {8,3,2,-4}};
		int k=3;
		printMaxSum(arr, k);
	}
}