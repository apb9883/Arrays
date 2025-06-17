import java.util.Scanner;

public class ArrayEx9 {

    static void printArray(int []array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int arr[]=new int[5];

        /*
        int n=sc.nextInt();


        System.out.println("Enter the elements");
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }
         */

        arr[0]=32;
        arr[1]=43;
        arr[2]=54;
        arr[3]=65;
        arr[4]=76;

        System.out.println("The elements are");
        printArray(arr);

        // trying to copy arr into array2

        int []array2= arr;
        System.out.println("The elements of array2 are");
        printArray(array2);

        // change some values of array2

        array2[2]=0;
        array2[4]=0;

        // original array after changing value

        System.out.println("The elements of arr are");
        printArray(arr);

        System.out.println("The elements of array2 are");
        printArray(array2);
    }
}
