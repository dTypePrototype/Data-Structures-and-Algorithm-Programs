import java.io.*;
class InsertionSort{
  public static void sortInsertion(int arr[], int n){
    int i=0,j=0,key=0;
    for(i=1;i<n;i++){
      key=arr[i];
      j=i-1;
      while(j>0&&arr[j]>key){
        arr[j+1]=arr[j];
        j=j-1;
      }
      arr[j+1]=key;
    }
  }
  public static void main(String args[])throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int N=Integer.parseInt(br.readLine());
    int arr[]=new int[N];
    String line[]= br.readLine().split(" ");
    for(int i=0;i<N;i++){
      arr[i]=Integer.parseInt(line[i]);
    }
    sortInsertion(arr,N);
    for(int i=0;i<N;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
