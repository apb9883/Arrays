import java.util.Scanner;

class CheckPrefSuff{

    static int arraySum(int []array){
        int sum=0;
        for(int i=0; i< array.length; i++){
            sum=sum+array[i];
        }
        return sum;
    }

    public boolean checkPrefixSuffix(int[] array){
        int totalSum=arraySum(array);

        int prefixSum=0;
       for(int i=0; i<array.length; i++){
           prefixSum=prefixSum+array[i];
           int suffixSum=totalSum-prefixSum;
           if(suffixSum==prefixSum){
               return true;
           }
       }
       return false;
    }
}

public class ArrayEx38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []array=new int[n];

        for(int i=0; i< array.length; i++){
            array[i]= sc.nextInt();
        }

        CheckPrefSuff cp=new CheckPrefSuff();
        System.out.println(cp.checkPrefixSuffix(array));
    }
}
