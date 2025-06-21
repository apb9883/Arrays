import java.util.Scanner;

class RotateArraybyK1{

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

    public void reverse(int []array, int i, int j){

         while(i<j){
             swap(array, i,j);
             i++;
             j--;
         }
    }

    public void rotateByK(int[] array, int k){
        int n= array.length;
        k=k%n;
        reverse(array, 0, n-k-1);
        reverse(array, n-k, n-1);
        reverse(array, 0, n-1);
    }
}

public class ArrayEx29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        int k= sc.nextInt();
        RotateArraybyK1 rk=new RotateArraybyK1();
        rk.rotateByK(array, k);
        rk.printArray(array);
    }
}
