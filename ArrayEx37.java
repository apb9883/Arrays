import java.util.Scanner;

class RangeSum {

    public int[] sum(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            array[i] = array[i - 1] + array[i];
        }
        return array;
    }
}

public class ArrayEx37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n+1];
        for(int i=1; i<= n; i++){
            array[i]=sc.nextInt();
        }

        RangeSum rs=new RangeSum();
        int []prefSum=rs.sum(array);
        System.out.println("Enter the number of Queries" );
        int k=sc.nextInt();

        while(k-- >0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans= prefSum[r]-prefSum[l-1];
            System.out.println(ans);
        }
    }
}
