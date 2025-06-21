import java.util.Scanner;

class SortOsand1s{

    public void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

     public void sort(int[] array){
         int n= array.length;
         int zeroes=0;

         for(int i=0; i<n; i++){
             if(array[i]==0){
                 zeroes++;
             }
         }

         for(int i=0; i<n; i++){
             if(i<zeroes){
                 array[i]=0;
             }
             else{
                 array[i]=1;
             }
         }
     }
}

public class ArrayEx31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];

        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        SortOsand1s so=new SortOsand1s();
        so.sort(array);
        so.printArray(array);
    }
}
