import java.io.*;
class SumAllSubMat{
	public static void sumSubMat(int arr[][], int N, int k){
		//int sum[][]=new int[N][N];
		for(int i=0;i<N-k+1;i++){
			for(int j=0;j<N-k+1;j++){
				int sum=0;
				for(int x=i;x<i+k;x++){
					for(int y=j;y<j+k;y++){
						sum+=arr[x][y];
					}
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int k=Integer.parseInt(br.readLine());
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++){
			String[] line= br.readLine().split(" ");
			for(int j=0;j<N;j++){
				arr[i][j]=Integer.parseInt(line[j]);
			}
		}
		sumSubMat(arr,N,k);
	}
}