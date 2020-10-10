import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF460A{
    public static void main(String... args){
        FastScanner fc = new FastScanner();
        int n = fc.nextInt();
        int m = fc.nextInt();
        
        int days = n;
        int prev = 0;
        int extra = days/m - prev;
        while(extra != 0){
            extra = days/m - prev;
            days +=  extra;
            prev += extra;
        }
        
        System.out.println(days);
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

