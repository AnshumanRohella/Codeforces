import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class CF72C {
    public static void main(String... args){
        FastScanner sc = new FastScanner();
        double input = sc.nextInt();
        int oddcount =0;
        int evencount=0;

        for(int i=1;i<=Math.sqrt(input);i++){
            if(input%i == 0){
                if(i%2 == 0) evencount++;
                if(i%2 != 0) oddcount++;
                if((input/i)%2 == 0) evencount++;
                if((input/i)%2 != 0) oddcount++;
            }
        }
    
        if(evencount == oddcount) {
            System.out.println("yes");
        } else 
            System.out.println("no");
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