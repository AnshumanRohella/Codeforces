import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF208A {
    public static void main(String... args){
        String mix = "WUB";
        FastScanner fc = new FastScanner();
        String song = fc.next();
        StringBuffer bf = new StringBuffer();
        int left = 0;
        int right = mix.length();
        while(left < song.length()){
            if(right >= song.length()){
                right = song.length();
            }
            if(song.substring(left,right).equals(mix)){
                if(bf.toString().length() != 0){
                    bf.append(" ");
                }
                left = right;
                right += mix.length();
            } else {
                bf.append(song.charAt(left));
                left++;
                right++;
            }
        }
        System.out.println(bf.toString());
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