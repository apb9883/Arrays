import java.util.Scanner;
class ReverseArray1{

    public void swapInArray(int[] array, int i, int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public void reverse(int [] array){
        int i=0, j= array.length-1;
        while(i<j){
            swapInArray(array, i, j);
            i++;
            j--;
        }
    }

    public void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}


public class ArrayEx27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        ReverseArray1 ra=new ReverseArray1();
        ra.reverse(array);
        ra.printArray(array);
    }
}
