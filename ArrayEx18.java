// Important question

import java.util.Arrays;
import java.util.Scanner;

class KthSmallestAndKthLargestElement{
   public int[] kSmallestAndLargest(int[] array, int k){
       Arrays.sort(array);
       int[] ans= {array[k], array[array.length-k]};
       return ans;
   }
}

public class ArrayEx18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        int k= sc.nextInt();

        KthSmallestAndKthLargestElement sl= new KthSmallestAndKthLargestElement();

        int[] ans= sl.kSmallestAndLargest(array, k);
        System.out.println(ans[k]);
        System.out.println(ans[ans.length-k]);

    }
}
