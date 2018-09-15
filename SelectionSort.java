import java.io.*;
class SelectionSort{
  public static void sortSelection(int arr[], int N){
    int minpos=0;
    for(int i=0;i<N;i++){
      minpos=i;
      for(int j=i+1;j<N;j++){
        if(arr[j]<arr[minpos]){
          minpos=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[minpos];
      arr[minpos]=temp;
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
    sortSelection(arr,N);
  }
}
