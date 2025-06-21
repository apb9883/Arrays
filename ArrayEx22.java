import java.util.Scanner;

class FindSecondMax{
    public  int maximum(int[] array){
        int mx=Integer.MIN_VALUE;
        int n= array.length;
        for(int i=0; i<n; i++){
            if(array[i]>mx){
                mx=array[i];
            }
        }
        return mx;
    }
    public int findsecMaximum(int[] array){
        int mx=maximum(array);
        for(int i=0; i< array.length; i++){
            if(array[i]==mx){
                array[i]=Integer.MIN_VALUE;
            }
        }

        int secondMax=maximum(array);
        return secondMax;
    }
}

public class ArrayEx22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];

        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        FindSecondMax fs=new FindSecondMax();
        System.out.println(fs.findsecMaximum(array));
    }

}
