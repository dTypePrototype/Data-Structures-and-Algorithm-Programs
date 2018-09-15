import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int alphaFreq[]=new int[26];
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            int index= (int) ch;
            System.out.println(index);
            alphaFreq[97-index]++;
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            alphaFreq[97-(int)(ch)]--;
        }
        int freq=0;
        for(int i=0;i<alphaFreq.length;i++){
            if(alphaFreq[i]!=0){
                freq++;
            }
        }
        return freq;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}