import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class CF405A {
    public static void main(String... args){
        FastScanner sc = new FastScanner();
        int size = sc.nextInt();
        int[]  arr= new int[size];
        int max =0;
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
            max = Integer.max(arr[i],max);
        }

        int[] buffer = new int[max+1];

        for(Integer val: arr){
            buffer[val]++;
        }
        for(int i=1;i<buffer.length;i++){
            buffer[i]=buffer[i]+buffer[i-1];
        }
        for(int i=buffer.length-1;i>0;i--){
            buffer[i]=buffer[i-1];
        }
        buffer[0]=0;

        int[] res = new int[size];
        // System.out.println(Arrays.toString(res));
        for(int i=0;i<size;i++){
            res[buffer[arr[i]]] = arr[i];
            buffer[arr[i]]++;
        }
        // System.out.println(Arrays.toString(res));

        for(Integer val: res){
            System.out.printf("%d ",val);
        }
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


