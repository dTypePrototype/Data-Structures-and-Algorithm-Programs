import java.io.*;
class BubbleSort{
  public static void sortBubble(int arr[], int N){
    for(int i=0;i<N;i++){
      for(int j=0;j<N-1-i;j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int i=0;i<N;i++){
      System.out.println(arr[i]+" ");
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
    sortBubble(arr,N);
  }
}
