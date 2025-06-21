import java.util.Scanner;

class RotateArrayByK{

    public void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int[] rotatebyk(int []array, int k){
        int n= array.length;
        k=k%n;
        int []ans=new int[n];
        int j=0;

        for(int i=n-k; i<n; i++){
            ans[j++]=array[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=array[i];
        }
        return ans;
    }
}

public class ArrayEx28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }

        int k= sc.nextInt();

        RotateArrayByK ra=new RotateArrayByK();
        int []ans=ra.rotatebyk(array, k);
        ra.printArray(ans);
    }
}
