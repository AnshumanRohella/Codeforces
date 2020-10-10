
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;


public class CF337A {
    public static void main(String... args){
        FastScanner fc = new FastScanner();
        int n=fc.nextInt();
        int m=fc.nextInt();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            arr[i] =fc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        while(right < arr.length){
            min = Integer.min(arr[right]-arr[left], min);
            left++;right++;

        }

        System.out.println(min);
    }
}

class FastScanner {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st=new StringTokenizer("");
    String next() {
        while (!st.hasMoreTokens())
            try { 
                st=new StringTokenizer(br.readLine());				               
                } catch (IOException e) {}
        return st.nextToken();
    }
		
    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
}