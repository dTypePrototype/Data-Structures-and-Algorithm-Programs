import java.io.*;
class Example{
	public static void maxSumMatrix(int arr[][], int N, int M, int k){
		int stripSum[][]=new int [N][M];
		for(int j=0;j<M;j++){
			int sum=0;
			for(int i=0;i<k;i++){
				sum+=arr[i][j];
			}
			stripSum[0][j]=sum;
			for(int i=1;i<N-k+1;i++ ){
				sum+=arr[i+k-1][j]-arr[i-1][j];
				stripSum[i][j]=sum;
			}
		}
		int max=-9999;
		int ipos=0;
		int jpos=0;
		for(int i=0;i<N-k+1;i++){
			int sum=0;
			for(int j=0;j<k;j++){
				sum+=stripSum[i][j];
			}
			if(sum>max){
				max=sum;
				ipos=i;
				jpos=0;
			}
			for(int j=1;j<M-k+1;j++){
				sum+=stripSum[i][j+k-1]-stripSum[i][j-1];
				if(sum>max){
				max=sum;
				ipos=i;
				jpos=j;
				}
			}
			
		}
		System.out.println("ipos= "+ipos);
		System.out.println("ipos= "+jpos);
		System.out.println(max);
		
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int M=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		int arr[][]=new int[N][M];
		for(int i=0;i<N;i++){
			String line[]=br.readLine().split(" ");
			for(int j=0;j<M;j++){
				arr[i][j]=Integer.parseInt(line[j]);
				
			}
		}
		maxSumMatrix(arr, N, M,k);
	}
}