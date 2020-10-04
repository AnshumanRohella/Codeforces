import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF160A {
    public static void main(String... args){
        FastScanner sc = new FastScanner();
        int coins = sc.nextInt();
        List<Integer> coinVal = new ArrayList<>();
        int sum = 0;
        for(int i=0;i<coins;i++){
            coinVal.add(sc.nextInt());
            sum += coinVal.get(coinVal.size()-1);
        }

        Collections.sort(coinVal, Collections.reverseOrder());
        int res =0;
        int temp=0;
        int idx=0;
        while(temp <= sum){
            res++;
            temp += coinVal.get(idx);
            sum -= coinVal.get(idx);
            idx++;
        }
        System.out.println(res);
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