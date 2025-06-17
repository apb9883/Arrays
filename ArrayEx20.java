import java.util.Scanner;

class TripletSum{
    public int sumOfTriplet(int[] array, int t){
        int n= array.length;
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(array[i]+array[j]+array[k]==t){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}

public class ArrayEx20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        TripletSum ts=new TripletSum();
        System.out.println(ts.sumOfTriplet(array, k));
    }
}
