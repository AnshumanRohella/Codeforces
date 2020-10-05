import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF176A {
    public static void main(String... args){
        FastScanner fc = new FastScanner();
        int n = fc.nextInt();
        int m = fc.nextInt();
        int k = fc.nextInt();

        int[][] arr = new int[n*m][3];
        
        for(int i=0;i<(n*m);i += m){

            System.out.println(fc.next());
        
            for(int j=0;j<m;j++){
                arr[i+j][0] = fc.nextInt();
                arr[i+j][1] = fc.nextInt();
                arr[i+j][2] = fc.nextInt();
                System.out.println(Arrays.toString(arr[i+j]));

            }
            System.out.println("------");

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
                } catch (IOException e) {
                    System.out.println(st);
                }
        return st.nextToken();
    }
		
    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }
}
