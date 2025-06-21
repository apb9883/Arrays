import java.util.Scanner;

class FindUnique{
    public int unique(int[] array){
        int n= array.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(array[i]==array[j]){
                    array[i]=-1;
                    array[j]=-1;
                }
            }
        }
        int ans=-1;
        for(int i=0; i<n; i++){
            if(array[i]>0){
                ans=array[i];
            }
        }
        return ans;
    }
}

public class ArrayEx21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        FindUnique fu=new FindUnique();
        System.out.println(fu.unique(array));
    }
}
