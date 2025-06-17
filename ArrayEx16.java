import java.util.Scanner;

class IsSorted{
    public boolean sorted(int[] array){
        boolean check=true;
        for(int i=1; i< array.length; i++){
            if(array[i]<array[i-1]){
                check=false;
            }
        }
        return check;
    }
}

public class ArrayEx16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        IsSorted is=new IsSorted();
        System.out.println( is.sorted(array));
    }
}
