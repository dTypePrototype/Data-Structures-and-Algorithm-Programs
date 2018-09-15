import java.io.*;
class Soln{
    public static void main(String args[])throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String[] line =br.readLine().split(" ");
        int n=Integer.parseInt(line[0]);
        int m=Integer.parseInt(line[1]);
        System.out.println(n+" "+m);
        int arr[]=new int[n+1];
        int x=0,max=0;
        for(int i=1;i<=m;i++){
            String[] line1= br.readLine().split(" ");
            int p=Integer.parseInt(line1[0]);
            int q=Integer.parseInt(line1[1]);
            int sum=Integer.parseInt(line1[2]);
            arr[p]+=sum;
            if((q+1)<=n){
                arr[q+1]-=sum;
            }
        }
        for(int i=1;i<=n;i++){
            x=x+arr[i];
            if(max<x){
                max=x;
            }
        }
        System.out.println(max);
    }
}