import java.util.Scanner;


class PrefixSum1{

    public void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public int[] sum(int [] array){
             int n= array.length;
             for(int i=1; i<n; i++){
                 array[i]=array[i-1]+array[i];
             }
             return array;
    }
}


public class ArrayEx36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]=sc.nextInt();
        }

        PrefixSum1 ps=new PrefixSum1();
        int[]array1=ps.sum(array);
        ps.printArray(array1);
    }
}
