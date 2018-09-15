import java.io.*;
class LeftRotate{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String line0[]=br.readLine().split(" ");
        int n=Integer.parseInt(line0[0]);
        int d=Integer.parseInt(line0[1]);
        int a[]= new int[n];
        String line1[]=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(line1[i]);
        }
        int arr[]= new int [n];
        for(int i=0;i<n;i++)
		{
            int ni= i-d;
            if(ni<0)
            {
                ni=n+ni;
            }
            arr[ni]=a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}