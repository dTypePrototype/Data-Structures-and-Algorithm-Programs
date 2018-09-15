import java.io.*;
class QuickSort{
  public static int partition(int arr[], int b,int e){
    int pivot=arr[e];
    int i=b-1;
    for(int j=b;j<=e-1;j++){
      if(arr[j]<pivot){
        i++;
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      }
    }
      int temp=arr[i+1];
      arr[i+1]=arr[e];
      arr[e]=temp;
      return (i+1);
  }
  public static void sortQuick(int arr[], int b, int e){
    if(b<e){
      int pi=partition(arr,b,e);
      sortQuick(arr,b,pi);
      sortQuick(arr,pi+1,e);
    }
  }
    for(int i=0;i<N;i++){
      System.out.print(arr[i]+" ");
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
    sortQuick(arr,0,N-1);
    for(int i=0;i<N;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
