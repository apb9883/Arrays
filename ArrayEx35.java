import java.util.Scanner;

class PrefixSum{

    public void printArray(int[] array){
      for(int i=0; i< array.length; i++){
          System.out.print(array[i]+" ");
      }
        System.out.println();
    }

    public int[] sum(int []array){
        int n= array.length;
        int prefSum[]=new int[n];
        prefSum[0]=array[0];
        for(int i=1; i<n; i++){
            prefSum[i]=prefSum[i-1]+array[i];
        }
        return prefSum;
    }
}

public class ArrayEx35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        PrefixSum ps=new PrefixSum();
        int []prefixadd=ps.sum(array);
        ps.printArray(prefixadd);
    }
}
