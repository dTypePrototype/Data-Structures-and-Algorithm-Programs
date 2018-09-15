import java.io.*;
import java.lang.*;
class SquareFreeNum{
	public static int chechPerfectSquare(int n){
		double sq=Math.sqrt(n);
		double check= sq- Math.floor(sq);
		if(check==0.0)
			return 1;
		else{
			return 0;
		}
	}
	public static int checkSquareFree(int n){
		for(int i=2;i<=n;i++){
			if(n%i==0){
				if(chechPerfectSquare(i)==1){
					return 0;
				}
			}
		}
		return 1;
	}
	public static int checkPrime(int n){
		int f=0;
		for(int i=2;i<n;i++){
			if(n%i==0){
				f++;
				break;
			}
		}
		if(f==1)
			return 0;
		else
			return 1;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		int f=0;
		for(int i=2;i<=N;i++){
			if(N%i==0){
				if(checkPrime(i)==1){
					f++;
				}
				else if(checkSquareFree(i)==1){
					f++;
				}
			}
		}
		System.out.println(f);
	}
}