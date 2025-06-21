import java.util.Scanner;

class SortEvenAndOdd{

    public void printArray(int []array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void swap(int[]array, int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public void oddAndEven(int []array){
         int n= array.length;
         int i=0, j= n-1;
         while(i<j){
             if(array[i]%2!=0 && array[j]%2==0){
                 swap(array, i, j);
                 i++;
                 j--;
             }
             if(array[i]%2==0){
                 i++;
             }
             if(array[i]%2!=0){
                 j--;
             }
         }
    }
}


public class ArrayEx33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        SortEvenAndOdd seo=new SortEvenAndOdd();
        seo.oddAndEven(array);
        seo.printArray(array);
    }
}
