import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class CF318A {

    public static void main(String... args){
        FastScanner fc = new FastScanner();
        long n = fc.nextLong();
        long mid = n/2;
        if(n%2 != 0){
            mid++;
        }
        long k = fc.nextLong();
        if(k <= mid){
            // needs odd
            System.out.println(2*k-1);
        } else {
            System.out.println(2*(k-mid));
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