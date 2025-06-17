import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the elements");
        for(int i=0; i< arr.length; i++){
            arr[i]= sc.nextInt();
        }

        System.out.println("The elements are");
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
