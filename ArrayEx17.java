// Important question

import java.util.Arrays;
import java.util.Scanner;

class SmallestAndLargestNumber{
   public int[] largestAndSmallest(int [] arr){
    Arrays.sort(arr);
    int [] ans={arr[0], arr[arr.length-1]};
    return ans;
   }
}

public class ArrayEx17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        SmallestAndLargestNumber sl=new SmallestAndLargestNumber();
        int []ans =sl.largestAndSmallest(array);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
