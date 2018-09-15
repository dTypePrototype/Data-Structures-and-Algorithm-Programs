import java.io.*;
class Digital5{
	public static int maxSubSum(int arr[][], int N, int k){
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
		System.out.println(maxSum);
		return maxSum;
	}
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++){
			String[] line=br.readLine().split(" ");
			for(int j=0;j<N;j++){
				arr[i][j]=Integer.parseInt(line[j]);
			}
		}
		int max=-9999;
		for(int k=2;k<=N;k++){
			int x=maxSubSum(arr,N,k);
			if(x>max){
				max=x;
			}
		}
		System.out.println(max);
	}
}