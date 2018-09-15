import java.io.*;
class BinarySearch{
  public static int searchBin(int arr[],int low,int high, int sc){
    while(low<high){
      int mid=(low+high)/2;
      if(arr[mid]==sc){
        return mid;
      }
      else if(sc<arr[mid]){
        return searchBin(arr,low,mid-1,sc);
      }
      else{
        return searchBin(arr,mid+1,high,sc);
      }
    }
    return -1;
  }
  public static void main(String args[])throws IOException{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int N= Integer.parseInt(br.readLine());
    int arr[]=new int [N];
    String line[]=br.readLine().split(" ");
    for(int i=0;i<arr.length;i++){
      arr[i]=Integer.parseInt(line[i]);
    }
    int sc=Integer.parseInt(br.readLine());
    int res= searchBin(arr,0,N-1,sc);
    if(res==-1){
      System.out.println("Not Found");
    }
    else{
      System.out.println("Found at "+res);
    }
  }
}
