//This is The Coding Area
import java.io.*;
class bacteria{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int t, n,m,,ji,jj,ki,kj,gen;
    t=Integer.parseInt(br.readLine());
    while(t--)
    {
      m= Integer.parseInt(br.readLine());
      n= Integer.parseInt(br.readLine());
      int arr[][]=new int[m][n];
      int res[][]=new int[n][m];
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          arr[i][j]=Integer.parseInt(br.readLine());
        }
      }
      ji= Integer.parseInt(br.readLine());
      jj= Integer.parseInt(br.readLine());
      ki= Integer.parseInt(br.readLine());
      kj= Integer.parseInt(br.readLine());
      gen= Integer.parseInt(br.readLine());
      for(int k=0;k<gen;k++){
        for(int i=0;i<m;i++)
      	{
          for(int j=0;j<n;j++)
            {
            	         	int totalNeighbours=0;
          	if(i-1>=0 && j-1>=0 && arr[i-1][j-1]==1)
            totalNeighbours++;
          if(i-1>=0 && arr[i-1][j]==1)
            totalNeighbours++;
          if(j-1>=0 && arr[i][j-1]==1)
            totalNeighbours++;
          if(i+1<m &&  arr[i+1][j]==1)
			totalNeighbours++;
          if(i+1<m && j-1>=0 && arr[i+1][j-1]==1)
			totalNeighbours++;
          if(i+1<m && j+1<n && arr[i+1][j+1]==1)
			totalNeighbours++;
          if(j+1<n && arr[i][j+1]==1)
            totalNeighbours++;
          if(i-1>=0 && j+1<n && arr[i-1][j+1]==1)
            totalNeighbours++;
          if(arr[i][j]==0){
            if(totalNeighbours>=ki&&totalNeighbours<=kj)
              res[i][j]=1;
          }
          if(arr[i][j]==1){
            if(totalNeighbours>=ji&&totalNeighbours<=jj)
              res[i][j]=1;
          }
        }
      }
        
    }
}