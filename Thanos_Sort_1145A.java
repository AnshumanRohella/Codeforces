import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Thanos_Sort_1145A {
    public static void main(String... args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(getMaxSorted(arr, 0, arr.length - 1));
    }

    private static int getMaxSorted(int[] arr, int start, int end) {
        if(start>end){
            return 0;
        }
        if(start==end){
            return 1;
        }
        int mid = start + (end - start)/2;
        int left = getMaxSorted(arr, start, mid);
        int right = getMaxSorted(arr, mid + 1, end);

        if((left == (mid-start)+1) && (right == (end-(mid+1)+1) && (arr[start]<=arr[mid+1]))){
            return Integer.max((end-start)+1, Integer.max(left, right));
        } else {
            return Integer.max(left,right);

        }

    }

}