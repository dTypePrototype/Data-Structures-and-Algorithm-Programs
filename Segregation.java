import java.io.*;
class Segregation{
	public static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String args[])throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int a[]={1,1,0,0,1,0,1,1,0,1,0,0};
		int l=0;
		printArray(a);
		int r=a.length-1;
		while(l<=r){
			if(a[l]==1&& a[r]==1){
				r--;
			}
			else if(a[l]==1&& a[r]==0){
				int temp=a[l];
				a[l]=a[r];
				a[r]=temp;
				l++;
				r--;
			}
			else if(a[l]==0&&a[r]==0){
				l++;
			}
			else if(a[l]==0&&a[r]==1){
				l++;
				r--;
			}
		}
		printArray(a);	
	}
}