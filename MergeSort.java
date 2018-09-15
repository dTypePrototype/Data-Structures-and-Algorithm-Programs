import java.io.*;
class MergeSort{
  public static void merge(int arr[],int low, int mid, int high){
    int n1= mid-low+1;
    int n2= high-mid;
    int L[]=new int[n1];
    int R[]=new int[n2];
    for(int i=0;i<n1;i++){
      L[i]=arr[i+low];
    }
    for(int j=0;j<n2;j++){
      R[j]=arr[j+mid+1];
    }
    int i=0,j=0;
    int k=low;
    while(i<n1&&j<n2){
      if(L[i]<=R[j]){
        arr[k]=L[i];
        i++;
      }
      else{
        arr[k]=R[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k]=L[i];
      i++;
      k++;
    }
    while(j<n2){
      arr[k]=R[j];
      j++;
      k++;
    }
  }
  public static void sortMerge(int arr[], int low, int high){
    if(low<high){
      int mid=(low+high)/2;
      sortMerge(arr,low,mid);
      sortMerge(arr,mid+1,high);
      merge(arr,low,mid,high);
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
    sortMerge(arr,0,N-1);
    for(int i=0;i<N;i++){
      System.out.print(arr[i]+" ");
    }
  }
}
