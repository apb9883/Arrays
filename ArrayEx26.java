import java.util.Scanner;

class ReverseArray{
    public int[] reverse(int []array){
        int n= array.length;
        int ans[]=new int[n];

        int j=0;
        for(int i=n-1; i>=0; i--){
            ans[j++]=array[i];
        }
        return ans;
    }
    public void printArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}



public class ArrayEx26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        ReverseArray ra=new ReverseArray();
        int []ans=ra.reverse(array);
        ra.printArray(ans);
    }
}
