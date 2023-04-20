import java.util.Arrays;

public class lab9b {
    public static int[] addOne(int [] arr){
        for (int i=0; i<arr.length; i++) {
            arr[i]++;
        }
        return arr;
    }
    public static void main(String [] args) {
        int [] arr= {1,2,3,4,5};
        addOne(arr);
        System.out.println(Arrays.toString(arr));
    }
}
