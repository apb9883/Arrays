import java.util.Scanner;


class SortOand1{

    public void printArray(int []array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public void swap(int []array, int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }



    public void sort(int[] array){
        int n= array.length;
        int i=0, j=n-1;
        while(i<j){
            if(array[i]==1 && array[j]==0){
                swap(array, i, j);
                i++;
                j--;
            }
            if(array[i]==0){
                i++;
            }
            if(array[j]==1){
                j--;
            }
        }
    }
}

public class ArrayEx32 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];

        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        SortOand1 so=new SortOand1();
        so.sort(array);
        so.printArray(array);
    }
}
