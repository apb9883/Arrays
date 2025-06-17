import java.util.Scanner;

class PairSum{
    public int pairAdd(int []array, int k){
        int n= array.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]+array[j]==k){
                    ans++;
                }
            }
        }
        return ans;
    }
}

public class ArrayEx19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []array=new int[n];
        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }
        int k=sc.nextInt();

        PairSum ps=new PairSum();
        System.out.println(ps.pairAdd(array, k));
    }
}
