
import java.util.Arrays;

public class Reverse{
    public static void main(String[] args) {
        int[] abc = {1,2,3,4,5,6};
        back(abc);
        System.out.println(Arrays.toString(abc));
    }
    static void back(int[] xyz){
        int start = 0;
        int end = xyz.length-1;
        while (start< end) {
            swap(xyz,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int a,int b ){
        int temp = arr[a];
        arr [a] = arr[b];
        arr[b] =temp;

    }
}
