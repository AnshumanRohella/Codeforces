
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF580A {
    public static void main(String... args){
        FastScanner sc = new FastScanner();
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        if(size == 1){
            System.out.println(1);
            return;
        }
        int max = 1;
        int idx = 1;
        int temp = 1;
        for(int i =idx;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){
                temp++;
                max = Integer.max(max, temp);
            } else {
                temp = 1;
            }
        }

        System.out.println(max);;

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